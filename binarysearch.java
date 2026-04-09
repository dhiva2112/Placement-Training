public class binarysearch {
    public static void main(String[] args) {
        int nums[]={3,4,5,6,7,8,8,10};
        int target=7;
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(target==nums[mid])
            {
                System.out.println(mid);
                break;
            }
            else if(nums[mid]<target)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            
        }
    }
}