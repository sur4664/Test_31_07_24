package exam_1st_31_07_24;

//Que 9
class Even20_30{
    int[] tentwenty(int arr[]){
        int b[]=new int [arr.length];
        int k=0;
        for(int i =0;i<arr.length;i++){
            b[k]=arr[i];
            k++;
        }
        return b;
    }
}
public class Even {
    public static void main(String[] args) {
        Even20_30 o = new Even20_30();
        int a[] = {20,22,24,26,28,30};
        int z[] = o.tentwenty(a);
        for (int val : z) {
            System.out.println(val);
        }


    }
}

