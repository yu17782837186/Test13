package cn.dataStructure.com;

public class TestMyList {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(5);
        myList.add(4);
        myList.add(3);
        myList.add(7);
        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        System.out.println(myList);
        System.out.println(myList.get(3));
        System.out.println(myList.indexOf(2));
        myList.add(6,"小红");
        myList.add(7,"小军");
        System.out.println(myList);
        System.out.println(myList.contains(8));
        myList.addAfter(7,"小");
        System.out.println(myList);

        myList.addBefore(7,"我能成功！！");
        System.out.println(myList);

        System.out.println(myList.remove(0));
        System.out.println(myList.size());
        System.out.println(myList);
        //System.out.println(myList.replace(0,"key"));
        myList.replace(0,"key");
        System.out.println(myList);
    }
}
