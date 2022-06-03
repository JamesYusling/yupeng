package net.yupeng.java.foundational.object.classandobject;

/**
 * 输出AutoCar实例的属性值
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/3 15:35
 * @since JDK17
 */
public class TestAutoCar {
    public static void main(String[] args) {
        AutoCar autoCar = new AutoCar("长安", 0.0F,70);    //创建一个AutoCar类的实例对象
        AutoCar autoCar1 = new AutoCar(70);    //创建一个AutoCar类的实例对象
        System.out.println("当前汽车的品牌为：" + autoCar.getBrand());
        System.out.println("当前汽车的排气量为：" + autoCar.getExhaust());
        System.out.println("当前汽车的车速为：" + autoCar.getSpeed());

        System.out.println("当前汽车autoCar1的品牌为：" + autoCar1.getBrand());
        System.out.println("当前汽车autoCar1的排气量为：" + autoCar1.getExhaust());
        System.out.println("当前汽车autoCar1的车速为：" + autoCar1.getSpeed());
    }
}
