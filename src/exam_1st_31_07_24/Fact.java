package exam_1st_31_07_24;
// wam returns the factorial of a given number
class Factorial{
    public static long factor(int n){
        long res =1;
        for(int i=1;i<=n;i++){
            res*=1;
        }
        return res;
    }
}
public class Fact {
    public static void main(String[] args) {
        int number =5;
        long result = Factorial.factor(5);
        System.out.println("Factorial of the given number :"+number+"is"+result);
    }
}
