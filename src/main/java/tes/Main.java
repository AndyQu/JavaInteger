package tes;

public class Main {
    public static void main(String[] args) {
        /**
         * Java编译器对整形数据做了优化
         */
        Integer d = new Integer(4);
        Integer c = 4;// 产生一个Integer的Object
        Integer b = 4;// 复用上一个已存在的Integer Object
        System.out.println(d == b);
        System.out.println(b == c);
        System.out.println(d.equals(b));

        b = 5;// 修改了b的数值之后，b指向另外一个Integer Object
        System.out.println(c);

        Integer e = b;
        System.out.println("e:" + e);
        b = 6;// 修改了b的数值之后，b又指向了另外一个Integer Object
        System.out.println("e:" + e);
    }
}
