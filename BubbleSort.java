
public class BubbleSort {
    public static void main(String[] args) {
        int[] randomArray = generateRandom();
        for (int number : randomArray){
            System.out.print(number + ", ");
        }
        bubbleSort(randomArray);
        System.out.println();
        System.out.println("Sorting...");
        System.out.println();
        System.out.println("Sorted: ");

        for (int number : randomArray){
            System.out.print(number + ", ");
        }
        


    }
    static int[] generateRandom(){
        int[] randomArray = new int[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = (int)(Math.random() * 100);
        }
        return randomArray;

    }

    static int[] bubbleSort(int[] randomArray) {
        int[] sortedArray = randomArray;
        int temp = 0;
        boolean isSorted = false;

        while (! isSorted){
            isSorted = true;
            int index = 1;

            while (index < sortedArray.length) {
                if (sortedArray[index-1] > sortedArray[index]){ //check to see if elements are in ascending order
                    temp = sortedArray[index];                  //swap
                    sortedArray[index] = sortedArray[index-1];  //swap
                    sortedArray[index-1] = temp;                //swap
                    isSorted = false;
                }
                index += 1;
            }
        }

        return sortedArray;


    }

}