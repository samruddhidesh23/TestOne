package dynamicArrayGeneric;

public class DynamicArray <T>{

    private T [] data;
    private int top = -1;

    private int size;

    public DynamicArray(int size){
        if(data.length<size){
            this.data=data;
            data = (T[]) new Object [size];
        }else if(data.length>size){
            this.data=data;
            data = (T[]) new Object [size*2];
        }else{
            System.out.println("array is out of bound");
        }
    }

    public void add(T element){
        data[++top]= element;
    }

    public void add(int Index,T element){
        for(int i=0;i<data.length;i++){
            if(i==Index){
                data[i]=element;
            }
            i=i+1;
        }
    }

    public void remove(int Index){
        for(int i=0;i<data.length;i++){
            if(i==Index){
                continue;
            }
            i--;
        }
    }

    public boolean  get(int Index){
        for(int i=0;i<data.length;i++){
            if(i==Index){
                System.out.println("element is present in array");
                return true;
            }
        }
        return false;
    }

    public void size(){
        int s = data.length;
        System.out.println("size of the array is"+s);
    }

    public void display(){
        for(int i =0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
