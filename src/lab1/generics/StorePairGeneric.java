package lab1.generics;


public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>>{
    //这代码什么意思：StorePairGeneric能和<StorePairGeneric<T>>比较
    //                StorePairGeneric里的T能和<T>比较，这第二行是为了重写第一行的compareTo做铺垫的。
   private T first, second;
   
   public StorePairGeneric(T first, T second) {
       this.first = first;
       this.second = second;
   }
   public T getFirst() {
       return first;
   }
   public T getSecond() {
       return second;
   }
   public void setPair(T first, T second) {
       this.first = first;
       this.second = second;
   }
   public String toString() {
       return "first = " + first + " second = " + second;
   }
   @Override
   public boolean equals(Object temp){
       StorePairGeneric<T> o=(StorePairGeneric) temp;
       return this.first.equals(o.first);
//override StorePairGeneric这个class的equal方法，也可以在重写时调用属性first的类（也就是E）的equal方法
       }
   @Override
   public int compareTo(StorePairGeneric<T> temp){
       return this.first.compareTo(temp.first);
   }
   public static void main(String[]args){
       StorePairGeneric<Integer> a=new StorePairGeneric<>(6,4);
       StorePairGeneric<Integer> b=new StorePairGeneric<>(2,2);
       StorePairGeneric<Integer> c=new StorePairGeneric<>(6,3);
       
       System.out.println(a.compareTo(c));
        System.out.println(a.equals(b));
       
   }
   
}
    

