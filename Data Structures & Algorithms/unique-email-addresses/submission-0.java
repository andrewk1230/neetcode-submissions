class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> email = new HashSet<>();
        for(String str : emails){
            String[] full = str.split("@");
            String st = "";
            boolean ignore = false;
            for(int i =0;i<full[0].length();i++){
                if(full[0].charAt(i)=='+') ignore = true;
                if(full[0].charAt(i)!='.'&& ignore == false) st += full[0].charAt(i);
            }
            email.add( st+"@"+full[1]);
        }return email.size();
    }
}