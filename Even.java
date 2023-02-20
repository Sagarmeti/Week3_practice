class Even{   
public static void main(String args[]){     
int arr[]={23,45,12,90,55,33};
int esum=0, osum=0;          
for(int i=0;i<arr.length;i++){  
if(arr[i]%2==0){
esum=esum+arr[i];
}
  }
System.out.print("Even sum:"+esum); 
 }
}