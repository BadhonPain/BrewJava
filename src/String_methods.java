public class String_methods {
    public static void main(String[] args) {
        String name = "Badhon Pain";
        int length = name.length();
        char ch = name.charAt(3);
        int index = name.indexOf('B');
        int lastIndex = name.lastIndexOf('n');
        name = name.toLowerCase();
        name = name.toUpperCase();

        name = name.trim();// remove all the spaces from the string
        name = name.replace('n', 't');// replace all the n with t

        if (name.isEmpty()) {
            System.out.println("Name is not registered yer");
        } else System.out.println("Your name is: " + name);

        if (name.equals("Badhon")) {
            System.out.println("Name Matches !!");
        } else System.out.println("Doesn't match");

    }
}
