public class DuplicateElement {
    public static void main(String[] args) {
        int[] array = new int[] {2,6,7,2,1,9,6,7,3,4};

        System.out.println("Duplicate elements in given array: ");
        for(int i=0; i<=array.length-1; i++){
            for(int j=i+1; j<=array.length-1; j++){
                if(array[i]==array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
