package sgtest03_08_2024;
// Que2 : if a class conatins instance block and constructor
// wap  to execute instance block and constructor
class Restaurant{
    {
        System.out.println(" this an instance block of class Restaurant");
    }
    Restaurant(){
        System.out.println(" this is a constructor in class restaurant");

    }
}
public class Que2_paper {
    public static void main(String[] args) {
        Restaurant rst = new Restaurant();
    }
}
