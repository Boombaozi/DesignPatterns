package Iterator;

public class ArrayList {

    Object[] objects =new Object[10];
    private int size=0;

    public void add(Object o){
         if(size==objects.length){
             Object[] newob= new Object[objects.length*2];
             for (int i = 0; i <objects.length ; i++) {
                 newob[i]=objects[i];
             }
             objects=newob;
         }
         objects[size] =o;
         size++;
    }

    public int size(){
        return size;
    }


}
