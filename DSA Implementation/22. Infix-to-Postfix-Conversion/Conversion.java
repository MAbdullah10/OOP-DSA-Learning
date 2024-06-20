import java.util.Stack;

 class Conversion {

    public boolean isOperator(char ch){
        return ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '(' || ch == ')';
    }
    public int Precedence(char ch){
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='/' || ch=='*')
        {
            return 2;
        }
        else return 0;
    }


    public String InfixToPostFix(String Infix){
        String postfix="";
        char ch;
        Stack<Character> st= new Stack<>();
        try {
            for (int  i = 0; i < Infix.length(); i++) {
                ch = Infix.charAt(i);

                if (!isOperator(ch)) {
                    postfix += ch;
                } else if (ch == '(') {
                    st.push(ch);
                } else if (ch == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        postfix += st.peek();
                        st.pop();
                    }
                    st.pop();
                } else {
                    while (!st.isEmpty() && Precedence(st.peek()) >= Precedence(ch)) {
                        postfix += st.pop();
                    }
                    st.push(ch);
                }
            }
        } catch (Exception e){
            System.out.println(e);
        }

        while(!st.isEmpty()){
            postfix+= st.pop();
        }

        return postfix;
    }

    public static void main(String[] args) {
        String s = "(A+B)*(C-D)";
        Conversion c = new Conversion();

        String pf = c.InfixToPostFix(s);
        System.out.println(pf);
    }
}
