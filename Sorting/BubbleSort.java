package Sorting;

public class BubbleSort {

    public static void bubbleSort(int nums[]){
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j]= nums[j+1];
                    nums[j+1]= temp;
                }
            }
        }
    }

    public static void selectionSort(int nums[]){
        for (int i = 0; i < nums.length; i++) {
            int min = 0;
            for (int j = i; j < nums.length-1; j++) {
                min = Math.min(nums[j], nums[j+1]);                
            }
            
        }
    }
    public static void main(String[] args) {
        int numbers[]= {5,43,8,10,2};
        selectionSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
