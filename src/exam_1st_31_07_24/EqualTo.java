package exam_1st_31_07_24;



//Wa method which returns the result of (==)operator
class OPeratorEqual{
  public static String resultofequalto(int a,int b){
        String res = " ";
        if(a==b){
            res = " both the numbers are equal" + res;
        }else {
            res =" both the numbers are not equal"+ res;
        }
        return res;
    }
}
public class EqualTo {
    public static void main(String[] args) {
        String res1=OPeratorEqual.resultofequalto(1,1);
        System.out.println(res1);
    }
}
