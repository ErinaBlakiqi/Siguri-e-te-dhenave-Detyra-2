import java.util.Scanner;

public class TrifidCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the secret keyword: ");
        String inputLine = scanner.nextLine().toUpperCase();
        String[] keywords = inputLine.split("\\s+");

        StringBuilder keywordBuilder = new StringBuilder();
        for (String keyword : keywords) {
            keywordBuilder.append(keyword);
        }
        String keyword = keywordBuilder.toString();

        keyword = keyword.replaceAll("[^A-Z]", "");

        // Generate the remaining alphabet without repeating letters from the keyword
        String remainingAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (char c : keyword.toCharArray()) {
            remainingAlphabet = remainingAlphabet.replace(String.valueOf(c), "");
        }

        String alphabet = keyword + remainingAlphabet + "#";

        int a = 3;
        int b = 3;
        int c = 3;

        char kubi[][][] = new char[a][b][c];
        int index = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {

                    if (index >= alphabet.length()) {
                        index = 0;
                    }

                    char currentChar = alphabet.charAt(index);
                    while (charExists(kubi, currentChar)) {
                        index = (index + 1) % alphabet.length();
                        currentChar = alphabet.charAt(index);
                    }
                    kubi[i][j][k] = currentChar;
                    index++;
                }
            }
        }

     
        System.out.println("Enter text to encrypt: ");
        String inputText = scanner.nextLine().toUpperCase();
        inputText = inputText.replaceAll("[^A-Z]", "");

        inputText = inputText.replaceAll("\\s+", "");

        char[] text = inputText.toCharArray();
        int[] coordinates = new int[3 * text.length];

      
        for (int i = 0; i < text.length; i++) {
            char currentChar = text[i];
            for (int x = 0; x < a; x++) {
                for (int y = 0; y < b; y++) {
                    for (int z = 0; z < c; z++) {
                        if (currentChar == kubi[x][y][z]) {
                            coordinates[i] = x;
                            coordinates[i + text.length] = y;
                            coordinates[i + 2 * text.length] = z;
                        }
                    }
                }
            }
        }
         // for (int i = 0; i < a; i++) {
         //     for (int j = 0; j < b; j++) {
         //         for (int k = 0; k < c; k++) {
         //             System.out.print(kubi[i][j][k] + " ");
         //         }
         //         System.out.println();
         //     }
         //     System.out.println();
         // }


        char[] cipher = new char[text.length];
        int indexx = 0;
        for (int i = 0; i < coordinates.length; i += 3) {
            cipher[indexx++] = kubi[coordinates[i]][coordinates[i + 1]][coordinates[i + 2]];
        }


        System.out.println("Encrypted text: ");
        for (char f : cipher) {
            System.out.print(f);
        }
    }

    private static boolean charExists(char[][][] kubi, char c) {
        for (char[][] slice : kubi) {
            for (char[] row : slice) {
                for (char element : row) {
                    if (element == c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
