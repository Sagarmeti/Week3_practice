import java.util.Scanner;
class NumCount {
  public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the element to search");
    int num=s.nextInt();
    int arr[] = { 23, 34, 56,56,56,78, 56, 44, 87,12,23, };
    int count=0;
    for (int i=0;i<arr.length;i++) {
      if(num==arr[i]){
        count=count+1;
      }
    }
    if(count>=1){
        System.out.println(" The number is present ");
        System.out.println("The number is present"+count+" times");
      }
      else{
        System.out.println("The number is not present");
      }
  }
}