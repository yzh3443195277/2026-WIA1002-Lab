
public class ArrayBagDemo {
    private static void testAdd(BagInterface<String> aBag, String[] content){
        for(int i=0;i<content.length;i++){
          aBag.add(content[i]);
        }
    }
    private static void displayBag(BagInterface aBag){
        Object[] bagArray = ((BagInterface) aBag).toArray();
        System.out.println("there are "+aBag.getCurrentSize()+" elements in the bag");
        for(int i=0;i<aBag.getCurrentSize();i++){
          System.out.print(bagArray[i]+" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        ArrayBag<String> bag1=new ArrayBag<>();
        ArrayBag<String> bag2=new ArrayBag<>();
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "anotherstring"};
        
        testAdd(bag1,contentsOfBag1);
        testAdd(bag2,contentsOfBag2);
        
        displayBag(bag1);
        displayBag(bag2);
        
        ArrayBag<String> bag3=bag1.union(bag2);
        displayBag(bag3);
        
        ArrayBag<String> bag4=bag1.intersection(bag2);
        displayBag(bag4);
        
        ArrayBag<String> bag5=bag1.difference(bag2);
        displayBag(bag5);
    }
}
