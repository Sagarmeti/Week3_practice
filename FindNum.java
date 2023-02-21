import java.util.Scanner;
class FindNum{
  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the search element");
    int num= s.nextInt();
    int arr[]={23,45,12,36,33,45,68,70};
    int count=0,temp=0;
    for(int i=0;i<arr.length;i++){
    if(num==arr[i]){
      count=count+1;
      temp=i;
      break;
    }
    }
      
    if(count>=1){
       System.out.println("yes, it is present in position:"+temp);
    
    }
      else{
        System.out.println("no, it is not present :");
      }
    }
  }
