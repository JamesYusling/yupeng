package net.yupeng.java.foundational.object;

/**
 * main-test
 * 测试二维数组
 * 在二位数组中，行和列的下标都是从0开始的
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/15 0:09
 * @since JDK17
 */
public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [] [] year =new int[52][7];
        int [][] arrays ={{11,12,13,14,15},{21,22,23,24,25},{31,32,33,34,35}};
        System.out.println(arrays[0][2]);

        //修改二维数组
        arrays[0][0]=arrays[1][3]+arrays[2][0];
        System.out.println(arrays[0][0]);


    }
}
