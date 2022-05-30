public class EvenPosition {
    public static void main(String[] args) {
        int[] array = new int[] {2,9,3,8,5,0,1,6,4,7,3,8};

        System.out.println("Elements of given array present on even position : ");

        for(int i=1; i<=array.length-1; i= i+2){
            System.out.print(array[i] + " ");
        }
    }
}
