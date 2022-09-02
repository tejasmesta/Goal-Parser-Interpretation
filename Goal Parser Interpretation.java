class Solution {
    public String interpret(String command) {
        int n = command.length();
        
        String ans = "";
        
        int i =0;
        
        while(i<n)
        {
            char c = command.charAt(i);
            
            if(c=='G')
            {
                ans+="G";
            }
            else if(c=='(')
            {
                String temp ="";
                while(i<n && command.charAt(i)!=')')
                {
                    temp+=(command.charAt(i)+"");
                    i++;
                }
                temp+=(command.charAt(i)+"");                
                if(temp.equals("()"))
                    ans+="o";
                else if(temp.equals("(al)"))
                    ans+="al";
            }
            i++;
        }
        
        return ans;
    }
}
