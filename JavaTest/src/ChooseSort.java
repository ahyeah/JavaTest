public class ChooseSort {
    //选择排序
public static void main(String[]args){
    int[] a={9,8,2,6,5,7};
    chooSort(a);
    for(int ag:a){
        System.out.println(ag);
    }
}

    public static void chooSort(int[]a){
int min=0;
for(int out=0;out<a.length-1;out++){
    min=out;
    for(int i=out+1;i<a.length;i++){
        if(a[min]>a[i]){
            min=i;
        }
    }
    int tem=a[min];
    a[min]=a[out];
    a[out]=tem;
}


    }

}
