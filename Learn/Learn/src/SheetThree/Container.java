package SheetThree;

public class Container <T>  {
    private T data;
    public Container(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "Container{" + "data=" + data + '}';
    }
}
