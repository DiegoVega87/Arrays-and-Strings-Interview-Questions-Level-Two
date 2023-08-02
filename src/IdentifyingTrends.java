import java.util.Arrays;

public class IdentifyingTrends {

    /*
    * Your startup is looking to invest in the stock market and you want to find a way to identify potential
    * opportunities for profit. You have historical data of daily stock prices in an integer array called prices.
    * Write a function that returns true if there exists a triplet of indices (i, j, k) such that i < j < k and
    * prices[i] < prices[j] < prices[k]. This indicates that there is an increasing trend in the stock prices
    * and investing in this sequence could lead to profit. If no such indices exists, return false.
    *
    * Example 1:
    *   Input: prices = {1, 2, 3, 4, 5}
    *   Output: true
    *   Explanation: There exists a triplet (i, j, k) such that i < j < k and prices[i] < prices[j] < prices[k].
    *   For example, (0, 1, 2) or (1, 2, 3) or (2, 3, 4).
    *
    * Example 2:
    *   Input: prices = {5, 4, 3, 2, 1}
    *   Output: false
    *   Explanation: There is no triplet (i, j, k) such that i < j < k and prices[i] < prices[j] < prices[k].
    * * */
    public static void main(String[] args){

        int[] prices = {1, 2, 3, 4, 5};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{5, 4, 3, 2, 1};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{1, 2, 3, 2, 4};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{1, 2, 3, 2, 1};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{1, 2, 3, 2, 5};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{165, 212, 3165, 212345, 5};
        System.out.println(findProfitableTriplets(prices));

        prices = new int[]{1, 4, 2, 0, 3};
        System.out.println(findProfitableTriplets(prices));
    }

    public static boolean findProfitableTriplets(int[] prices){

        if(prices.length < 3){
            return false;
        }

        int i = 0, j = i + 1, k = j + 1;

        while(k < prices.length){

            if((prices[i] < prices[j]) && (prices[j] < prices[k])){
                return true;
            }

            if(prices[i] >= prices[j]){
                i++;
                j++;
                k++;
            }else if(prices[j] >= prices[k]){
                j++;
                k++;
            }

            if(k < prices.length && prices[j] >= prices[k] ){
                k++;
            }
        }

        return false;
    }
}
