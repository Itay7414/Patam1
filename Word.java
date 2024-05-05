package test;

import java.util.Arrays;

public class Word {
    Tile tiles[];
    int row, col;
    boolean vertical; // True = vertical, False = horizontal

    public Word()
    {

    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }
    public boolean getVertical()
    {
        return this.vertical;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(tiles);
        result = prime * result + row;
        result = prime * result + col;
        result = prime * result + (vertical ? 1231 : 1237);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Word other = (Word) obj;
        if (!Arrays.equals(tiles, other.tiles))
            return false;
        if (row != other.row)
            return false;
        if (col != other.col)
            return false;
        if (vertical != other.vertical)
            return false;
        return true;
    }
    
}
