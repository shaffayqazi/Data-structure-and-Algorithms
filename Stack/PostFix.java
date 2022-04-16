package Stack;

public class PostFix {
    public static void main(String[] args) {
        
        String s = "x/((6/y)*(5-z))";

        LinkedStack ls = new LinkedStack();

        StringBuilder newStr = new StringBuilder();

        for(char i: s.toCharArray())
        {

            if(i=='+' || i=='-' || i=='*' || i=='/')
                ls.push(i);

            else{
                if(i!=')' && i!='(')
                    newStr.append(i);

                if(!ls.isEmpty() && i==')')
                    newStr.append(ls.pop());
            }
        }
        while(!ls.isEmpty())
            newStr.append(ls.pop());

        System.out.println(newStr);
    }
}