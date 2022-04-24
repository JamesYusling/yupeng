package net.yupeng.java.foundational.object;

/**
 * 密码加密后破解密码
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/4/25 0:16
 * @since JDK17
 */
public class Decode {
    public static void main(String[] args) {
        char [] message ={'M',' ','p','s','z','i',' ','c','s','y','!'};
        System.out.println("破解密码前，message为：");
        for (int i = 0; i < message.length; i++) {
            System.out.print(message[i]);
        }
        //进行解密
        System.out.println("破解后的密码是message：");
        for (int i = 0; i < message.length; i++) {
            int character =message[i];
            if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')){
                character=character-4;  //解密，向前减四位
                if (character< 'A' || (character <= 'a' && character >='a'-4)){
                    //前进一圈， 26位
                    character=character+26;
                }

            }
            System.out.print((char) character);

        }
        System.out.println();


    }

}
