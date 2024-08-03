package sgtest03_08_2024;
//  there is a class ,it has 2 instance variables and 2 static variables
// wap  to eexecute them on same class constructor
class   Stockmarket{
    String exchangename;
    int capital;
    static String broker;
    static int licensenumber;

    Stockmarket(){
        this.exchangename= "NSE";
        this.capital=100;
        Stockmarket.broker="Sbi ";
        Stockmarket.licensenumber=1234;
        System.out.println(exchangename);
        System.out.println(capital);
        System.out.println(broker);
        System.out.println(licensenumber);
    }
}
public class Que7_paper {
    public static void main(String[] args) {
        Stockmarket sm = new Stockmarket();
    }
}
