package sections2.advancedJava;

class Laptop{
    public void code(){
        System.out.println("Code .. compile.. run");
    }
}

class Developer {
    public  void devApp(Laptop lap){
        //System.out.println("write code in laptop");
        lap.code();
    }
}

public class M3Inheritance {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Developer ak = new Developer();
        ak.devApp(laptop);

    }
}
