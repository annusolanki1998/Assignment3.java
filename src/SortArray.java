public class SortArray {
    public static void main(String[] args) {
        int[] array = new int[] {2,8,0,1,6,9,4,3};
        int temp=0;
        System.out.println("Elements of original array: ");
        for(int i=0; i<=array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        for(int i=0; i<=array.length-1; i++) {
            for (int j=i+1; j<=array.length-1; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();

        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0; i<=array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
