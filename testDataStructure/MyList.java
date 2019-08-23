package cn.dataStructure.com;

import java.util.Arrays;

public class MyList implements List {
    private Object[] elementDatas;
    private int size;
    private static final int DEFAULT = 6;
    public MyList() {
        this.elementDatas = new Object[DEFAULT];
    }

    @Override
    public int size() {
        return this.size;
    }
    private void checkIndex(int i) {
        if (i<0 ||i>size) {
            throw new RuntimeException("数组索引位置越界异常;"+i);
        }
    }
    @Override
    public Object get(int i) {
        checkIndex(i);
        return elementDatas[i];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object key) {
        for (int i = 0; i < size ; i++) {
            if (elementDatas[i] == key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object key) {
        for (int i = 0; i < size; i++) {
            if (elementDatas[i] == key) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(int i, Object key) {

        checkIndex(i);

        if (size == elementDatas.length) {
            elementDatas = Arrays.copyOf(elementDatas,elementDatas.length*2);
        }

        for (int j = size ; j > i ; j--) {
            elementDatas[j] = elementDatas[j-1];
        }

        elementDatas[i] = key;
        size++;
    }

    @Override
    public void add(Object key) {
        if (size == elementDatas.length) {
            elementDatas = Arrays.copyOf(elementDatas,elementDatas.length*2);
        }
        elementDatas[size] = key;
        size = size + 1;
        //this.add(size,key);
    }

    @Override
    public boolean addAfter(Object obj, Object key) {
        for (int i = 0; i < size ; i++) {
            if (elementDatas[i] == obj && i == size -1) {
                elementDatas = Arrays.copyOf(elementDatas,elementDatas.length*2);
                elementDatas[i+1] = key;
            }else if (elementDatas[i] == obj){
                for (int j = size; j > i; j--) {
                    elementDatas[j] = elementDatas[j-1];
                }
                elementDatas[i+1] = key;
                break;
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean addBefore(Object obj, Object key) {
        for (int i = 0; i < size ; i++) {
            if (elementDatas[i] == obj && i == size -1) {
                elementDatas = Arrays.copyOf(elementDatas,elementDatas.length*2);
                elementDatas[i+1] = elementDatas[i];
                elementDatas[i] = key;
            }else if (elementDatas[i] == obj){
                for (int j = size; j >= i-1; j--) {
                    elementDatas[j] = elementDatas[j-1];
                }
                elementDatas[i-1] = key;
                break;
            }
        }
        size++;
        return false;
    }

    @Override
    public Object remove(int i) {
        checkIndex(i);
        Object data = elementDatas[i];
        for (int j = i; j < size; j++) {
            elementDatas[j] = elementDatas[j+1];
        }
        size--;
        return data;
    }

    @Override
    public boolean remove(Object obj) {
        for (int i = 0; i < size ; i++) {
            if (elementDatas[i] == obj) {
                elementDatas[i] = elementDatas[i+1];
            }
        }
        size--;
        return true;
    }

    @Override
    public Object replace(int i, Object key) {
        checkIndex(i);
        Object data = elementDatas[i];
        elementDatas[i] = key;
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size ; i++) {
            if (i != size -1) {
                sb.append(elementDatas[i]+",");
            }else {
                sb.append(elementDatas[i]);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
