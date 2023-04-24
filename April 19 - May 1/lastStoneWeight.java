import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int n = stones.length;
        
        for(int i =0;i<n;i++){
            maxheap.offer(stones[i]);
        }
        
        int first,second;
        
        while(n>1){
            first = maxheap.peek();
            maxheap.poll();
            second = maxheap.peek();
            maxheap.poll();
            n-=2;
            if(first - second > 0){
                maxheap.offer(first - second);
                n+=1;
            }
        }
        
        if(!maxheap.isEmpty()){
            return maxheap.peek();
        }
        return 0;
    }
}