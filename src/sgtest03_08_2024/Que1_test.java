package sgtest03_08_2024;
// if a class contains multipke ststaic blocks how to execute them?
class Hotel{
    static
    {
        System.out.println("this is 1st static block");
    }
    static
    {
        System.out.println("this 2nd static block");
    }
    static
    {
        System.out.println("this 3rd static block");
    }
}
public class Que1_test {
    public static void main(String[] args) {
        Hotel h = new Hotel();
    }
}
