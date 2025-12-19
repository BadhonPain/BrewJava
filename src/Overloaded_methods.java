public class Overloaded_methods {
    public static void main()
    {
        System.out.println(operation(3,4));
        System.out.println(operation(3,4,5));
        System.out.println(operation("Badhon"," Pain"));

    }
    static int operation(int a, int b)
    {
        return a*b;
    }
    static int operation(int a, int b, int c)
    {
        return a*b*c;
    }
    static String operation(String s1, String s2)
    {
        return s1+s2;

    }
}
