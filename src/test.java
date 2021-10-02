/**
 * Project name(项目名称)：StringBuffer类
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/2
 * Time(创建时间)： 19:11
 * Version(版本): 1.0
 * Description(描述)：
 * 创建 StringBuffer 类
 * StringBuffer 类提供了 3 个构造方法来创建一个字符串，如下所示：
 * StringBuffer() 构造一个空的字符串缓冲区，并且初始化为 16 个字符的容量。
 * StringBuffer(int length) 创建一个空的字符串缓冲区，并且初始化为指定长度 length 的容量。
 * StringBuffer(String str) 创建一个字符串缓冲区，并将其内容初始化为指定的字符串内容 str，字符串缓冲区的初始容量为 16 加上字符串 str 的长度。
 */

public class test
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        StringBuffer str = new StringBuffer(13);
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer("你好");
        System.out.println(str2);
        System.out.println(str.capacity());
        System.out.println(str1.capacity());
        System.out.println(str2.capacity());
        str2.append(",世界");
        System.out.println(str2.capacity() + "\t" + str2.length());
        System.out.println(str2.substring(0));
        System.out.println(str2);
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
    }
}
