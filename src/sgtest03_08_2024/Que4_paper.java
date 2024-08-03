package sgtest03_08_2024;
//A class has one instance method and one ststaic method
//wap to execute them in a ststic block
class Railways{
    void bogi(){
        System.out.println( " it is an instance method");
    }
    static void driver(){
        System.out.println(" this a static method");
    }
  static {
        Railways r = new Railways();
        r.bogi();
        Railways.driver();

    }
}
public class Que4_paper {
    public static void main(String[] args) {
        Railways r2 = new Railways();
    }
}
