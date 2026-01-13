package sections2.advancedJava;

enum  Laptops{
    Apple(2000), XPS(2200), HP(1500), ThinkPad(1800);
    private  int price;

    private Laptops(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class M5EnumDemo {
    public static void main(String[] args) {
       /* Laptops lps = Laptops.Apple;
        System.out.println(lps + " : " + lps.getPrice());*/  // This will print only single laptop price

        //enhanced for loop for printing aal laptops value
        for (Laptops lp: Laptops.values()){
            System.out.println("Laptop and there price details: " + lp + " : " + lp.getPrice());
        }
    }

}
