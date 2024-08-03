package exam_1st_31_07_24;
//WAstatic method,it hasto return price of your mobile phone
class Priceofdevice{
    static int mtp(int price){
        return price;
    }
}
public class MobileDevice {
    public static void main(String[] args) {
      // Priceofdevice pm = new Priceofdevice();

           int a= Priceofdevice.mtp(10000);
        System.out.println(a);
    }
}
