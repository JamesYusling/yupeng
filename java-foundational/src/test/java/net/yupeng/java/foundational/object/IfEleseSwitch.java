package net.yupeng.java.foundational.object;

/**
 * Java中的选择语句包括if语句、if-else语句和switch语句。
 * 选择语句用来控制选择结构，对选择条件进行判断，并根据判断结果选择要执行的程序语句，改变程序执行流程。
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/15 0:22
 * @since JDK17
 */
public class IfEleseSwitch {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        if (a > b)
            System.out.println("这句语句不能输出");
        System.out.println("这句话能输出，不受上一句判断语句的影响");

        // if else 双分支语句
        int max;
        if(a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println("最大值是：" + max );


        int score =85;
        if (score >= 90){
            System.out.println("您的成绩优秀！");
        }else if (score >= 80 ){
            System.out.println("您的成绩良好");
        }else if (score >= 70){
            System.out.println("您的成绩中等");
        }else if (score >= 60){
            System.out.println("您的成绩及格");
        }else{
            System.out.println("您的成绩不及格");
        }


        //求三个数中的最大数
        int aa=23,bb=36,cc=25;
        if (aa>cc){
            max =aa;
        }else if (bb>cc){
            max =bb;
        }else
            max =cc;

        System.out.println("最大的值是：" + max);

        //switch语句
        System.out.println("接下来是switch语句了");
        char studentGrade = 'B';
        switch (studentGrade){
            case 'A':
            case 'a':
                System.out.println("优秀");
                break;
            case 'B':
            case 'b':
                System.out.println("良好");
                break;
            case 'C':
            case 'c':
                System.out.println("中等");
                break;
            case 'D':
            case 'd':
                System.out.println("及格");
                break;
            default :
                System.out.println("不及格");


        }


    }
}
