public class DExemple {

    public static void main(String[] args) {

        String helloWorld = "Hello and welcome!";
        System.out.println(truncateString("hello World !"));
    }

    public static int getMaxStringLength() {
        // FIXME imaginer qu'il s'agit d'un service externe
        return 20;
    }

    public static String truncateString(String string) {
        if (string.length() <= getMaxStringLength()) {
            return string;
        }
        return string.substring(0, getMaxStringLength());
    }

}
