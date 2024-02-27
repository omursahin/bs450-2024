package bs450.connect4;

public class GameOverException extends RuntimeException {

    public GameOverException(Piece piece) {
        super("The game is over. " +
                (piece == null ? "It was a draw (board full)." : "The winner was " + piece));
    }
}
