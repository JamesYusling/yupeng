package net.yupeng.java.foundational.object.classandobject;

/**
 * get和set方法的类
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 15:14
 * @since JDK17
 */
public class AutoCar {
    private String brand;   //表示汽车的品牌
    private float exhaust;   //表示汽车的排气量
    private int speed;   //表示汽车的速度
    /*
    * 快速添加 getter/setter 方法：Alt + Insert
    */
    public String getBrand() {
        return brand;
    }

    public float getExhaust() {
        return exhaust;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // AutoCar类的构造器
    /*构造器的名称必须与类名相同。
    构造器没有返回类型，包括关键字void也不能有。
    任何类都含有构造器。如果没有显式地定义类的构造器，则系统会为该类提供一个默认的构造器。这个默认的构造器不含任何参数。一旦在类中显式地定义了构造器，系统就不会再为这个类提供默认的构造器了。
    */
    public AutoCar(String brand, float exhaust, int speed) {
        this.brand = brand;
        this.exhaust = exhaust;
        this.speed = speed;
    }

    public AutoCar(int speed) {
        this.speed = speed;
    }
}
