package exam_1st_31_07_24;
//WA static methodnit has to return brand name of your laptop
class Laptop{
    static String brd(String name){
        return name;
    }
}
public class Brand {
    public static void main(String[] args) {
         String a=Laptop.brd("lenova");
        System.out.println(a);
    }
}
