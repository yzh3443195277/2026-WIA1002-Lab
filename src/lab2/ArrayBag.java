import java.util.Random;
public class ArrayBag<T> implements BagInterface<T>{
    private T[]bags=(T[])new Object[25];
    private Integer DEFAULT_CAPACITY=25;
    private Integer numberOfEntries=0;
    
    public int getCurrentSize(){
        return numberOfEntries;
    }
    public boolean isFull(){
        if(numberOfEntries==DEFAULT_CAPACITY) 
            return true;
        else return false;
    }
    public boolean isEmpty(){
        if(numberOfEntries==0) 
            return true;
        else return false;
    }
    public boolean add(T newEntry){
       if(this.isFull()==false && newEntry!=null){
                bags[numberOfEntries]=newEntry;
                numberOfEntries ++;
        return true;
       }else {
           System.out.println("Sorry,your bag already full");
           return false;      
       }
    }
    public T remove(){
        if(this.isEmpty()==false){
            Random r=new Random();
            int randomindex=r.nextInt(numberOfEntries);
            T re=bags[randomindex];
            bags[randomindex]=null;
            numberOfEntries--;
            return re;
        }else return null;
    }
public boolean remove(T anEntry){
    if (anEntry == null) {
        return false; 
    }
    for(int i = 0; i < numberOfEntries; i++){
        if(bags[i] != null && bags[i].equals(anEntry)){
            bags[i] = bags[numberOfEntries - 1]; 
            bags[numberOfEntries - 1] = null;    
            
            numberOfEntries--;
            return true;
        }
    } 
    return false; 
}

    public void clear(){
        for(int i=0;i<this.numberOfEntries;i++){
            bags[i]=null;
        }
        numberOfEntries=0;
    }
    public int getFrequencyOf(T anEntry){
        int target=0;
        for(int i=0;i<this.numberOfEntries;i++){
        if(bags[i].equals(anEntry)){
            target++;
        }}
        return target;
    
    }
    public boolean contains(T anEntry){
            if(this.getFrequencyOf(anEntry)==0)
                return true;
            else return false;
        }
    public T[] toArray(){
        return bags;
    }
    public ArrayBag<T> union(ArrayBag<T> bag){
        ArrayBag<T> union=new ArrayBag<>();
        for(int i=0;i<this.numberOfEntries;i++){ 
            union.add(bags[i]);}
        for(int i=0;i<bag.numberOfEntries;i++){ 
            union.add(bag.toArray()[i]);
    }return union;
    }
    
    public ArrayBag<T> intersection(ArrayBag<T> bag){
        ArrayBag<T> intersection=new ArrayBag<>() ;
        T[] arr2=bag.toArray();
        for (int i = 0; i < this.numberOfEntries; i++) {
        T currentItem = this.bags[i];
        if (currentItem == null) {
            continue;
        }      
        for (int j = 0; j < arr2.length; j++) {
            if (currentItem.equals(arr2[j])) {
                intersection.add(currentItem);
                arr2[j] = null;
                break; 
            }
        }
    }
        return intersection;
    }
    
    public ArrayBag<T> difference(ArrayBag<T> bag){
    ArrayBag<T> diffBag = new ArrayBag<>();
    for(int i = 0; i < this.numberOfEntries; i++){ 
        diffBag.add(this.bags[i]);        
    } 
    T[] otherArray = bag.toArray();
    for(int i = 0; i < bag.getCurrentSize(); i++){
        if (otherArray[i] != null) {
            diffBag.remove(otherArray[i]); 
        }
    }
    
    return diffBag;
}}
