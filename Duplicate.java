public class Duplicate{ 
    public static void main(String[] args) {
        int arr[] = {23,45,18,18,56,23,-1,-1,17,45,67,17,44}; 
        System.out.println("Duplicate elements in given array: "); 
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}