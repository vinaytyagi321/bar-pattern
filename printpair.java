public class printpair{
public static void printpair(int arr[],int key){
    int start= 0;
    int end= arr.length-1;
    while(start<end){
       if(arr[start]+arr[end]== key){
           System.out.println(start+" ,"+ end );
       }
    start++;
    end--;
   }
}
   public static void main(String[] args) {
       int arr[] = {2,1,5,6,3,7};
       int key= 11;
       printpair(arr, key);
   }
   
}
