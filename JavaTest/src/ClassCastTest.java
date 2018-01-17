public class ClassCastTest {
    public static void main(String[] args) {
            FiClass fiClass=new FiClass();
            BaseClass baseClass=new BaseClass();


        BaseClass baseFi=new FiClass();//向上转型不需要强转
        BaseClass f2=(BaseClass)new FiClass();


      // FiClass fiBase=(FiClass) new BaseClass();//会有异常，因为父类不能直接强转为子类

        FiClass ff=(FiClass) baseFi;//没有异常，因为当该引用类型的引用是父类但是对象是子类（已经经过向上转型）,可以进行强转
        System.out.println(fiClass instanceof FiClass);
        System.out.println(baseClass instanceof BaseClass);
        System.out.println(baseClass instanceof FiClass);
        System.out.println(fiClass instanceof BaseClass);
        System.out.println(ff instanceof BaseClass);
        System.out.println(ff instanceof FiClass);


    }
}
class BaseClass{
private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {

        return num;
    }
}
class FiClass extends BaseClass{
    private String f;

    public void setF(String f) {
        this.f = f;
    }

    public String getF() {

        return f;
    }
}