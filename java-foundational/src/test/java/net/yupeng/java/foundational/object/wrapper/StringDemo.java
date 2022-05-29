package net.yupeng.java.foundational.object.wrapper;

/**
 * 使用String对象实现输出一首回文诗
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/29 21:24
 * @since JDK17
 */
public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "香莲碧水动风凉 水动风凉夏日长";   // palindrome 回文(正反读都一样的词语);
        int len = palindrome.length();                  //获取字符串对象的长度
        char [] tempCharArray = new char[len];          //创建字符数组
        char [] charArray = new char[len];              //创建字符数组

        //将原始字符串中的字符放到字符数组中
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);
        }

        //反转字符数组中的字符
        for (int i = 0; i < len; i++) {
            charArray[i] = tempCharArray[len-1-i];
        }
        String reverPalindrome = new String(charArray); //使用反转后的字符数组创建新的字符串
        System.out.println(palindrome);
        System.out.println(reverPalindrome);

    }
}
