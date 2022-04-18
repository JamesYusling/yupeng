package net.yupeng.java.foundational.object;

/**
 * 循环语句
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/18 22:43
 * @since JDK17
 */
public class WhileDoWhileFor {
    public static void main(String[] args) {
        int [] mathSocre = new int[200];
        //为数组中的所有元素赋初始值60
        int i =0;   //定义循环变量
/*        while (i<200){  //循环200边
            mathSocre[i]=60;  //为每一个数组元素赋初始值60
            System.out.println("第"+i+"个值为："+i);
            i++;    //循环自增1
            System.out.println("第"+i+"++个值为："+i);
        }*/

/*        System.out.println("++i 会先累加再计算："+i);
        //++i 会先累加再计算
        while (++i<2){
            System.out.println("第"+i+"个值为："+i);
        }

        System.out.println("i++ 会计算再累加："+i);

        //i++ 会先计算再累加
        while (i++<2){
            System.out.println("第"+i+"个值为："+i);
        }*/


        //求100以内的所有偶数之和
        i=0;
        int j =0;

        while(i<=100){
            j +=  i;
            i += 2;

        }
        System.out.println("输出第一个j:"+j);
        j=0;
        i=0;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
        //取余得偶数
        while (i<=100){
            if (i%2 == 0){
                j+=i;
            }
            i++;
        }
        System.out.println("输出j:"+j);

        j=0;
        i=0;
        //do-while 语句
        do {
            if (i%2==0){
                j+=i;
            }
            i++;
        }while (i<=100);

        System.out.println("do-while输出j:"+j);

        j=0;
        //for循环 求100以内的偶数之和
        for (i=0;i<=100;i++){
            if (i%2==0){
                j+=i;
            }
            i++;

        }
        System.out.println("for循环输出j:"+j);


        //嵌套循环二维数组
        int [][] arrays=new int[5][5];
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                arrays[k][l]=k+l;  //第k行第l列的元素值为k和l的和
            }
        }
        //输出二维数组
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(arrays[k][l] + " ");
            }
            System.out.println("");//换行
        }

        //增强for循环  先把二位数组循环成一维数组，再把一维数组循环为单个数据
        System.out.println("增强for循环:");
        for (int[] w:arrays ) {
            for (int ww:w) {
                System.out.print(ww + " ");
            }
            System.out.println("");//换行
        }
    }
}
