public class LeftRotateString {
    public static void main(String [] args)
    {
test t=new test();
System.out.println(t.LeftRotateString("",6));
        System.out.println(t.LeftRotateString1("sdsada",21));
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

     public String LeftRotateString1(String str, int n){
         if(str.length()==0){
             return str;
         }
         if(n<=str.length()){
             StringBuilder str1=new StringBuilder(str);
             StringBuilder str2=new StringBuilder(str);
           String s1=  str1.substring(0,n);
          String s2=   str2.substring(n,str.length());

             return s2+s1;
         }else{
             n=n%str.length();
             StringBuilder str1=new StringBuilder(str);
             StringBuilder str2=new StringBuilder(str);
             String s1=  str1.substring(0,n);
             String s2=   str2.substring(n,str.length());

             return s2+s1;
         }


     }


 }


