public class InsertionSort {

    public int[] array;

    public InsertionSort(){
        makeArray();
        printArray();
        sortArray();
        printArray();
    }

    public void makeArray(){
        array = new int[8];
        for(int x=0;x<array.length;x++){
            array[x] = (int)(Math.random()*9+1);
        }
    }

    public void printArray(){
        for(int x=0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();
    }

    public void sortArray(){
        boolean madeSwap = false;
        for(int x=1;x<array.length;x++) {
            for (int y=1;y<array.length;y++) {
                if (array[y] < array[y-1]) {
                    int temp1 = array[y-1];
                    array[y-1] = array[y];
                    array[y] = temp1;
                }
            }
            printArray();
        }
    }

    public static void main(String[] args) {
        new InsertionSort();
    }

}
