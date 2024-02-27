package bs450.connect4;

public class IllegalMoveException extends RuntimeException {

    public IllegalMoveException(String msg) {
        super(msg);
    }
}
