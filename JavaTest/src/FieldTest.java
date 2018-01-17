public class FieldTest {

    public static void main(String[]args){
        //TePerson.Check();
        new TePerson().getName();
    }


}
 class  TePerson{

private int age;
private String name;
private  static String eyes;
private static int les;

public  static void Check(int ttt){
    les=ttt;

}
     void testt(){
         eyes="0";
         this.getName();
         Check(2);
     }
     public int getAge() {
         return age;
     }

     public String getName() {
         return name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
