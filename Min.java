class Min {   
public static void main(String args[]){     
int arr[]={23,45,12,90,55,33,10,24,78,45};       
int max=0, min=0;        
max=arr[0];    min=arr[0];        
for(int i=1;i<arr.length;i++){        
if(max<arr[i]){           
max=arr[i];     
}                           
if(min>arr[i]){          
min=arr[i];        
}
}
  System.out.println("Minimum value:"+min);
}
}