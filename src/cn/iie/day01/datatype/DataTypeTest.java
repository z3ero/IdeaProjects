package cn.iie.day01.datatype;

/**
 * 用于测试数据类型与转换
 */
public class DataTypeTest {
    public static void main(String [] args){
        char ch = 'A';
        byte b = 15;
        short s = 5;
        int i = 100;
        long l = 10L;
        float f = 15.0f;
        double d = 10.0;
        boolean b1 = true;
        // 由小到大自动转，由大到小需强制
        int byte2int = b;
        int short2int = s;
        long short2long = s;
        int char2int = ch;

        byte int2byte = (byte)i;
        short int2short = (short)i;
        float double2float = (float)d;


        String s2 = "a" + i;
        short sh = (short)(s*2);    // s*2  2是int, s*2 自动转int

        // 与大范围的类型 运算，最终结果自动转为大类型

        // 特例：byte, short, char 运算时，先转为 int 数据类型
        int chPlusb = ch + b;
        // short res = s + b;  是错误的，因为 short 和 byte 运算时，都会先转为 int
        short res = (short)(s+b);

    }
}
