package StandardProblems;

// 121. Best Time to Buy and Sell Stock
public class MaxProfit {
    public static int getMaxProfit(int[] prices) {

        int min = Integer.MAX_VALUE;
        int max = 0;
        int i, n;
        n= prices.length;
        for(i=0;i<n;i++){

            if(prices[i]<min){
                min= prices[i];
            }
            else if(prices[i]-min > max){
                max= prices[i]-min;
            }

        }
        return max;
    }

    public static void main(String[] args) {

        int[] data = {2, 7, 11, 15};
        int result = getMaxProfit(data);
        System.out.println(result);
    }
    }
