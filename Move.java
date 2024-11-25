public class Move {

    private String player; // Player making the move
    private Position position; // Position on the board for the move
    private boolean isValid;// Whether the move is valid

    public Move(String player, Position position, boolean isValid) {
        this.player = player;
        this.position = position;
        this.isValid = isValid;
    }
    public String getPlayer() {
        return player;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isValid() {
        return isValid;
    }














}
