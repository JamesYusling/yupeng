package net.yupeng.java.foundational.object;

/**
 * 嵌套循环，break语句在内层循环中被执行，程序将跳出内层循环，从下一个外层循环开始执行
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/23 22:41
 * @since JDK17
 */
public class BreakDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass "+ i + "：");
            for (int j = 0; j < 100; j++) {
                if (j == 10){
                    break;
                }
                System.out.print(j+" ");

            }
            System.out.println( ); //换行
        }
        //循环结束
        System.out.println("循环结束");

        /*
            如果当某种特殊情况发生时，想同时终止所有的内外层循环，即直接终止所有的循环，那么需要在每一层中都使用break语句。
            例如下面的语句：
            */


        for (int i = 0; i < 3; i++) {
            Boolean flag = false;
            System.out.println("i是："+i);
            for (int j = 0; j < 100; j++) {
                System.out.print("j是："+j);
                if (j ==  10) {
                    flag=true;

                    break;
                }

            }
            if (flag){
                break;
            }



        }

        /*
            break标签 */


    }
}
