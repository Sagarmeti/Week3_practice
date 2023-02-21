class EvenOddadd{
  public static void main(String args[]){
  int arr[]={23,56,34,78,44,73,13};
  for(int i=0;i<arr.length;i++){
  if(arr[i]%2==0){
    arr[i]=arr[i] +5;
  }
  else{
   arr[i]=arr[i] -5;
  }
  }
for(int i=0;i<arr.length;i++){
  System.out.println(arr[i]);
}
}
}