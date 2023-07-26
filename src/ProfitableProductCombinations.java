import java.util.*;

public class ProfitableProductCombinations {

    /*
    * Your startup has a large inventory of products with their respective prices stored in an integer array
    * called ""products"". You want to identify all possible combinations of three products that can be sold
    * together such that the total revenue generated is equal to $1000. Write a function that takes in the array
    * of products and returns a list of all unique triplets satisfying the conditions mentioned above. Note that
    * each product can only be used once in a triplet.
    *
    * Example 1:
    *   int[] products = {100, 200, 300, 400, 500, 600};
    *   Output: [[100, 200, 700], [100, 300, 600], [100, 400, 500], [200, 300, 500]]
    *
    * Example 2:
    *   int[] products = {50, 100, 150, 200, 250, 300, 350, 400, 450, 500};
    *   Output: [[50, 200, 750], [50, 250, 700], [50, 300, 650], [50, 350, 600], [50, 400, 550],
    *   [100, 150, 750], [100, 200, 700], [100, 250, 650], [100, 300, 600], [100, 350, 550],
    *   [150, 200, 650], [150, 250, 600], [150, 300, 550], [200, 250, 550]]
    *
     * */


    public static List<List<Integer>> findTriplets(int[] products){

        Set<List<Integer>> uniqueTriplets = new LinkedHashSet<>();

        for(int i = 0; i < products.length - 3; i++){

            for(int j = i + 1; j < products.length -2; j++){
                List<Integer> triplets = new ArrayList<>();
                int target = 1000;

                if(products[i] < target){
                    target -= products[i];
                    triplets.add(products[i]);
                }else{
                    break;
                }
                if(products[j] < target){
                    target -= products[j];
                    triplets.add(products[j]);
                }else{
                    break;
                }
                int sum = 0;
                for(int k = j+1; k < products.length -1; k++){

                    if(sum + products[k] <= target){
                        sum += target;
                    }
                    if(sum == target){
                        triplets.add(sum);
                        break;
                    }
                    if(sum > target){
                        break;
                    }
                }
                if(triplets.size() == 3){
                    uniqueTriplets.add(triplets);
                }

            }
        }

        return new ArrayList<>(uniqueTriplets.stream().toList());
    }
}
