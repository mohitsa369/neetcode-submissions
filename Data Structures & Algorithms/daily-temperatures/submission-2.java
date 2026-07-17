class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<int[]> stack = new Stack<>();
        for(int i=0;i<n;i++){
            int temperature = temperatures[i];
            while(!stack.isEmpty() && temperature > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{temperature, i});
        }
        return res;
    }
}
