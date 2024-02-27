package bs450.bankaccount.connect4;

public enum Piece {
    RED,
    YELLOW;

    public String toString() {
        return this == RED ? "Red" : "Yellow";
    }
}
