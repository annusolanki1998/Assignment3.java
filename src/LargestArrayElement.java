public class LargestArrayElement {
    public static void main(String[] args) {
        int[] array = new int[] {25,76,34,23,99,4,87};
        //Initialize max with first element of array:-
        int max = array[0];
        for(int i=0; i<= array.length-1; i++){
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Largest element present in given array : " +max);
    }
}
