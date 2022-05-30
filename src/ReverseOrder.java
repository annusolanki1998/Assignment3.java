public class ReverseOrder {
        public static void main(String[] args) {
            int[] array = new int[]{2, 9, 3, 8, 5, 0, 1, 6, 4, 7, 3, 8};

            System.out.println("Original array : " );
            for(int i=0; i<=array.length-1; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.println("Array in reverse order : " );
            for (int i=array.length - 1; i>=0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }


