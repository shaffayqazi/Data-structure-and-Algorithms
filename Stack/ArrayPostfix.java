package Stack;

public class ArrayPostfix {

    public ArrayPostfix(String[] args)
    {
        Stack stack = new ArrayStack(args.length);

        for(int i =0; i<args.length;i++)
        {
            String input = args[i];

            if (isoperator(input))
            {
                double y = Double.parseDouble((String)stack.pop());
                double x = Double.parseDouble((String)stack.pop());
                double z = evaluate(x,y,input);
                stack.push(" "+z);
            }
            else
                stack.push(input);
        }
    }
    private boolean isoperator(String op)
    {
        return (op.length()==1 && "AMSD".indexOf(op) >= 0);
    }

    private  double evaluate(double x , double y , String op)
    {
        double z = 0;
        if(op.equals("A")) z = x+y;
       else if(op.equals("M")) z = x-y;
       else if(op.equals("S")) z = x*y;
       else if(op.equals("D")) z = x/y;

       else
            System.out.println(x+"" + op+""+y+"="+z);

       return z;
    }

    public static void main(String[] args) {
        String[] s = {"7","2","5","A","M","S","D"};
        new ArrayPostfix(s);
    }

}
