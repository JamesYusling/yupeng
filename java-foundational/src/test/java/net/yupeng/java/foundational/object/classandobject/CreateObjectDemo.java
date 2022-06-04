package net.yupeng.java.foundational.object.classandobject;

/**
 * 说明对象的使用，
 *
 * @author JamesYusling/yupeng 13596273436@163.com
 * @version 2022/6/5 1:25
 * @since JDK17
 */
//创建类Point,代表一个有着x坐标和y坐标的点
class Point{
    public int x = 0;   //声明int类型变量x,代表点的水平坐标
    public int y = 0;   //声明int类型变量y,代表点的垂直坐标
    //构造器

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
//创建类Rectangle,代表一个矩形
class Rectangle{
    public int width = 0;   //声明int类型变量width,代表矩形的宽
    public int height = 0;   //声明int类型变量height,代表矩形的高
    public Point origin;    //声明一个Point对象，代表一个点
    //四个构造器


    public Rectangle() {    //无参构造器
        origin = new Point(0,0);    //默认创建坐标为（0，0）的点
    }

    public Rectangle(Point origin) {    //带有一个Point类型的参数构造器
        this.origin = origin;   //使用已知的点origin初始化矩形左上角的点
    }

    public Rectangle(int width, int height) {   //带有两个参数的构造器
        origin = new Point(0,0);    //初始化矩形左上角坐标为（0，0）
        this.width = width;     //初始化矩形的宽
        this.height = height;     //初始化矩形的高
    }

    public Rectangle(int width, int height, Point origin) { //带有三个参数的构造器
        this.width = width;     //使用参数width初始化矩形的宽
        this.height = height;   //使用参数height初始化矩形的高
        this.origin = origin;   //使用已知的点origin初始化矩形左上角的点
    }
    //移动矩形的方法
    public void move(int x,int y){
        origin.x=x;     //将矩形左上角的x坐标改变为新的值
        origin.y=y;     //将矩形左上角的y坐标改变为新的值
    }
    //计算矩形面积的方法
    public int getArea(){
        return width * height;
    }
}

//主类，含有main()方法
public class CreateObjectDemo {
    public static void main(String[] args) {
        //声明并创建一个坐标点和两个矩形对象
        Point originOne = new Point(23,94);
        Rectangle rectOne = new Rectangle(100,200,originOne);   //使用已知的点创建一个矩形对象
        Rectangle rectTwo = new Rectangle(50,100);
        //显示rectOne的宽、高、面积
        System.out.println("rectOne的宽是："+rectOne.width);
        System.out.println("rectOne的宽是："+rectOne.height);
        System.out.println("rectOne的面积是："+rectOne.getArea());

        //设置rectTwo的位置
        rectTwo.origin=originOne;
        //显示rectTwo的位置
        System.out.println("rectTwo的x坐标是："+rectTwo.origin.x);
        System.out.println("rectTwo的y坐标是："+rectTwo.origin.y);

        //移动rectTwo并显示它的位置
        rectTwo.move(40,72);
        System.out.println("rectTwo的x坐标是："+rectTwo.origin.x);
        System.out.println("rectTwo的y坐标是："+rectTwo.origin.y);


    }
}
