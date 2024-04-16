public class StringUtils {
    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static String trim(String str) {
        return str.trim();
    }

    public static void main(String[] args) {
        // Demonstration of concat method
        String concatenated = concat("Hello, ", "World!");
        System.out.println("Concatenated string: " + concatenated);

        // Demonstration of reverse method
        String reversed = reverse("abcd");
        System.out.println("Reversed string: " + reversed);

        // Demonstration of toUpperCase method
        String upperCased = toUpperCase("hello world");
        System.out.println("Uppercased string: " + upperCased);

        // Demonstration of trim method
        String trimmed = trim("   trim me   ");
        System.out.println("Trimmed string: " + trimmed + ".");
    }
}