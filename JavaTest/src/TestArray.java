public class TestArray {

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
