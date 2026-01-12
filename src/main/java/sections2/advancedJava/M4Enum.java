package sections2.advancedJava;

enum Status{
    Running, pending, success, failed;
}
public class M4Enum {
    public static void main(String[] args) {
         int i =5;
        Status[] ss = Status.values();
       /* Status s = Status.Running;
        System.out.println(s.ordinal());*/
        System.out.println("================");
        for (Status sts:  ss){
            System.out.println(sts + " : " +sts.ordinal() );
        }
    }

}
