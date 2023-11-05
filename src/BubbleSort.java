public class BubbleSort {

    public int[] array;

    public BubbleSort(){
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
            madeSwap = false;
            for (int y=1;y<array.length-(x-1);y++) {
                if (array[y-1] > array[y]) {
                    int temp = array[y];
                    array[y] = array[y-1];
                    array[y-1] = temp;
                    madeSwap = true;
                }
            }
            if(madeSwap == false){
                break;
            }
            printArray();
        }
    }

    public static void main(String[] args) {
        new BubbleSort();
    }

}