package cn.dataStructure.com;

public interface List {

    //返回线性表的大小，即数据元素的个数
    public int size();

    //返回线性表中序号为i的数据元素
    public Object get(int i);

    //如果线性表为空，返回true，否则返回false
    public boolean isEmpty();

    //判断线性表是否包含数据元素key
    public boolean contains(Object key);

    //返回数据元素key在线性表中的序号
    public int indexOf(Object key);

    //将数据元素key插入到线性表中i号位置
    public void add(int i,Object key);

    //将数据元素key插入到线性表末尾
    public void add(Object key);

    //将数据元素key插入到元素obj之后
    public boolean addAfter(Object obj,Object key);

    //将数据元素key插入到元素obj之前
    public boolean addBefore(Object obj,Object key);

    //删除线性表中序号为i的元素，并将其返回
    public Object remove(int i);

    //删除线性表中第一个与Object相同的元素
    public boolean remove(Object obj);

    //替换线性表中序号为i的数据元素为key,返回原数据元素
    public Object replace(int i,Object key);
}
