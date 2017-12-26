public class FindBitOne {
    //根据1&0=0,1&1=1求出比特位为1的位置
    public static void main(String args[]){
        System.out.println(findBit(6));
    }


    public static int findBit(int num){
        int a=0;
        int b=1;
        for(int i=0;i<32;i++){
if((num & b)==b){
    a=i;
    break;
}else{
    b= b<<1;

}
        }


        return a;
    }
}
