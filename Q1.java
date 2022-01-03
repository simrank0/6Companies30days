// Given an array of strings, return all groups of strings that are anagrams.
  
//  https://practice.geeksforgeeks.org/problems/print-anagrams-together/1/

class Solution {
    public List<List<String>> Anagrams(String[] string_list) {
        // Code here
        HashMap<String, List<String>> m = new HashMap<>();
        for(int i = 0; i<string_list.length; i++){
            char[] chArray = string_list[i].toCharArray();
            Arrays.sort(chArray);
            String s = new String(chArray);
            List<String> l;
            if(m.containsKey(s)){
                l = m.get(s);
            }else {
                l = new ArrayList<>();
            }
            l.add(string_list[i]);
            m.put(s,l);
        }
        List<List<String>> res = new ArrayList<List<String>>();
        for(Map.Entry<String, List<String>> e: m.entrySet()){
            List<String> x = e.getValue();
            res.add(x);
        }
        return res;
    }
}
