class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // [bag, gab, dog, god,]
        // []
        // [a]
        // re-order the elements
        // if the first elements are the same length and also same alphaneths grouo them
        //
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            res.putIfAbsent(sorted, new ArrayList<>());
            res.get(sorted).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
