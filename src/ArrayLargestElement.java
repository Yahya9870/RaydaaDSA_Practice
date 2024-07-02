public class ArrayLargestElement {
    public static void main(String[] args) {
         int [] arr = {10,20,30,40,50};
// int return type method calling
//         int ans = arrayLargestElement(arr);

//        System.out.println("The largest element in the given array is: "+ans);
//        System.out.println("The largest element in the given array is: " +arrayLargestElement(arr) );
        // void method calling
        arrayLargestElement(arr);

    }
    // This is with int return type and private method within the same class
//    private static int arrayLargestElement(int[] arr) {
//        int largestElement = arr[0];
//
//        for (int i = 1; i <arr.length ; i++) {
//            if(arr[i]>largestElement){
//                largestElement=arr[i];
//            }
//
//        }
//
//        return largestElement;
//    }
//}

// void return type and public method

    private static void arrayLargestElement(int[] arr) {
        int largestElement = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }

        }

        System.out.println("The largest element in the given array is: "+largestElement);
    }
}
