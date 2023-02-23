import java.util.Scanner;
class PrimePal{
  Scanner s=new Scanner(System.in);
  public void isPrime(){
    int count=0;
    System.out.println("Enter number to check it is prime or not");
    int num=s.nextInt();
    for(int i=1; i<=num/2; i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==1){
      System.out.println("Number is prime");
    }
    else{
      System.out.println("Number is not prime");
    }
  }
   public void isPal(){
      int num, rev=0, rem, temp;
      Scanner sc= new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = sc.nextInt();
      
      temp = num;
      while(temp!=0)
      {
         rem = temp%10;
         rev = (rev*10) + rem;
         temp = temp/10;
      }
      
      if(num==rev)
         System.out.println("\nIt is a Palindrome Number.");
      else
         System.out.println("\nIt is not a Palindrome Number.");
   }
  

  public void viewOptions(){
    System.out.println("1.To check prime:");
    System.out.println("2.To check palindrome:");
    System.out.println("Choose your options:");
    int option=s.nextInt();
    switch(option){
      case 1:{
        isPrime();
        viewOptions();
        break;
      }
      case 2:{
        isPal();
        viewOptions();
        break;
      }
   }
  }
public static void main(String args[]){
    PrimePal obj = new PrimePal();    
    obj.viewOptions();
  }
}