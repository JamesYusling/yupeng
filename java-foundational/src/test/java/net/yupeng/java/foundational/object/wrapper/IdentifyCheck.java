package net.yupeng.java.foundational.object.wrapper;

/**
 * 通过身份证号以什么开始，以什么结尾来进行简单的  身份信息查找
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/14 0:49
 * @since JDK17
 *
 * 在程序IdentifyCheck中，使用String类的startsWith()方法，判断代表身份证号的ID是否以指定的参数开头。
 * 身份证的头三位代表了地址。使用String类的endsWith()方法，判断代表身份证号的ID是否以指定的参数结尾，
 * 并进而根据最后一位数的奇偶性判断性别。如果以奇数结尾，则为男士，如果以偶数结尾，则为女士。
 */
public class IdentifyCheck {
    public static void main(String[] args) {
        String ID = new String("610523199912118078");
        String name = "先生";
        String address = "未知";
        if(ID.startsWith("610523")){
            address="陕西渭南";
        }
        //判断性别，单数为男性，偶数为女性
        for (int i = 0; i < 10; i++,i++) {  //循环所有的偶数（个数）
            String endChar = ""+i;          //将一位偶数变为字符串
            if(ID.endsWith(endChar)){       //如果ID以偶数结尾
                name="女士";                 //改变称呼
                break;
            }
        }

        System.out.println(name + ",您的地址：" + address); //输出信息
    }
}
