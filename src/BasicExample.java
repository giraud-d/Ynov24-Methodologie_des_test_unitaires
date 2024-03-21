
public class BasicExample {
    public static void main(String[] args) {

        String helloWorld = "Hello and welcome!";
        System.out.println(myUppercase(helloWorld));
    }

    public static String myUppercase(String input) {

        StringBuilder uppercaseString = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= 97 && currentChar <= 122) {
                uppercaseString.append((char) (currentChar - 32));
            } else {
                uppercaseString.append(currentChar);
            }
        }
        return uppercaseString.toString();
    }


}