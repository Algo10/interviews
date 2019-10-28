import java.util.Arrays;

public class Leetcode_TwoCitiSchedling {
	/*
    There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

 

Example 1:

Input: [[10,20],[30,200],[400,50],[30,20]]
Output: 110
Explanation: 
The first person goes to city A for a cost of 10.
The second person goes to city A for a cost of 30.
The third person goes to city B for a cost of 50.
The fourth person goes to city B for a cost of 20.

The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 

Note:

1 <= costs.length <= 100
It is guaranteed that costs.length is even.
1 <= costs[i][0], costs[i][1] <= 1000
    */
    public int twoCitySchedCost(int[][] costs) {
      /*We want to achieve:

costs[i][0] + costs[j][1] < costs[i][1] + costs[j][0]
which means:

costs[i][0] - costs[i][1] < costs[j][0] - costs[j][1]
so {i to A, j to B} costs less than {i to B, j to A}, which means we can sort the costs based on the difference of costs[i][0] - costs[i][1] in ascending order. The we select the first half to go to A and second half to go to B.*/
          Arrays.sort(costs, (cost1, cost2) -> cost1[0] - cost1[1] - (cost2[0] - cost2[1]));
        int cost = 0;
        int i = 0;
        int j = costs.length - 1;
        while (i < j) {
            cost += costs[i][0] + costs[j][1];
            i++;
            j--;
        }
        return cost;
       
    }
    
}
