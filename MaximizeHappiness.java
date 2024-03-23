import java.util.Arrays;

public class MaximizeHappiness {
    public static long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long out = 0;
        int i = 0;
        int j = happiness.length-1;
        int temp = k;

        while(i < temp){
            long happy = happiness[j--]-i;
            if(happy >= 0){
                out += happy;
            }
            i++;
            k--;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,5};
        System.out.println(maximumHappinessSum(nums,1));
    }
}
