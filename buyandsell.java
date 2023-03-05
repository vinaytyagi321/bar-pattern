public class buyandsell {
    static void buyandsell(int[] arr, int n){
        int premin = arr[0];
        int finalmin = 0;
        for(int i = 0; i<n; i++){
            premin = Math.min(arr[i], premin);
            finalmin = Math.max(finalmin, arr[i] - premin);
        }
        System.out.println("final " + finalmin);
    }
    public static void main(String[] args) {
        int arr[] = {7,2,3,8,1,4};
        int n = arr.length;
        buyandsell(arr, n);
    }

    
    
}

