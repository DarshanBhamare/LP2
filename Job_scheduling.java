import java.util.*;
public class Job_scheduling {
    static class Job{
        char id;
        int deadline;
        int profit;
        Job(char id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[]args){
        Job[]jobs={
            new Job('a',2,100),
            new Job('b',3,15),
            new Job('c',1,25),
            new Job('d',1,13),
            new Job('e',2,27),
        };
        Arrays.sort(jobs,(a,b)->b.profit-a.profit);
        int maxDeadline=0;
        for(Job j:jobs){
            maxDeadline=Math.max(maxDeadline,j.deadline);
        }
        char[]result=new char[maxDeadline];
        boolean[]slot=new boolean[maxDeadline];
        int totalProfit=0;
        for(Job job:jobs){
            for(int j=job.deadline-1;j>=0;j--){
                if(!slot[j]){
                    slot[j]=true;
                    result[j]=job.id;
                    totalProfit+=job.profit;
                    break;
                }
            }
        }
        System.out.print("Selected Jobs:");
        for(char ch:result){
            System.out.print(ch+" ");
        }
        System.out.println("\nTotalProfit:"+totalProfit);
    }
}
