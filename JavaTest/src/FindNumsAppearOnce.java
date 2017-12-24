public class FindNumsAppearOnce {
    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public static void main(String args[]){
int array[]={2,2,4,5,3,3,9,9};
int num1[]={0};
int num2[]={0};
        FindNumsAppearOnce.FindNumsAppearO(array,num1,num2);
System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public static void FindNumsAppearO(int [] array,int num1[] , int num2[]){

int count =0;
        int flag=0;
for(int i=0;i<array.length;i++){
    for(int j=0;j<array.length;j++){
if(i!=j){
    if(array[i]==array[j]){
        flag=1;
    }
}


    }

    if(flag==0&&count==0){
        num1[0]=array[i];
count++;
    }
    if(flag==0&&count==1){
        num2[0]=array[i];

    }
    flag=0;

}
    }

}
