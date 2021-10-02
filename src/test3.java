/**
 * Project name(项目名称)：StringBuffer类
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/2
 * Time(创建时间)： 19:34
 * Version(版本): 1.0
 * Description(描述)：
 * 替换字符
 * StringBuffer 类的 setCharAt() 方法用于在字符串的指定索引位置替换一个字符。该方法的语法格式如下：
 * StringBuffer 对象.setCharAt(int index, char ch);
 *
 * 反转字符串
 * StringBuffer 类中的 reverse() 方法用于将字符串序列用其反转的形式取代。该方法的语法格式如下：
 * StringBuffer 对象.reverse();
 */

public class test3
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        StringBuffer s = new StringBuffer("hello");
        s.setCharAt(1,'E');
        System.out.println(s);    // 输出：hEllo
        s.setCharAt(0,'H');
        System.out.println(s);    // 输出：HEllo
        s.setCharAt(2,'p');
        System.out.println(s);    // 输出：HEplo
        s.reverse();
        System.out.println(s);
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
