package BUET_OOPS_SLIDE.Intro;

class Myclass
{
    private int a;
    Myclass()
    {
        System.out.println("In constructor");
        a = 10;
    }

    public int getA() {
        return a;
    }
};

public class Encapsulation {
    public static void main(String[] args)
    {
        Myclass mc = new Myclass();
        System.out.println(mc.getA());
//        System.out.println("a: "+a); error, because  a is not a local variable in main. It's a private variable of Myclass

    }
}
