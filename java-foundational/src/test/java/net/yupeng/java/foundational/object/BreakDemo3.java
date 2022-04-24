package net.yupeng.java.foundational.object;

/**
 * break标签
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/23 23:23
 * @since JDK17
 */
public class BreakDemo3 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass："+i+"：");
            for (int j = 0; j < 100; j++) {
                if (j == 10){
                   break outer;
                }
                System.out.print(j+" ");
            }
            System.out.println("这个语句不会执行");
        }
        System.out.println("循环结束。");


        //三层嵌套标签
        boolean flag =false;
        first:
        {
            second:{
                third:{
                    System.out.println("这里是第三层，执行break之前。");
                    flag = true;
                    if(flag){
                        break second;
                        //System.out.println("这条语句不会被执行；");
                    }
                }
                System.out.println("second：第二层，这个会执行");
            }
            System.out.println("first：第一层，这个会执行");
        }
    }
}
