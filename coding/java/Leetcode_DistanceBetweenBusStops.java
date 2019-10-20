
public class Leetcode_DistanceBetweenBusStops {
	/*
	 * A bus has n stops numbered from 0 to n - 1 that form a circle. We know the distance between all pairs of neighboring stops where distance[i] is the distance between the stops number i and (i + 1) % n.

	The bus goes along both directions i.e. clockwise and counterclockwise.

	Return the shortest distance between the given start and destination stops.

	 Input: distance = [1,2,3,4], start = 0, destination = 1
	Output: 1
	Explanation: Distance between 0 and 1 is 1 or 9, minimum is 1.

	Input: distance = [1,2,3,4], start = 0, destination = 2
	Output: 3
	Explanation: Distance between 0 and 2 is 3 or 7, minimum is 3.
	 */
	
	   public int distanceBetweenBusStops(int[] distance, int start, int destination) {
	        int clockwiseDistance = 0;
	        int counterClockwiseDistance = 0;
	        int startBusStops = Math.min(start, destination);
	        int stopBusStops = Math.max(start, destination);
	        for (int i = 0; i < distance.length; i++) {
	            if (i >= startBusStops && i < stopBusStops) {
	                clockwiseDistance += distance[i];
	            } else {
	                counterClockwiseDistance += distance[i];
	            }
	        }
	        return Math.min(clockwiseDistance, counterClockwiseDistance);
	    }
}
