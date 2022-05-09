package net.yupeng.java.foundational.object.wrapper;

/**
 * 查找字符串的示例方法
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/10 0:55
 * @since JDK17
 */
public class FindCharDemo {
    public static void main(String[] args) {
        //判断电子邮箱地址是否正确
        String email = "yupeng@163.com"; //合法的邮箱地址
        int index= email.indexOf("@");  //判断邮箱地址中是否包含字符@
        if (index != -1){
            System.out.println("您的邮箱格式正确！");
        }else{
            System.out.println("您的邮箱格式不正确！");
        }

        //分析字符串，获得文件名
        String url = "D:\\JamesYusling\\技术应用专家\\大数据技术应用专家\\大数据课程\\01大数据发展趋势与鲲鹏大数据.mp4"; //用于测试的文件路径名
        int lastIndex =url.lastIndexOf("\\");  //查找最后一个文件分隔符的位置
        System.out.println(lastIndex);

        int lastIndex2 =url.lastIndexOf("\\");  //查找最后一个文件分隔符的位置
        System.out.println(lastIndex);
        if(lastIndex != -1){
            String filename = url.substring(lastIndex+1); //截取路径中的中文名
            System.out.println("您要查找的文件为："+ filename);
        }


    }
}
