package net.yupeng.java.foundational.object;

/**
 * git 第一个 helloWorld
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2021/12/12 13:49
 * @since JDK17
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello Wordl windows10 & jdk17 &git &maven & idea2021.3");
        System.out.println("感觉自己好颓废呀呀呀呀，，2022-04-06   00000");
        System.out.println("应该每天花费十分钟去搞搞代码的");


        //一维数组
        int age[] = new int[2]; //定义一个整型数组
        String names[] = new String[3]; //定义一个字符串类型的数组
        boolean boo[] =new boolean[3]; //定义一个布尔数组
        System.out.println(age[0]); //输出数组age的第一个元素值
        System.out.println(age[1]); //输出数组age的第二个元素值
        //System.out.println(age[2); //错误，访问超出了数组的范围
        System.out.println(names[0]); //输出数组names的第一个元素值
        System.out.println(boo[0]); //输出数组boo的第一个元素值
        //访问一维数组
        int age2[]={18,19}; //定义一个整形数组，大小为2，并赋值初始化
        System.out.println(age2[0]); //输出数组age2的第一个元素值
        System.out.println(age2[1]); //输出数组age2的第二个元素值
        String names2[ ]= new String[]{"张三","李四","王五"};
        System.out.println(names2[0]);
        System.out.println(names2[1]);
        System.out.println(names2[2]);

        //修改一维数组
        int mathScore[] ={60,70,80};
        int englishScore[] ={60,70,80};
        int totalScore[] ={60,70,80};
        String studengts[]={"zs","ls","ww"};
        englishScore[0]=99;
        englishScore[1]=99;
        englishScore[2]=99;
        totalScore[0]=mathScore[0]+englishScore[0];
        totalScore[1]=mathScore[1]+englishScore[1];
        totalScore[2]=mathScore[2]+englishScore[2];
        System.out.println(studengts[0]+"同学的总成绩为："+totalScore[0]);
        System.out.println(studengts[1]+"同学的总成绩为："+totalScore[1]);
        System.out.println(studengts[2]+"同学的总成绩为："+totalScore[2]);
    }
}
