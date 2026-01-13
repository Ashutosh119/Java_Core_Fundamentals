package sections2.advancedJava;

class AA{
    public void showTheDatasRecord(){
        System.out.println("In the first line");
    }
}

class BB extends  AA{
    @Override
    public void showTheDatasRecord(){
        System.out.println("In show b line");
    }

}
public class M6Annotation {
    public static void main(String[] args) {
        BB obj1 = new BB();
        obj1.showTheDatasRecord();
    }
}
