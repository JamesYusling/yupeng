package net.yupeng.java.foundational.object;

/**
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/24 1:07
 * @since JDK17
 */
public class test {
    //通信内容简单加密

        public static void main(String[] args) {

            char[] message = {'I', ' ', 'l', 'o', 'v', 'e', ' ', 'y', 'o', 'u', '!'};  //定义要加密的字符数组
            System.out.println("加密之前，原文内容为：");  //先输出加密之前的内容
            for (int i = 0; i < message.length; i++) {         //遍历字符数组
                System.out.print(message[i]);          //输出数组中每一个字符
            }
            System.out.println();
            System.out.println("加密之后，密文内容为：");
            for (int i = 0; i < message.length; i++) {     //遍历字符数组的长度
                int character = message[i];        //获取字符串中第i+1个字符
                //如果为字符，则进行转换
                if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
                    character = character + 4;     //每个字符的ASCII码值加4
                    //如果换算以后的字符超出了字母表的范围，则从头再循环计算
                    if ((character > 'Z' && character <= 'Z' + 4) || character > 'z')
                        character = character - 26;
                }
                System.out.print((char) character);
            }
        }


}