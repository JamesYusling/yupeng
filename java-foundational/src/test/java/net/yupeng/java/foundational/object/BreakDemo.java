package net.yupeng.java.foundational.object;

/**
 * break跳转语句
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/23 21:53
 * @since JDK17
 */
public class BreakDemo {
    public static void main(String[] args) {
        int i,j,count=0;
        int number = 45;
        int [] arrays ={1,3,4,5,6,23,45,56,67,78,45};
        int length =arrays.length;

        //break 结束循环
        for ( i = 0; i < length; i++) {
            if (arrays[i] == number){
                System.out.println("break跳转语句：  您要查找的"+number+"是arrays数组中第"+(i+1)+"个元素；");
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("break跳转语句：  arrays数组中没有您要查询的"+number+"这个数据");
        }



        //continu 结束当次循环，立刻进行下一次循环
        for ( j = 0; j < length; j++) {

            if (arrays[j] == number){
                System.out.println("continue跳转语句：  arrays数组中是number的数值下标为:"+j);
                continue;
            }
        }



    }

}
