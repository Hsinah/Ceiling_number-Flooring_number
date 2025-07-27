import java.util.*;
class binary_search
{
    public int findsearch(int arr[],int target)
    {
        int start =0;
        int end =arr.length-1;
        if(target<arr[end])
        {
            return -1;
        }

        while(start<= end)
        {
            int mid =start+(end-start) /2;
            if(target<arr[mid])
            {
                end =mid-1;
            }
            else if(target>arr[mid])
            {
                end=mid+1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return start;
    }
}

public class ceiling_number
{
    public static void main(String args[])
    {
        binary_search b = new binary_search(); 
        int arr[]={1,5,7,15,18,19,24,30,35,39,40,45,47,50};
        int target =16;
        System.out.println("Element Found At "+b.findsearch(arr,target));
    }
}
