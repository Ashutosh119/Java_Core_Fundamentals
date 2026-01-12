package sections2.advancedJava;

class A{
    public void show(){
        System.out.println("in A show");
    }
}
public class M2InnerClass {
    public static void main(String[] args) {
        A obj = new A(){

            public void show(){
                System.out.println("inner class");
            }
        };
        obj.show();
    }
}
