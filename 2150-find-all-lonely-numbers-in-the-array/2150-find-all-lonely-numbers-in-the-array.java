class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<Integer>();
        

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);

            }else{
                map.put(nums[i],1);
            }
        }

        for(Map.Entry entry: map.entrySet()){
            int count = (int) entry.getValue();
            if(count == 1){
                int n = (int) entry.getKey();
                int x = n-1;
                int y = n+1;
                if(!map.containsKey(x) && !map.containsKey(y)){
                    list.add(n);
                }
            }
        }
        return list;
    }
}