package Search;

class binary_search_new
{
    public int findsearch(int arr[],int target)
    {
        int start =0;
        int end =arr.length-1;
        if(target>arr[end])
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
                start=mid+1;
            }
            else if(target==arr[mid]){
                return mid;
            }
        }
        return end;
    }
}

public class flooring_number
{
    public static void main(String args[])
    {
    	binary_search_new bn = new binary_search_new(); 
        int arr[]={1,5,7,15,18,19,24,30,35,39,40,45,47,50};
        int target =16;
        System.out.println("Element Found At "+bn.findsearch(arr,target));
    }
}
