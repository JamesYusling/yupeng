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
        String findMe = "mee";
        int searchMeLength =searchMe.length();
        int findMeLength = findMe.length();

        boolean foundIt =false;
        for (int i = 0; i <= (searchMeLength-findMeLength); i++) {
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
