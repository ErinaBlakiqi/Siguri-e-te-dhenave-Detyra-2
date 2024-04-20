import java.util.Arrays;
import java.util.Scanner;



public class ColumnarTransposition {
    public static void main(String[] args) {
        //initialize the scanner
        Scanner scanner = new Scanner(System.in);

        //Get plaintext from user
        System.out.println("Write plaintext: ");
        String plain = scanner.nextLine();

        //Get keyword from user
        System.out.println("Write keyword: ");
        String key = scanner.nextLine();

        //Encrypt text
        String ciphertext = encrypt(plain, key);
        System.out.println("Encrypted text: " + ciphertext);

    }

    public static String encrypt(String plaintext, String key) {
        //remove whitespaces, tabs from keyword
        key = key.replaceAll("\\s+", "");
        //calculate rows
        int rows = (plaintext.length() + key.length() -1) / key.length();

        //create the matrix that will hold the plaintext
        char[][] plainToMatrix = new char[rows][key.length()];
        //inicialize a pointer that will monitor the matrix while its being filled with the plaintext
        int pointer = 0;

        //fill the matrix will plaintext
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < key.length(); c++) {
                if (pointer < plaintext.length()) {
                    plainToMatrix[r][c] = plaintext.charAt(pointer++);
                } else {
                    plainToMatrix[r][c] = 'x'; //if there are fewer characters then the matrix can hold then fill with 'x'
                }
            }
        }

        //sort the keyword with Columnar Transposition rules
        char[] keySort = key.toCharArray();
        Arrays.sort(keySort);
        int[] indexSort = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            indexSort[i] = key.indexOf(keySort[i]);
        }

        //read the columns according to keyword
        StringBuilder ciphertext = new StringBuilder();
        for (int c = 0; c < key.length(); c++) {
            int col = indexSort[c];
            for (int r = 0; r < rows; r++) {
                ciphertext.append(plainToMatrix[r][col]);
            }
        }

        //convert cipertext to string and return to main
        return ciphertext.toString();
    }
}
