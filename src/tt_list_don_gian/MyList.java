package tt_list_don_gian;

import java.lang.ref.PhantomReference;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    //tăng gấp đôi kích thước mảng
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //thêm phần tử vào cuối mảng
    public void add(E e) {
        //nếu size == elements.length thì đó là tối đa rồi, không thể add thêm pt nào đc nữa
        // => gọi pthuc ensureCapa() để mở rộng thêm kích thước mảng
        if (size == elements.length) {
            ensureCapa();
        }
        //phần tử thứ size+1 được gán cho phần tử e (đc thêm vào).
        elements[size++] = e;
    }

    //trả về phần tử vừa ở vị trí [i] trong danh sách
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", size: " + i);
        }
        return (E) elements[i];
    }
}
