package model;

import java.util.LinkedList;

public class Calculator {

    boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    int priority(char oper) {

        // Если символ * или / - приоритет 1
        if (oper == '*' || oper == '/') {
            return 1;
        }

        // Если символ + или - — приоритет 0
        else if (oper == '+' || oper == '-') {
            return 0;
        }

        // Если ни то, ни другое - приоритет -1
        else {
            return -1;
        }
    }

    void letGo(LinkedList<Integer> st, char oper) {

        int someOne = st.removeLast();

        int someTwo = st.removeLast();

        switch (oper) {
            case '+':
                st.add(someTwo + someOne);
                break;
            case '-':
                st.add(someTwo - someOne);
                break;
            case '*':
                st.add(someTwo * someOne);
                break;
            case '/':
                st.add(someTwo / someOne);
                break;
            default:
                System.out.println("Oops");
        }
    }


    public int raschet(String s, int radix) {

        LinkedList<Integer> someInts = new LinkedList<Integer>();
        LinkedList<Character> someOpers = new LinkedList<Character>();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(') {
                someOpers.add('(');

            } else if (c == ')') {

                while (someOpers.getLast() != '(') {
                    letGo(someInts, someOpers.removeLast());
                }

                someOpers.removeLast();

            } else if (isOperator(c)) {
                while (!someOpers.isEmpty() &&
                        priority(someOpers.getLast()) >= priority(c)) {

                    letGo(someInts, someOpers.removeLast());

                }

                someOpers.add(c);
            } else {

                String operand = "";
                while (i < s.length() && !isOperator(s.charAt(i)) && '(' != s.charAt(i) && ')' != s.charAt(i)) {

                    operand += s.charAt(i++);

                }
                --i;

                someInts.add(Integer.parseInt(operand, radix));

            }
        }

        while (!someOpers.isEmpty()) {
            letGo(someInts, someOpers.removeLast());
        }

        return someInts.get(0);

    }


}

