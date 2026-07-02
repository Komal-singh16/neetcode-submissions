class Solution {
    public int trap(int[] height) {
         int n=height.length;
        int[] leftMaxHeight=new int[n];
        int[] righMaxtHeight=new int[n];
        leftMaxHeight[0]=height[0];
        for(int i=1;i<n;i++){
            leftMaxHeight[i]=Math.max(leftMaxHeight[i-1],height[i]);
        }
        righMaxtHeight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            righMaxtHeight[i]=Math.max(righMaxtHeight[i+1],height[i]);
        }
        int water =0;
        //trapped water
        for(int i=0;i<n;i++){
            water+=Math.min(leftMaxHeight[i],righMaxtHeight[i])-height[i];
        }
        return water;
    }
};