package net.yupeng.java.foundational.object.wrapper;

/**
 * 产看B字符串是否在A字符串中
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/5/14 0:29
 * @since JDK17
 */
public class RegionMathesDemo {

    public static void main(String[] args) {
        String searchMe = "Green Eggs and me";
        String findMe = "gree";
        int searchMeLength =searchMe.length();
        int findMeLength = findMe.length();

        boolean foundIt =false;
        for (int i = 0; i <= (searchMeLength-findMeLength); i++) {
            /*
            *  boolean  regionMatches(int toffset,String other,int ooffset,int len)
            *  测试当前字符串指定范围与参数字符串指定范围是否相匹配。
            *  指定范围为当前字符串从索引toffset开始长度为len的字符序列
            *  和参数字符串从索引ooffset开始长度为len的字符序列
            * */
            if (searchMe.regionMatches(i,findMe,0,findMeLength)){
                foundIt=true;
                System.out.println(searchMe.substring(i,i+findMeLength));
                break;
            }

        }
        if (!foundIt){
            System.out.println("没有发现匹配的内容");
        }





    }
}
