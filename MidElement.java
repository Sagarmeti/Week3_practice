class MidElement{
    public static void main(String args[])
    {
        int arr[] = {12, 22, 34, 22, 54, 6, 52, 8, 9, 34, 54};
        int startIndex = 0, lastIndex = arr.length-1;
        int midIndex = startIndex + (lastIndex-startIndex)/2;
        System.out.println("The middle element in the given array is:"+arr[midIndex]);
    }
}