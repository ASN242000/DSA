package ArraysProblems;

import java.util.Arrays;

public class MostBeautifulItemForEachQuery {
    public static void main(String[] args) {
        int items[][] = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int queries[] = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(maximumBeauty(items, queries)));
    }
    public static int[] maximumBeauty(int[][] items, int[] queries) {
        int value;
        int ans[] = new int [queries.length];
        for(int i=0;i<queries.length;i++){
            value = queries[i];
            for(int j=0;j<items.length;j++){
                if(items[j][0] <= value && items[j][1] > ans[i] )
                    ans[i] = items[j][1];
            }
        }
        return ans;
    }
}
