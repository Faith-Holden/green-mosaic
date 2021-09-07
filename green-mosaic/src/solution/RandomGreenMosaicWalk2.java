package solution;

import javafx.scene.paint.Color;
import mosaic.*;

public class RandomGreenMosaicWalk2 {

    final static int ROWS = 80;
    final static int COLUMNS = 80;
    final static int SQUARE_SIZE = 5;

    static int currentRow;
    static int currentColumn;

    public static void main(String[] args) {
        Mosaic.open( ROWS, COLUMNS, SQUARE_SIZE, SQUARE_SIZE );
        Mosaic.setUse3DEffect(false);
        currentRow = ROWS / 2;
        currentColumn = COLUMNS / 2;
        while (true) {
            changeGreenLevel(currentRow, currentColumn);//This line was edited by HFH
            randomMove();
            Mosaic.delay(5);
        }
    }

    //--------------HFH edits----------------------------

    static void changeGreenLevel(int rowNum, int colNum) {
        int red = 0;
        int currentGreen = Mosaic.getGreen(rowNum,colNum);
        int green = currentGreen;
        if(currentGreen<=230){
            green = currentGreen+25;
        }
        int blue = 0;
        Mosaic.setColor(rowNum,colNum,red,green,blue);
    }

    //---------Part of the original RandomMosaic implementation---------------

    /**
     * Move the disturbance.
     * Precondition:   The global variables currentRow and currentColumn
     *                 are within the legal range of row and column numbers.
     * Postcondition:  currentRow or currentColumn is changed to one of the
     *                 neighboring positions in the grid -- up, down, left, or
     *                 right from the current position.  If this moves the
     *                 position outside of the grid, then it is moved to the
     *                 opposite edge of the grid.
     */
    static void randomMove() {
        int directionNum; // Randomly set to 0, 1, 2, or 3 to choose direction.
        directionNum = (int)(4*Math.random());
        switch (directionNum) {
        case 0:  // move up 
            currentRow--;
            if (currentRow < 0)
                currentRow = ROWS - 1;
            break;
        case 1:  // move right
            currentColumn++;
            if (currentColumn >= COLUMNS)
                currentColumn = 0;
            break; 
        case 2:  // move down
            currentRow ++;
            if (currentRow >= ROWS)
                currentRow = 0;
            break;
        case 3:  // move left  
            currentColumn--;
            if (currentColumn < 0)
                currentColumn = COLUMNS - 1;
            break; 
        }
    }  // end randomMove

} // end class RandomMosaicWalk2
