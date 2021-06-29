class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<String>();
        int i,j;
        if(digits==null||digits.length()==0){
            return list;
        }
        String[] mappings={
            "0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        letterCombination(list,digits,"",0,mappings);
        return list;
        
    }
    public void letterCombination(List<String> list,String digits,String curr,int index,String[] mappings){
        if(index==digits.length()){
            list.add(curr);
            return;
        }
        String letters=mappings[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
            letterCombination(list,digits,curr+letters.charAt(i),index+1,mappings);
        }
    }
}
