public class Main {
    public static void main(String[] args) {
        System.out.println(sortCharacters("hEILoWoRLd"));
    }

    public static String sortCharacters(String input) {
        StringBuilder lowercaseLetters = new StringBuilder();
        StringBuilder uppercaseLetters = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (character >= 'a' && character <= 'z') {
                lowercaseLetters.append(character);
            } else if (character >= 'A' && character <= 'Z') {
                uppercaseLetters.append(character);
            }
        }

        return lowercaseLetters.toString() + uppercaseLetters.toString();
    }
}
