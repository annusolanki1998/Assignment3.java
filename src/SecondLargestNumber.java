public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] array = new int[] {10,8,7,43,88,31};
        int temp=0;
        int size = array.length;
        System.out.println("Original Array : ");
        for(int i=0; i<=size-1; i++){
            System.out.print(array[i] + " " );
        }
        for(int i=0; i<=size-1; i++){
            for(int j=i+1; j<=size-1; j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in ascending order : " );
        for(int i=0; i<=size-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Second largest number is :" + array[size-2]);



    }
}
