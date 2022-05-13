package net.yupeng.java.foundational.object.wrapper;

/**
 * 通过身份证号以什么开始，以什么结尾来进行简单的  身份信息查找
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/14 0:49
 * @since JDK17
 */
public class IdentifyCheck {
    public static void main(String[] args) {
        String ID = new String("61052319941211807X");
        String name = "先生";
        String address = "未知";
        if(ID.startsWith("610523")){
            address="陕西";
        }
        //判断性别，单数为男性，偶数为女性
        for (int i = 0; i < 10; i++,i++) {
            String endChar = ""+i;
            if(ID.endsWith(endChar)){
                name="女士";
                break;
            }
        }

        System.out.println(name + ",您的地址：" + address); //输出信息
    }
}
