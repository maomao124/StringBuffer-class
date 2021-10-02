/**
 * Project name(项目名称)：StringBuffer类
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/2
 * Time(创建时间)： 19:38
 * Version(版本): 1.0
 * Description(描述)：
 * 删除字符串
 * StringBuffer 类提供了 deleteCharAt() 和 delete() 两个删除字符串的方法，下面详细介绍。
 * 1. deleteCharAt() 方法
 * deleteCharAt() 方法用于移除序列中指定位置的字符，该方法的语法格式如下：
 * StringBuffer 对象.deleteCharAt(int index);
 * deleteCharAt() 方法的作用是删除指定位置的字符，然后将剩余的内容形成一个新的字符串。
 * <p>
 * 2. delete() 方法
 * delete() 方法用于移除序列中子字符串的字符，该方法的语法格式如下：
 * StringBuffer 对象.delete(int start,int end);
 * 其中，start 表示要删除字符的起始索引值（包括索引值所对应的字符），end 表示要删除字符串的结束索引值（不包括索引值所对应的字符）。
 * 该方法的作用是删除指定区域以内的所有字符
 */

public class test4
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        StringBuffer str = new StringBuffer("你好");
        str.append("世界");
        System.out.println(str);
        str.deleteCharAt(2);
        System.out.println(str);
        StringBuffer str1 = new StringBuffer("123456789");
        System.out.println(str1);
        str1.delete(3, 6);
        System.out.println(str1);
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
