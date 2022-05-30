public class SmallestElementArray {
        public static void main(String[] args) {
            int[] array = new int[] {25,76,34,23,99,4,87};
            //Initialize min with first element of array:-
            int min = array[0];
            for(int i =0; i<= array.length-1; i++){
                if(array[i]<min)
                    min=array[i];
            }
            System.out.println("Smallest element present in given array : " +min);
        }
    }


