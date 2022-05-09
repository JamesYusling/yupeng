package net.yupeng.java.foundational.object.wrapper;

/**
 * 统计一行字符中的字母、数字以及其他字符的个数
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/10 0:02
 * @since JDK17
 */
public class CountCharDemo {
    public static void main(String[] args) {
        String str1 ="hello,my name is Peng,I am 18 years! ";
        String str2 ="hello,my name is Jack,I am 18 years! ";
        int count1 = 0,count2 = 0,count3 = 0; //分别用来统计字母、数字以及其他字符的个数
        char [] strChar = str2.toCharArray();  //把字符转为字符数组
        for (int i = 0; i < strChar.length; i++) {
            if(strChar[i] >='a' && strChar[i] <= 'z' || strChar[i] >='A' && strChar[i] <= 'Z'){
                count1++;
            }else if (strChar[i] >='0' && strChar[i] <='9'){
                count2++;
            }else{
                count3++;
            }

        }
        System.out.println("count1,字母个数为"+count1);
        System.out.println("count1,数字个数为"+count2);
        System.out.println("count1,其他字符个数为"+count3);


    }
}
