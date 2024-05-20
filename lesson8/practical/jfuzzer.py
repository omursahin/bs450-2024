"""
Simple Java Fuzzer.
Code adapted from: https://jmcph4.github.io/2018/01/19/writing-a-simple-fuzzer-in-python.html
"""
import sys
import argparse
from random import randint, sample
from subprocess import run, PIPE


def run_program(program, input_string):
    """
    Runs the given program with the provided string as input.
    Returns the return value of running the program as a subprocess.
    """
    prog_args = []
    execution = run(['java', program] + prog_args, stdout=PIPE, stderr=PIPE, input=input_string.encode("utf-8"))
    return execution


def generate_string(min_length=0, max_length=sys.maxsize):
    """
    Produces an alphanumeric string with length between the given a minimum and maximum.
    Could well return binary data instead for more likelihood of 'abnormality'.
    """
    alphabet = list("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#")
    data = []

    start = min_length
    end = randint(start, max_length)
    
    for _ in range(start, end):
        data.append(sample(alphabet, 1)[0])

    return "".join(data)


def fuzzer(program, num_tests, max_length):
    tests = []    # list for storing the result of each test

    # main loop
    for i in range(num_tests):
        input = generate_string(0, max_length)  # generate input string
        execution_result = run_program(program, input)   # run name with our input
        
        # save test results to our global results list
        test_result = {"id": i, "input": input, "output": execution_result}
        tests.append(test_result)

    return tests


def print_results(tests):
    # Print summary
    for test in tests:
        print("Test #{:d}:".format(test["id"]))
        print("    IN: " + test["input"])
        result = test["output"]
        print("    OUT: {:4d}".format(result.returncode))
        if result.returncode == 0:
            print("    CONSOLE:\n    ", result.stdout.decode().replace("\n", "\n     "))
        else:
            print("    ERROR:\n    ", result.stderr.decode())


if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Run simple Java fuzzer')
    parser.add_argument('program', help='Compiled target Java program')
    parser.add_argument('num_cases', type=int, help='number of test cases to run')
    parser.add_argument('max_length', type=int, help='maximum length of each test input')
    args = parser.parse_args()
    tests = fuzzer(args.program, args.num_cases, args.max_length)
    print_results(tests)
