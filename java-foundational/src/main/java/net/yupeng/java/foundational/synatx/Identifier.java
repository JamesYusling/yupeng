package net.yupeng.java.foundational.synatx;

/**
 * 标识符的命名规则和命名规范
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2021/12/20 23:50
 * @since JDK17
 */
public class Identifier {

}

/**
 * 类的命名规范
*/
class UserInfo{

    /**
     * 常量的命名规范
     */
    public static final String DEFAULT_PASSWORD="111111";

    /**
     * 变量名的命名规范
     */
    private Long id;
    /**
     * 变量名的命名规范
     */
    private String userName;


    /**
     * 方法的命名规范
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}