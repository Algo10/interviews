import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leetcode_CourseSchedule {
	/*
	 * There are a total of n courses you have to take, labeled from 0 to n-1.

		Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
		
		Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?
		
		Example 1:
		
		Input: 2, [[1,0]] 
		Output: true
		Explanation: There are a total of 2 courses to take. 
		             To take course 1 you should have finished course 0. So it is possible.
		Example 2:
		
		Input: 2, [[1,0],[0,1]]
		Output: false
		Explanation: There are a total of 2 courses to take. 
		             To take course 1 you should have finished course 0, and to take course 0 you should
		             also have finished course 1. So it is impossible.
	 */
	
	public static void main(String[] args){
		int[][] test1Data = {{1,0}};
		System.out.println(canFinish(2, test1Data));
		int[][] test2Data = {{1,0}, {0,1}};
		System.out.println(canFinish(2, test2Data));
	}
	
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        for(int i=0;i<prerequisites.length;i++){
            Set<Integer> adjacentNodes = graph.getOrDefault(prerequisites[i][0], new HashSet<>());
            adjacentNodes.add(prerequisites[i][1]);
            graph.put(prerequisites[i][0], adjacentNodes);
        }
        
        for(Integer start: graph.keySet()){
            Set<Integer> currentNodeRecurseStack = new HashSet<>();
            Set<Integer> visited = new HashSet<>();
            System.out.println("start-"+start);
            if(hasCycle(graph, visited, currentNodeRecurseStack, start)) return false;
        }
        return true;
    }
    
    private static boolean hasCycle(Map<Integer, Set<Integer>> graph, Set<Integer> visited, Set<Integer> currentNodeRecurseStack, int start){
       
        visited.add(start);
        currentNodeRecurseStack.add(start);
        
        if(graph.get(start)!=null){
            for(int node : graph.get(start)){
               if (!visited.contains(node) && hasCycle(graph, visited, currentNodeRecurseStack, node)) {
                    return true;
                } else if (currentNodeRecurseStack.contains(node))
                    return true;
            }
           
        }
        currentNodeRecurseStack.remove(start);
        return false;
    }
}