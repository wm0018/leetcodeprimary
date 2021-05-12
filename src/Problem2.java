/**
 * 买卖股票的最佳时机 II
 *
 * 输入: prices = [1,2,3,4,5]
 * 输出: 4
 * 解释: 在第 1 天（股票价格 = 1）的时候买入，在第 5 天 （股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 *      注意你不能在第 1 天和第 2 天接连购买股票，之后再将它们卖出。因为这样属于同时参与了多笔交易，你必须在再次购买前出售掉之前的股票。
 *
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/top-interview-questions-easy/x2zsx1/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Problem2 {

    /**
     * 贪心算法，可以简化成取相邻的元素之差，大于0才有收益，进行累加
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length <= 1) {
            return 0;
        }
        int total = 0;
        for(int i = 0; i < prices.length - 1; i++) {
//            int tmp = prices[i+1] -prices[i];
//            if(tmp > 0) {
//                total += tmp;
//            }
            total += Math.max(prices[i + 1] - prices[i], 0);
        }
        return total;
    }
}
