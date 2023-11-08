public class SelectionSort {

    public int[] array;

    public SelectionSort(){
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
        for(int x=0;x<array.length;x++) {
            int min = x;
            for (int y=x+1;y<array.length;y++) {
                if(array[y] < array[min]){
                    min = y;
                }
            }
            if(min != x){
                int temp = array[x];
                array[x] = array[min];
                array[min] = temp;
            }
            printArray();
        }
    }

    public static void main(String[] args) {
        new SelectionSort();
    }

}