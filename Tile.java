package test;

import java.util.Arrays;
import java.util.Random;

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
    public static class Bag {
        public static Bag bag = null;
        private final int[] maxQuantites;
        public int[] quantities;
        private final Tile[] tiles;

        private Random rand;
        private int size;

        public Bag(){
            maxQuantites = new int[]{1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,1,10};
            quantities = maxQuantites.clone();
            size = Arrays.stream(maxQuantites).sum();
            rand = new Random();

            tiles = new Tile[26];
            tiles[0] = new Tile('A');
            tiles[1] = new Tile('B');
            tiles[2] = new Tile('C');
            tiles[3] = new Tile('D');
            tiles[4] = new Tile('E');
            tiles[5] = new Tile('F');
            tiles[6] = new Tile('G');
            tiles[7] = new Tile('H');
            tiles[8] = new Tile('I');
            tiles[9] = new Tile('J');
            tiles[10] = new Tile('K');
            tiles[11] = new Tile('L');
            tiles[12] = new Tile('M');
            tiles[13] = new Tile('N');
            tiles[14] = new Tile('O');
            tiles[15] = new Tile('P');
            tiles[16] = new Tile('Q');
            tiles[17] = new Tile('R');
            tiles[18] = new Tile('S');
            tiles[19] = new Tile('T');
            tiles[20] = new Tile('U');
            tiles[21] = new Tile('V');
            tiles[22] = new Tile('W');
            tiles[23] = new Tile('X');
            tiles[24] = new Tile('Y');
            tiles[25] = new Tile('Z');
        }

        public Tile getRand() {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(26); // Generate a random number between 0 and 25 (inclusive)
            } while (quantities[randomNumber] == 0); // Keep generating a new random number until a non-zero quantity is found
            quantities[randomNumber]--;
            return tiles[randomNumber];
        }

        public Tile getTile(char tile) {
            if (tile < 'A' || tile > 'Z') {
                return null; // Return null for invalid input
            }
            int index = tile - 'A';
            if (quantities[index] == 0) {
                return null;
            }
            quantities[index]--;
            return tiles[index];
        }

        public void put(Tile tile) {
            int index = tile.letter - 'A';
            if (quantities[index] < maxQuantites[index]) {
                quantities[index]++;
            }
        }
        
        public int[] getQuantities()
        {
            return quantities.clone();
        }
        public int size() {
            return this.size;
        }
        public static Bag getBag()
        {
            if (bag == null) {
                bag = new Bag();
                return bag;
            }
            return bag;
        }
    }
}
