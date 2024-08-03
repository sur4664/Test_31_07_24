package exam_1st_31_07_24;
// WA method which returns 1D byte boolean array?
class Bool{
    public static byte[]  tobytearray(boolean[]booleanarray){
        byte []bytearray= new byte[booleanarray.length];
        for(int i=0;i<=booleanarray.length-1;i++){
            bytearray[i]=booleanarray[i]? (byte)1:(byte) 0;
        }
        return bytearray;
        }

    }


public class ByteReturn {
    public static void main(String[] args) {
        boolean []booleanarray ={true,false,true,true};
        byte[]byteArray= Bool.tobytearray(booleanarray);
        for(byte r :byteArray){
            System.out.print(r + " ");
        }
    }
}
