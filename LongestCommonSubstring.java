class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
        String sub=" ";
        int len=0;
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<S1.length();i++)
        {
            for(int j=S1.length();j>=i;j--)
            {
                sub=S1.substring(i,j);
                if(S2.contains(sub))
                {
                  len=sub.length();
                  arr.add(len);
                }
            }
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1);
    }
}
