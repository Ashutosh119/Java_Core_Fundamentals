package section1.corejava;

public class M5_WhileLoop {
    public static void main(String[] args) {

        int a = 1;
        while (a<=4)           //while loop
        {
            System.out.println("Hi " + a);
            int j=1;
            while (j<=3){                         //nested loop
                System.out.println("hello");
                j++;
            }
            a++;

        }

    }
}
