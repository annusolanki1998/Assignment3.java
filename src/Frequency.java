public class Frequency {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,6,6,3,2,7,2};
        int[] visitedArr = new int[array.length];
        int visited = -1;
        for (int i=0; i<array.length; i++){
            int count = 1;
            for (int j=i+1; j<array.length; j++){
                if(array[i]==array[j]){
                    count++;
                    visitedArr[j]= visited;
                }
            }
            if(visitedArr[i]!=visited){
                visitedArr[i]=count;
            }
        }
        for(int i=0; i<visitedArr.length; i++){
            if(visitedArr[i]!=visited){
                System.out.println("Frequency of "+array[i]+" : " + visitedArr[i]);

            }
        }
    }
}
