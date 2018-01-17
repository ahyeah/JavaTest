public class BaseMemory {
    public static void main(String[] args) {
        Integer a= new Integer(5);
        Integer c= Integer.valueOf(5);
        int b=5;
        System.out.println(b==a);

        //System.out.println(b== Integer.valueOf(5));
        int a1=5;
        int b1=a1;
         b1=4;
        System.out.println(a1==b1);
    }

}
