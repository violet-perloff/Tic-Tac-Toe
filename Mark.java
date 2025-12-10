/*
A class that holds the properties of a mark on the board of tic-tac-toe
whether it be an 'x' or an 'o'

Also holds location on board 

Author: Violet Perloff

*/

public class Mark {


    private char type;
    private Coordinates coord;

    public Mark (char type, int x, int y) {
        this.type = type;
        this.coord = new Coordinates(x, y);
    }

    public String toString () {
        String toReturn = "Type = " + this.type + " located at: " + coord.toString();
        return toReturn;

    }

    public char getType () {
        return this.type;
    }

    public Coordinates getCoord () {
        return this.coord
    }

    

    



}