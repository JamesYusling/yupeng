package net.yupeng.java.foundational.object.wrapper;

/**
 * 用户登录验证程序
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/29 22:47
 * @since JDK17
 */
public class LoginCheck {
    public static void main(String[] args) {
        String originalUserName = "zhangxiaoming@163.com";  //声明固定用户名
        String originalPassWord = "123456";                 //声明原始密码
        //判断是否输入了用户名和密码
        if(args.length<2){
            System.out.println("请输入用户名和密码！");
            return;     //立即结束程序并返回，，后面的代码不再执行
        }
        //获取用户输入的用户名和密码
        String userName = args[0].trim();  //trim() 方法消除字符串首尾的空格
        String userPwd = args[0].trim();
        //将用户输入了用户名和密码与原始的用户名和密码进行比较
        if (!userName.equals(originalUserName)){
            System.out.println("抱歉，您的用户名不正确！请重新输入");
        }else if(!userPwd.equals(originalPassWord)){
            System.out.println("抱歉，您的密码不正确！请重新输入");
        }else {
            int index = originalUserName.indexOf('@');  //查找用户名中有没有符号‘@’
            String name = originalUserName.substring(0,index); //截取‘@’前的用户名
            System.out.println(name + "，欢迎您！您已经通过验证，可以进行操作");
        }




    }
}
