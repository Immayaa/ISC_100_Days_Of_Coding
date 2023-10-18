package immayaa;

public class day10_OperatorBitwise {

    public static void main(String[] args) {
        //operator bitwise

        int a = 10;
        int b;

        //XOR
        a = (a ^ 4);
        System.out.println("nilai OR: " + a);

        //Operator Left Shift (<<)
        a = (a << 1);
        System.out.println("nilai left shift: " + a);

        //Operator Right Shift (>>)
        b = (a >> 2);
        System.out.println("nilai right shift: " + b);

    }
}
