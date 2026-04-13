package lab1.generics;


public class StorePairGeneric <T> implements Comparable<T>{
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
   public boolean equals(StorePairGeneric temp){
       if(this.first==temp.first){
           return true;
       }else{
           return false;
       }
   public int compareTo(StorePairGeneric temp){
       
   }
   }
}
    

