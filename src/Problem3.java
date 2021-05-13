import java.util.Arrays;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例 1:
 *
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2skh7/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Problem3 {

    public static void rotate(int[] nums, int k) {
        if(nums == null || nums.length <= 1) {
            return;
        }
        int len = nums.length;
        k = k % len;
        int[] tmpNum = Arrays.copyOf(nums, nums.length);
        for(int i = 0;i < len; i++) {
            int newIndex = (i + k) % len;
            nums[newIndex] = tmpNum[i];
        }
//        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int a[] = new int[] {1,2,3,4,5,6,7};
        rotate(a, 3);
    }
}
