package cn.lm.javaSe.day01_Object类常用API;

public class SystemsDemo {
    public static void main(String[] args) {
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src, 0, dest, 0, 3);

        for (int i = 0; i < src.length; i++) {
            System.out.print(src[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < dest.length; i++) {
            System.out.print(dest[i] + " ");
        }
        }
}
