package test;


public class Tile {
    final public int score;
    final public char letter;

    private Tile(char letter) {
        this.letter = letter;
        this.score = getValueFromLetter(letter);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + score;
        result = prime * result + letter;
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
        Tile other = (Tile) obj;
        if (score != other.score)
            return false;
        if (letter != other.letter)
            return false;
        return true;
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
                return 0;
        }
    }
    public class Bag {
        int numOfTiles[];
        int quantities[];
        Tile letters[];

        public Bag(){
            numOfTiles = new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,1,10};

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