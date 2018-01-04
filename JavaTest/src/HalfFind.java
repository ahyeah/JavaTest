public class HalfFind {
    //冒泡排序
    public static void main(String[] args){
        int []a={6,5,2};
        find(a);
        for (int asf:a
             ) {
            System.out.println(asf);

        }
    }
    public static void find(int[]a) {
for(int out=a.length-1;out>0;out--){
    for(int in=0;in<out;in++){
        if(a[in]>a[in+1]){
            int tem=a[in];
            a[in]=a[in+1];
            a[in+1]=tem;

        }
    }
}
    }
}
