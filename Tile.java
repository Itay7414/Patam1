package test;


public class Tile {
    final public int value;
    final public char letter;

    private Tile(char letter) {
        this.letter = letter;
        this.value = getValueFromLetter(letter);
    }

    private int getValueFromLetter(char letter) {
        switch (letter) {
            case 'A', 'E', 'I', 'L', 'N', 'O', 'R', 'S', 'T', 'U':
                return 1;
            case 'D', 'G':
                return 2;
            case 'B', 'C', 'M', 'P':
                return 3;
            case 'F', 'H', 'V', 'W', 'Y':
                return 4;
            case 'K':
                return 5;
            case 'J', 'X':
                return 10;
            case 'Q', 'Z':
                return 10;
            default:
                return 0; // or any other default value you want
        }
    }
    public class Bag {
        int numOfTiles[];
        Tile letters[];

        public Bag(){
            numofTiles = new int[26];
            numofTiles[0] = 1;
            numofTiles[1] = 3;
            numofTiles[2] = 3;
            numofTiles[3] = 2;
            numofTiles[4] = 1;
            numofTiles[5] = 4;
            numofTiles[6] = 2;
            numofTiles[7] = 4;
            numofTiles[8] = 1;
            numofTiles[9] = 8;
            numofTiles[10] = 5;
            numofTiles[11] = 1;
            numofTiles[12] = 3;
            numofTiles[13] = 1;
            numofTiles[14] = 1;
            numofTiles[15] = 3;
            numofTiles[16] = 10;
            numofTiles[17] = 1;
            numofTiles[18] = 1;
            numofTiles[19] = 1;
            numofTiles[20] = 1;
            numofTiles[21] = 4;
            numofTiles[22] = 4;
            numofTiles[23] = 8;
            numofTiles[24] = 4;
            numofTiles[25] = 10;

            letters = new Tile[26];
            letters[0] = new Tile('A');
            letters[1] = new Tile('B');
            letters[2] = new Tile('C');
            letters[3] = new Tile('D');
            letters[4] = new Tile('E');
            letters[5] = new Tile('F');
            letters[6] = new Tile('G');
            letters[7] = new Tile('H');
            letters[8] = new Tile('I');
            letters[9] = new Tile('J');
            letters[10] = new Tile('K');
            letters[11] = new Tile('L');
            letters[12] = new Tile('M');
            letters[13] = new Tile('N');
            letters[14] = new Tile('O');
            letters[15] = new Tile('P');
            letters[16] = new Tile('Q');
            letters[17] = new Tile('R');
            letters[18] = new Tile('S');
            letters[19] = new Tile('T');
            letters[20] = new Tile('U');
            letters[21] = new Tile('V');
            letters[22] = new Tile('W');
            letters[23] = new Tile('X');
            letters[24] = new Tile('Y');
            letters[25] = new Tile('Z');
            
        }
    }
}