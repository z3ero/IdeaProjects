package cn.iie.day08.Interfacee;

public interface CompareObject {
    /**
     * 用于比较两个对象
     * @param o 向上转型
     * @return >0 表示当前对象大
     *  <0 表示比较对象大
     *  =0 表示相等
     */
    int compareTo(Object o);
}

