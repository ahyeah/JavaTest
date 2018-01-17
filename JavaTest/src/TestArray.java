import java.util.Arrays;

public class TestArray {
/*

    public static void main(String[]args ){
Person Lee=new Person("Lee",20);
        Person Mary=new Person("Mary",18);
Person[] Students=new Person[2];
        Students[0]=Lee;
        Students[1]=Mary;
        Students[0].setName("piopi");
Lee.getInfo();
Mary.getInfo();
        Students[0].getInfo();
        Students[1].getInfo();



    }
*/
//public static void main(String[]args ){
//
//    int[] OneArray=new int[5];
//    int[] OneArraya={2,3,2,4};
//    int[][] TwoArray=new int[4][];//一个长度为4的一维数组，每个位置又是一个数组{a[],a[]},a[],a[]}
//    for(int i=0;i<TwoArray.length;i++){
//        TwoArray[i]=new int[3];
//
//    }
//    for(int i=0;i<TwoArray.length;i++){
//
//        for(int j=0;j<TwoArray[0].length;j++){
//            System.out.print (TwoArray[i][j]+" ");
//        }
//        System.out.print ("\n");
//
//    }
//}

    public static void main(String args[]){
        int[] a={2,1,2,3,5,6};
        //int s=Arrays.binarySearch(a,2);
        //System.out.println(s);
Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        TestArray.outputa(a);
    }
    public static void outputa(int []a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }


}
class  Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        System.out.println("age:"+this.getAge()+"  name:"+this.getName());
    }
}
