class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String temp = s.toUpperCase();

        String temp2 = temp.replace("-","");
        String ans = "";

        for(int i=temp2.length()-1; i>=0; i-=k){

            String currentGroup="";
            for(int j=i; j>i-k && j>=0 ; j--){
                currentGroup = temp2.charAt(j)+currentGroup;
            }
            if(ans.length()==0){
                ans = currentGroup;
            }
            else{
                ans = currentGroup + "-" + ans;
            }
        }
        if(ans!=null && ans.endsWith("-")){
            ans=ans.substring(0,ans.length()-1);
        }
        return ans;
    }
}
