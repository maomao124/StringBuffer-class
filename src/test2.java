import java.util.Scanner;

/**
 * Project name(项目名称)：StringBuffer类
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/2
 * Time(创建时间)： 19:26
 * Version(版本): 1.0
 * Description(描述)： 每个新学期开始，学校都会针对本学期课程列出必修课程。
 * 编写一个 Java 程序，要求用户向控制台循环录入五门必修课程名称，并将这五个名称进行连接，最后输出连接后的字符串。代码如下：
 */

public class test2
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        StringBuffer name = new StringBuffer();
        System.out.println("请输入5门课程的名称：");
        Scanner input = new Scanner(System.in);
        String s = "";
        for (int i = 0; i < 5; i++)
        {
            s = input.next();
            name.append(s).append("\t");
        }
        System.out.println("5门课程的名称为：");
        System.out.println(name);
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
