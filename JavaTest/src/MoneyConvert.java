public class MoneyConvert {
    public static void main(String args[]){
MoneyConvert.change(98046.655);
    }

//零的问题没有解决20180108待解决
    public static void change(double a){
//输入一个十万以内的数，抓换为汉字类型例如99999.99，转换为玖仟玖佰玖拾玖元玖角玖分
long zheng=(long)a;
int xiaoshu=(int)((a-zheng)*100);
    String OldWord[]={"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    String Unit[]={"元","拾","佰","仟","萬"};
        String Unit_xiaoshu[]={"角","分"};
String zheng_s=String.valueOf(zheng);
String xiaoshu_s=String.valueOf(xiaoshu);
String out="";
for(int i=0;i<zheng_s.length();i++){
if(zheng_s.charAt(i)-48==0){
    out=out+"零";
}else{
    out=out+OldWord[zheng_s.charAt(i)-48]+Unit[zheng_s.length()-1-i];

}
}
        for(int i=0;i<xiaoshu_s.length();i++){
            int test=xiaoshu_s.charAt(i);
            out=out+OldWord[xiaoshu_s.charAt(i)-48]+Unit_xiaoshu[i];
        }
System.out.println(out);

    }
}
