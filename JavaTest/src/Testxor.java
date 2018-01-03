public class Testxor {


    public static void main(String args[]){

        String s1="test";
        String s2=new String("test");
        String s4=new String("test");
        String s5="test";
        String s3="te"+"st";
        char data[] = {'t', 'e', 's','t'};
        String str = new String(data);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1==s3);
        System.out.println(s4==s2);
        System.out.println(s1==s5);

        System.out.println(s1==str);
        System.out.println(s2==str);

        switch(s1){
            case "test" : {s2=s2+s1;s2=s3+s2;}
            case "s":s2=s2+s2;
            default :s2=s2;
        }
    }


}

