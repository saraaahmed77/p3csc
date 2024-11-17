public class Nod<T> {

public T data;
public Nod<T> next;

public Nod () {
data = null;
next = null;
}

public Nod (T val) {
data = val;
next = null;
}
public T getData() {
   return data;
}

 public void setData(T data) {
 this.data = data;
 }               
 public Nod<T> getNext() {
   return next;
}

public void setNext(Nod<T> next) {
this.next = next;
}
}