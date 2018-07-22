package Iterator;

/**
 * @program: DesignPatterns
 * @description:
 * @author: boombaozi.com
 * @create: 2018-07
 **/


public class Test {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        for (int i = 0; i < 15; i++) {
            arrayList.add("ss"+i);
        }

        System.out.println(arrayList.size());
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.print((String)arrayList.objects[i]+"  ");
        }
    }
}
