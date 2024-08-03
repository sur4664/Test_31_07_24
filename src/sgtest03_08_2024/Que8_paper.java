package sgtest03_08_2024;
// can we do overload in static methods , describe it?
class  Kingdom{
    static void king(String name){
        System.out.println(" king name is :"+ name);
    }
    static void King (String email,int phonenum){
        System.out.println(" email is "+ email);
        System.out.println("phone number is :"+phonenum);
    }
    static void King( int noofcities,String minister,String rani){
        System.out.println("no of cities "+ 5);
        System.out.println(" ministername is "+ minister);
        System.out.println(" rani is"+ rani);
    }
}
public class Que8_paper {
    public static void main(String[] args) {
        Kingdom.king("Raja raviverma");
        Kingdom.King("raj@123",9889798);
        Kingdom.King(10,"Tenalirama","kavitha");

    }
}
