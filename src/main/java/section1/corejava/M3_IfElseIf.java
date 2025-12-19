package section1.corejava;

public class M3_IfElseIf {
    public static void main(String[] args) {

        int a = 11;
        int b = 9;
        int c = 15;

        if (a > b && a > c)
          System.out.println(a);
        else if (b>a && b > c)
        System.out.println(b);
          else
              System.out.println(c);
    }
}
