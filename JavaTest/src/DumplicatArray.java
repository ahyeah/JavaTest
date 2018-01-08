public class DumplicatArray {


public static void main(String args[]){
    int[] number=new int[0];
    int[] fa={0};
    duplicate(number,number.length,fa);
    System.out.println(fa[0]);
}
        // Parameters:
        //    numbers:     an array of integers
        //    length:      the length of array numbers
        //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
        //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
        //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
        // Return value:       true if the input is valid, and there are some duplications in the array number
        //                     otherwise false
        public static boolean duplicate(int numbers[],int length,int [] duplication) {
            if(numbers.length==0){
                return false;
            }
            int[] num=new int[numbers.length];
            for(int i=0;i<numbers.length;i++){
                num[numbers[i]]++;
            }
            for(int j=0;j<num.length;j++){
                if(num[j]>1){
                    duplication[0]=j;
                    return true;
                }
            }
            return false;
        }

}
