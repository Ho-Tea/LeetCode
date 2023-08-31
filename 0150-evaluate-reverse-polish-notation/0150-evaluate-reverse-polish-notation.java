class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> number = new Stack<>();
        for(String token : tokens){
            if (isNumber(token)){
                number.push(Integer.parseInt(token));
                System.out.println(token);
                continue;
            }
            int right = number.pop();
            int left = number.pop();
            switch (token){
                case "+":
                    number.push(left + right);
                    break;
                case "-":
                    number.push(left - right);
                    break;
                case "*":
                    number.push(left * right);
                    break;
                case "/":
                    number.push(left / right);
                    break;
            }
        }
        return number.pop();
    }
    public static boolean isNumber(String strValue) {
        return strValue != null && strValue.matches("[-+]?\\d*\\.?\\d+");
    }
}