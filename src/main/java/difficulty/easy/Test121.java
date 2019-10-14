package difficulty.easy;

/**
 * @Author huzhpm
 * @Date 2019/10/13 19:42
 * @Version 1.0
 * @Content 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 * 注意你不能在买入股票前卖出股票。
 */
public class Test121 {

    public static void main(String[] args) {
        Test121 t = new Test121();
        int[] prices = new int[]{1,2};
        System.out.println(t.maxProfit(prices));
    }

    /**
     * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格
     * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
     * 注意你不能在买入股票前卖出股票。
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if(prices.length >= 2){
            int minNum = prices[0];
            int minIndex = 0;
            for(int i = 1; i < prices.length; i++){
                if(prices[i] < minNum){
                    minNum = prices[i];
                    minIndex = i;
                }
            }
            int maxNum = prices[minIndex];
            for(int i = minIndex + 1; i < prices.length; i++){
                maxNum = maxNum > prices[i] ? maxNum : prices[i];
            }
            return maxNum - minNum;
        }
        return 0;
    }
}
