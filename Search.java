import java.util.Scanner;
class Search{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int count=0;
    int index=-1;
    int arr[]={10,12,34,43,243,32,7,18,17};
    System.out.println("Enter the number to check whether it is present in the list or not:");
    int num=s.nextInt();
    for(int i=0;i<arr.length;i++){
      if(num==arr[i]){
        count++;
        index=i;
        break;
    }
    }
    if(count>0){
         System.out.println("The number is present in "+index+" index position");
      }
      else{
         System.out.println("The number is not present");
      }
  }   
} 