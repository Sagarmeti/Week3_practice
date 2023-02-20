import java.util.Scanner;
  class Operators{
    public static void main(String args[]){

      Scanner s=new Scanner(System.in);
      System.out.println("Enter the first number");
      int num1=s.nextInt();
      System.out.println("Enter the second number:");
      int num2=s.nextInt();
      System.out.println("Enter the operator:");
      char ch=s.next().charAt(0);

      switch(ch){

          case(1):{
            System.out.println(num1+num2);
            break;
          }
          case(2):{
            System.out.println(num1-num2);
            break;
          }
          case(3):{
            System.out.println(num1*num2);
            break;
          }
          case(4):{
            System.out.println(num1/num2);
          }
        default:
          System.out.println("Invalid");
          break;
      }
    }
  }