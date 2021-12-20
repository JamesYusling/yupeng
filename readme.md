#  2021-12-12




# 2021-12-14
syntax   /ˈsɪntæks/
语法  

comments
注释

` 查看jdk源码   shift连摁两下，  在Classes-All Places 里面搜索`

### idea翻译插件的使用
    settiings - plugins - Translation 


# 2021-12-20   计算机进制和信息存储单位
    ## 二进制转10进制
        1101=1*2^3 + 1*2^2 + 0*2^1 + 1*2^0 = 13

    ## 十进制转二进制
        短除法  除以2，直到商数为0，将余数倒转
        13/2=6 余1
        6/2=3 余0
        3/2=1 余1
        1/2=0 余1
        将余数倒转 为1101

    ##计算机信息存储单位
        ###常用的计算机信息存储单位
        位（bit）计算机信息存储最小的单位0，1
        字节（Bite）计算机的基本存储单位 1Byte=8bit
        千字节（KB）1KB=1024B
        兆字节（MB）1MB=1024KB
        吉字节（GB）1GB=1024MB
        太字节（TB）1TB=1024GB
        PB --一般接触不到
    
    ##关于计算机信息存储单位的两个生活常识
        100M/8=12.5  100M宽带实际最大只有12.5M
        因为装宽带说的100M指的是100Mbit
        
        1TB硬盘到手只有931.3GB
        1000*1000*1000*1000/1024/1024/1024=931.3

# 2021-12-20   Java开发规范
    ## 标识符和关键字
        名字
            包名 net.yupeng.foundational.object
            类名 HelloWorld
            方法名 main
            常量名
            变量名

        标识符命名规则
            1、不能以数字开头，但是可以包含数值、字母、下划线
            2、不能是关键字，但是可以包含关键字

        标识符命名规范
            1、包名 小写的单词组成 com.taobao  域名倒过来
            2、类名 大驼峰命名法 HelloWorld
            3、方法名、变量名 小驼峰命名法 getUserName()  userName()
            4、常量名 单词字母大写，多个单词使用下划线隔开 DEFAULT_PASSWORD
            5、见名知意

        ## 关键字
            关键字就是被Java征用了。赋予了特殊的含义，public,class,static都是关键字
    ## IDEA克隆开源项目

    ## 阿里巴巴Java开发手册

    ## 阿里开发规范插件的使用

















































