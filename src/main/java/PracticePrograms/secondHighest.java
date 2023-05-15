package PracticePrograms;

public class secondHighest {

    public static void main(String[] args) {

        int[] arr = new int[] {22,0,13,15,89,56,74,35,100,700,900};
        int largest ;
        int secondLargest ;

        if (arr[0]>arr[1])
        {
            largest = arr[0];
            secondLargest = arr[1];
        }
        else {
            secondLargest= arr[0];
            largest = arr[1];
        }
        for (int i =2;i<= arr.length-1;i++) {
            if (arr[i] > largest) {

                secondLargest = largest;
                largest=arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
            System.out.println(secondLargest);


    }
}
