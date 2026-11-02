class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                int top = stack.pop();

                if ( c == '}' && top != '{') return false;
                if ( c == ']' && top != '[') return false;
                if ( c == ')' && top != '(') return false;

            }
        }

        return stack.isEmpty();
    }
}
