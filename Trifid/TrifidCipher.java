package Trifid;

public class TrifidCipher {

    public static char[] encrypt(String keyword, String inputText) {
        String[] keywords = keyword.split("\\s+");
        StringBuilder keywordBuilder = new StringBuilder();
        for (String keyword1 : keywords) {
            keywordBuilder.append(keyword1);
        }
        String keyword1 = keywordBuilder.toString();
        keyword1 = keyword1.replaceAll("[^A-Z]", "");

        String alphabet = createAlphabet(keyword1);

        int a = 3;
        int b = 3;
        int c = 3;
        char kubi[][][] = new char[a][b][c];
        int index = 0;

        generateKubi(alphabet, kubi, a, b, c);

        char[] text = inputText.toCharArray();
        int[] coordinates = new int[3 * text.length];

        mapTextToCoordinates(text, kubi, coordinates);

        char[] cipher = new char[text.length];
        mapCoordinatesToCipher(coordinates, kubi, cipher);

//        System.out.println("Encrypted text: ");
//        for (char f : cipher) {
//            System.out.print(f);
//        }
        return cipher;
    }

    public static String getPolybiusCube(String keyword) {
        String[] keywords = keyword.split("\\s+");
        StringBuilder keywordBuilder = new StringBuilder();
        for (String keyword1 : keywords) {
            keywordBuilder.append(keyword1);
        }
        String keyword1 = keywordBuilder.toString();
        keyword1 = keyword1.replaceAll("[^A-Z]", "");

        String alphabet = createAlphabet(keyword1);

        int a = 3;
        int b = 3;
        int c = 3;
        char kubi[][][] = new char[a][b][c];
        int index = 0;

        generateKubi(alphabet, kubi, a, b, c);

        StringBuilder polybiusStringBuilder = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    polybiusStringBuilder.append(kubi[i][j][k]).append(" ");
                }
                polybiusStringBuilder.append("\n");
            }
            polybiusStringBuilder.append("\n");
        }
        return polybiusStringBuilder.toString();
    }

    private static String createAlphabet(String keyword) {
        String remainingAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder alphabetBuilder = new StringBuilder();
        for (char c : remainingAlphabet.toCharArray()) {
            if (!keyword.contains(String.valueOf(c))) {
                alphabetBuilder.append(c);
            }
        }
        return keyword + alphabetBuilder.toString() + "#";
    }

    private static void generateKubi(String alphabet, char[][][] kubi, int a, int b, int c) {
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
    }

    private static void mapTextToCoordinates(char[] text, char[][][] kubi, int[] coordinates) {
        int a = 3;
        int b = 3;
        int c = 3;
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
    }

    private static void mapCoordinatesToCipher(int[] coordinates, char[][][] kubi, char[] cipher) {
        int indexx = 0;
        for (int i = 0; i < coordinates.length; i += 3) {
            cipher[indexx++] = kubi[coordinates[i]][coordinates[i + 1]][coordinates[i + 2]];
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
    public static String decrypt(String keyword, String text) {
        String[] keywords = keyword.split("\\s+");
        StringBuilder keywordBuilder = new StringBuilder();
        for (String keyword1 : keywords) {
            keywordBuilder.append(keyword1);
        }

        String keyword1 = keywordBuilder.toString();
        keyword1 = keyword1.replaceAll("[^A-Z]", "");

        String alphabet = createAlphabet(keyword1);

        int a = 3;
        int b = 3;
        int c = 3;
        char kubi[][][] = new char[a][b][c];
        int index = 0;

        generateKubi(alphabet, kubi, a, b, c);

        int[] positions = findPositions(text, kubi);
        return decryptMessage(positions, kubi, text.length());
    }

    private static int[] findPositions(String inputText, char[][][] kubi) {
        int[] positions = new int[inputText.length() * 3];
        int pos = 0;
        for (int i = 0; i < inputText.length(); i++) {
            char letter = inputText.charAt(i);
            outerloop:
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    for (int z = 0; z < 3; z++) {
                        if (kubi[x][y][z] == letter) {
                            positions[pos] = x;
                            positions[pos + 1] = y;
                            positions[pos + 2] = z;
                            pos += 3;
                            break outerloop; // Dal nga cikli kur gjendet karakteri
                        }
                    }
                }
            }
        }
        return positions;
    }
    private static String decryptMessage(int[] positions, char[][][] polybiusCube, int ciphertextLength) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (int i = 0; i < ciphertextLength; i++) {
            int x = positions[i];
            int y = positions[i + ciphertextLength];
            int z = positions[i + 2 * ciphertextLength];
            decryptedMessage.append(polybiusCube[x][y][z]);
        }
        return decryptedMessage.toString();
    }
}


