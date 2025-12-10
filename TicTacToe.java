public class TicTacToe {

    static final int MAX_MARKS = 9;
    public Mark playBox[3][3];
    
    



    private char checkWin (Mark mark) {
        char possibleWin = mark.getType();
        Coordinates lastCoord = mark.getCoord();
        
        //check row
        int row  = lastCoord.getY();
        for (int i = 0; i < playBox[0].length; i++) {
            if (playBox[row][i].getType() != possibleWin) {
                break;
            }
            if (i == playBox[0].length - 1) {
                return possibleWin;
            }
            
        }

        //check column
        int col  = lastCoord.getX();
        for(int i = 0; i < playBox.length; i++) {
            if (playBox[i][col].getType() != possibleWin) {
                break;
            }
            if (i == playBox[0].length - 1) {
                return possibleWin;
            }
        }
        //if in corner or center, check diagonal

        //if in corner 
        if ((lastCoord.getX() != 1 && lastCoord.getY() != 1)) {
            //if top left
            if (lastCoord.getX() == 0 && lastCoord.getY() == 0) {
                for (int i = 0; i < playBox.length; i++) {
                    if (playBox[i][i].getType() != possibleWin) {
                        break;
                    }
                    if (i == playBox[0].length - 1) {
                        return possibleWin;
                    }
                }
            }

            //if top right
            if (lastCoord.getX() == 2 && lastCoord.getY() == 0) {
                int row = 0;
                for (int i = 2; i >= 0; i--) {
                    if (playBox[row][i].getType() != possibleWin) {
                        break;
                    }
                    if (i == 0) {
                        return possibleWin;
                    }
                    row++;
                }
            }
            

            //if bottom left
            if (lastCoord.getX() == 0 && lastCoord.getY() == 2) {
                int col = 0;
                for (int i = 2; i >= 0; i--) {
                    if (playBox[i][col].getType() != possibleWin) {
                        break;
                    }
                    if (i == 0) {
                        return possibleWin;
                    }
                    col++;
                }
            }

            //if bottom right
            if (lastCoord.getX() == 2 && lastCoord.getY() == 2) {
                for (int i = 2; i >= 0; i--) {
                    if (playBox[i][i].getType() != possibleWin) {
                        break;
                    }
                    if (i == 0) {
                        return possibleWin;
                    }
                }
            }
        }
        if (lastCoord.getX() == 1 && lastCoord.getY() == 1) {
            //need to check all corners 
            if (playBox[0][0].getType() == possibleWin) {
                if (playBox[2][2].getType() == possibleWin) {
                    return possibleWin;
                }
            }
            if (playBox[2][0].getType() == possibleWin) {
                if (playBox[0][2].getType() == possibleWin) {
                    return possibleWin;
                }
            }

        }


    }

    return '\0';
}
