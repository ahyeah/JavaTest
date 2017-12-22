public class LeftRotateString {
    public static void main(String [] args)
    {
test t=new test();
System.out.println(t.LeftRotateString("",6));
    }



}
 class test {
     public String LeftRotateString(String str, int n) {
         if(str.length() == 0){
             return str;
         }
         if (n == 0 || n % str.length() == 0  ) {
             return str;
         }
         if (n > str.length()) {

             n = n % str.length();
             String ot="";
             char s[]=str.toCharArray();
             for(int i=n;i<s.length;i++){
                 ot=ot+s[i];
             }
             for(int j=0;j<n;j++){
                 ot=ot+s[j];
             }
             return ot;

         } else {

             String ot="";
             char s[]=str.toCharArray();
             for(int i=n;i<s.length;i++){
                 ot=ot+s[i];
             }
             for(int j=0;j<n;j++){
                 ot=ot+s[j];
             }
             return ot;

         }
     }
 }


