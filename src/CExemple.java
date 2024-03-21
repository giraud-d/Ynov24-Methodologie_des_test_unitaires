public class CExemple {

    public static void main(String[] args) {

        String helloWorld = "Hello and welcome!";
        System.out.println(truncateString("hello World !", 42));
    }

    public static String truncateString(String string, int maxLength) {
        if (string.length() <= maxLength) {
            return string;
        }
        return string.substring(0, maxLength);
    }

}
