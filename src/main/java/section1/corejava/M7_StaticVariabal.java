package section1.corejava;


class Mobile{
    String brand;
    int price;
    static  String name;    // Here i have declare name as static so its shared details with all name based obj

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}

public class M7_StaticVariabal {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price =1500;
        Mobile.name= "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price =2500;
        Mobile.name= "Smartphone";

        Mobile.name= "phone"; // here this will shared details

        obj1.show();
        obj2.show();
    }
}
