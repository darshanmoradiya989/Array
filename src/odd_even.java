public class odd_even {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(oddCount);
        System.out.println(evenCount);
    }
}
