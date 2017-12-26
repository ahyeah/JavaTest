public class FindNumsAppearOnce {
    //一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
    public static void main(String args[]) {
        int array[] = {2, 4, 4, 5, 3, 3, 9, 9};
        int num1[] = {0};
        int num2[] = {0};
        FindNumsAppearOnce.FindNumsAppearOnce(array, num1, num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }

    public static void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        ///解题思路：根据一个数与0的异或结果为本身，把所有的数进行异或，的到的是不同数的异或，根据易货 的结果的1的位置进行分组
        if (array == null || array.length < 2)
            return;
        int temp = 0;
        for (int i = 0; i < array.length; i++)
            temp ^= array[i];

        int indexOf1 = findFirstBitIs(temp);
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i], indexOf1))
                num1[0] ^= array[i];
            else
                num2[0] ^= array[i];
        }
    }

    public static int findFirstBitIs(int num) {
        int indexBit = 0;
        while (((num & 1) == 0) && (indexBit) < 8 * 4) {
            num = num >> 1;
            ++indexBit;
        }
        return indexBit;
    }

    public static boolean isBit(int num, int indexBit) {
        num = num >> indexBit;
        return (num & 1) == 1;
    }






    public static void FindNumsAppearO(int [] array,int num1[] , int num2[]){
Integer s=new Integer(6);
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
