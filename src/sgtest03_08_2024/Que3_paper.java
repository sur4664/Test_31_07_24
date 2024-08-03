package sgtest03_08_2024;
//if a class contains multiple instance blocks wap to execute all the instance blocks
class Hospital{
    {
        System.out.println(" this  the 1st instance block");
    }
    {
        System.out.println(" this  the 2nd instance block");
    }
    {
        System.out.println(" this  the 3rd instance block");
    }
}
public class Que3_paper {
    public static void main(String[] args) {
        Hospital h = new Hospital();
    }
}
