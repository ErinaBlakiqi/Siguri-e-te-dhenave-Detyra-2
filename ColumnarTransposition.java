import java.util.Arrays;
import java.util.Scanner;



public class ColumnarTransposition {
    public static void main(String[] args) {
        //inicializojme skanerin
        Scanner scanner = new Scanner(System.in);

        //Marrim plaintext nga perdoruesi
        System.out.println("Shkruani plaintext: ");
        String plain = scanner.nextLine();

        //Marrim keyword nga perdoruesi
        System.out.println("Shkruani keyword: ");
        String key = scanner.nextLine();

        //Enkriptojme dhe e kthejme tekstin e enkriptum
        String ciphertext = encrypt(plain, key);
        System.out.println("Teksti i enkriptuar: " + ciphertext);

    }

    public static String encrypt(String plaintext, String key) {
        //largojme whitespaces, tabs etj nga keyword
        key = key.replaceAll("\\s+", "");
        //kalkulojme sa rows kemi mi pas
        int rows = (plaintext.length() + key.length() -1) / key.length();

        //krijojme matricen qe ka mi mbajt karakteret e plaintext
        char[][] plainToMatrix = new char[rows][key.length()];
        //inicializojme nje pointer me mbikqyr mbushjen e matrices me plaintext
        int pointer = 0;

        //me ane te for loop e mbushim matricen me karakteret e plain text
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < key.length(); c++) {
                if (pointer < plaintext.length()) {
                    plainToMatrix[r][c] = plaintext.charAt(pointer++);
                } else {
                    plainToMatrix[r][c] = 'x'; //nese nuk ka karaktere sa eshte matrica e mbushim me 'x'
                }
            }
        }

        //e sortojme keywordin me ane te rregullave te columnar transposition
        char[] keySort = key.toCharArray();
        Arrays.sort(keySort);
        int[] indexSort = new int[key.length()];
        for (int i = 0; i < key.length(); i++) {
            indexSort[i] = key.indexOf(keySort[i]);
        }

        //e lexon kolone per kolone sipas keyword dhe e vendosim ne string builder
        StringBuilder ciphertext = new StringBuilder();
        for (int c = 0; c < key.length(); c++) {
            int col = indexSort[c];
            for (int r = 0; r < rows; r++) {
                ciphertext.append(plainToMatrix[r][col]);
            }
        }

        //e kthejme ciphertext-in ne string the e kthejme ne main.
        return ciphertext.toString();
    }
}
