package net.yupeng.java.foundational.object;

/**
 * 通信内容简单加密
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/24 0:29
 * @since JDK17
 */
public class Encrypt {
    public static void main(String[] args) {
        //加密 I love you!
        char [] message = {'I',' ','l','o','v','e',' ','y','o','u','!'};
        System.out.println("加密前的message：" );
        for (int i = 0; i < message.length; i++) {
            System.out.print(message[i]);
        }
        System.out.println( );
        System.out.println("加密后的message：");
        for (int i = 0; i < message.length; i++) {
            int character = message[i]; //获取字符串中第i+1个字符
            if ((character >= 'a' && character <= 'z' ) || (character >= 'A' && character <= 'Z' )){
                character=character+4; //每个字符的ASCII码值+4
                //如果换算以后的字符超出了字母表的范围，则从头再循环计算
                if ((character > 'Z' && character<= 'Z' + 4) || character > 'z'  ){
                    character=character-26;
                }
            }
            System.out.print((char) character);
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
                    character = character-26;
            }
            System.out.print((char) character);
        }


    }
}
