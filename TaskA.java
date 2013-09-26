package Coursera;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TaskA {

	int[] weights;
	int[] lengths;
	int numberOfJobs;
	
	public void solve(InputReader in, PrintWriter writer) {
		
		numberOfJobs = in.nextInt();
		lengths = new int[numberOfJobs];
		weights = new int[numberOfJobs];
		
		for(int i=0;i<numberOfJobs;i++)
		{
			lengths[i]=in.nextInt();
			weights[i]=in.nextInt();
		}
		
		List<Job> jobList = new ArrayList<Job>();
		for(int i=0;i<numberOfJobs;i++)
		{
			Job job = new Job(weights[i],lengths[i]);
			jobList.add(job);	
		}
		
		long weightedSum = getWeightedSum(jobList);

		writer.println(weightedSum);
		
	}

	private long getWeightedSum(List<Job> jobList) {
        Collections.sort(jobList);
    	long weightedSum = 0;
    	int cumulativeLength = 0;
    	for (int i=numberOfJobs-1; i >= 0; i--) {
    	Job job = jobList.get(i);
    	cumulativeLength += job.length;
    	weightedSum = weightedSum + (((long)cumulativeLength)*job.weight);
    	}

    	return weightedSum;
	}

}

class Job implements Comparable<Job>{

	public int weight;
	public int length;

	public Job(int i, int j) {
		this.weight = i;
		this.length = j;
	}

	@Override
	public int compareTo(Job o) {
		int otherDiff = o.weight - o.length;
		int myDiff = this.weight - this.length;
		
		
		if (myDiff < otherDiff) {
			return -1;
			} else if (myDiff > otherDiff) {
			return 1;
			} else {
			if (this.weight < o.weight)
			return -1;
			else if (this.weight > o.weight)
			return 1;
			else
			return 0;
			}
	}
	
}
