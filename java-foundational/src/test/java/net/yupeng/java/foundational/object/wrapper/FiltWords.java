package net.yupeng.java.foundational.object.wrapper;

/**
 * 敏感词过滤
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 0:17
 * @since JDK17
 */
public class FiltWords {
    public static void main(String[] args) {
        //设置敏感词
        String [ ] sensitiveWords1 = {"性","色情","爆炸","恐怖","枪"};
        String [ ] sensitiveWords2 = {"暴力","拉登","导弹"};
        //接收用户通过控制台传进来的参数字符串，模拟用户聊天内容
        if (args.length<1){
            System.out.println("没有输入内容，请重新输入！");
            return;         //立即结束程序并返回，后面的代码不再执行
        }
        String chatContent = args[0];
        //将用户聊天内容与需要屏蔽的敏感词进行匹配
        for (int i = 0; i < sensitiveWords1.length; i++) {
            int index = chatContent.indexOf(sensitiveWords1[i]);
            if (index != -1){ //如果查找到了敏感词
                chatContent = chatContent.replaceAll(sensitiveWords1[i],"");    //用空字符串替换
            }
        }
        //将用户聊天内容替换的敏感词
        for (int i = 0; i < sensitiveWords2.length; i++) {
            int index = chatContent.indexOf(sensitiveWords2[i]);
            if(index != -1){
                chatContent = chatContent.replaceAll(sensitiveWords2[i],"和平");
            }
        }
        //输出过滤后的聊天内容
        System.out.println("您的聊天内容为：" + chatContent);




    }
}
