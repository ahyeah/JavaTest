public class AddNo {

public static  void main(String args[]){
    System.out.println(AddNo.Add1(3,0));;
}
    public static int Add1(int num1,int num2) {
        Integer i1=new Integer(num1);
        Integer i2=new Integer(num2);
        //int[] a=null;
        return Math.addExact(i1,i2);
    }

    public static int Add2(int num1,int num2) {
  int tem=0;
               while(num2!=0){
                   tem=(num1&num2)<<1;

                   num1=num1^num2;
                    num2=tem;
               }
                return num1;

    }
}
