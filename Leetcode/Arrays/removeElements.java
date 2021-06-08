

//Given an array nums and a value val, remove all instances of that value in-place and return the new length.
/**
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3]
 * Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * Note that the order of those five elements can be arbitrary.
 * It doesn't matter what values are set beyond the returned length.
 */


package Leetcode.Arrays;
import java.util.*;
public class removeElements {
    public int removeElement(int[] nums, int val) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(val!=nums[i])
                list.add(nums[i]);
        }
        for(int i=0;i<list.size();i++)
        {
            nums[i]=list.get(i);
        }
        int size=list.size();
        list.clear();
        return size;
    }
    //Not written the main
    //Alternation way
    /**
     * int size=nums.length;
     *         for(int i=0;i<size;i++)
     *         {
     *             if(nums[i]==val&&i==size-1)
     *                 size-=1;
     *             else if(nums[i]==val)
     *             {
     *                 for(int j=i;j<size-1;j++)
     *                     nums[j]=nums[j+1];
     *                 size=size-1;
     *                 i=i-1; //as element has been shifted to the place its high time when again the search start from i position
     *             }
     *         }
     *         return size;
     */
}

