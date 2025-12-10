/* 
A class that holds the coordinates of a specific mark, 
and cant return either the x or y based on what the 
computer needs to know

Author: Violet S. Perloff
*/
private class Coordinates {
    private int x;
    private int y;

    public Coordinates (int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String toString () {
        String toReturn = "(" + x + ", " + y + ")";
    }



}