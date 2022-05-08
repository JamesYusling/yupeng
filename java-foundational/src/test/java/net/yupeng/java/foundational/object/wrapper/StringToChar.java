package net.yupeng.java.foundational.object.wrapper;

/**
 * 字符串与字符串数组转换示例
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/9 0:15
 * @since JDK17
 */
public class StringToChar {
    public static void main(String[] args) {
        String helloString = "hello! ";
        char [] helloArray = helloString.toCharArray();
        for (int i = 0; i < helloArray.length; i++) {
            System.out.println(helloArray[i]);
        }
    }
}
