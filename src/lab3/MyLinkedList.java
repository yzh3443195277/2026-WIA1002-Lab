
package lab3;

public class MyLinkedList<E>{
    Node<E> head;
    Node<E> tail;
    int size;
    
    MyLinkedList(){
        this.head=null;
        this.tail=null;
        size=0;
    }
    
    public void addFirst(E item){
        Node<E> newNode=new Node<>(item);
        if (head==null){
            head=tail=newNode;
        }else{
        newNode.next=head;
        head=newNode;
    }
        size++;
       }
    public void addLast(E item){
         Node<E> newNode=new Node<>(item);
         if (head==null){
            head=tail=newNode;
        }else{
             tail.next=newNode;
             tail=newNode;
         }
         size++;
    }
     public void add(int index, E e){//0 1 2 3
         Node<E> newNode=new Node<>(e);
          if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }else if(index==0){
            this.addFirst(e);
        }else if(index==size){
            this.addLast(e);
        }else{
            newNode.next=this.getNode(index);
            Node<E> current = getNode(index - 1);
            newNode.next=current.next;
            current.next=newNode;
            size++;
        }
          
     }
     public E removeFirst(){
         if(head==null){
             throw new RuntimeException("the list is empty");
         }
         E element=head.element;
         if(head==tail){
             head=tail=null;
         }else{
             head=head.next;
         }
         size--;
         return element;
     }
     
      public E removeLast(){
          if(head==null){
             throw new RuntimeException("the list is empty");
         }
           E element=tail.element;
         if(head==tail){
             head=tail=null;
         }else{
             Node<E> current=head;
             while(current.next!=tail){
                 current=current.next;
             }
             current.next=null;
             tail=current;
         }
         size--;
         return element;
      }
      public E remove(int index){
          if(head==null){
             throw new RuntimeException("the list is empty");
         }if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        
           E element=getNode(index).element;
         if(index==0){
             this.removeFirst();
      }else if(index==size-1){
          this.removeLast();
      }else{
          Node<E> current=this.getNode(index-1);
          current.next=current.next.next;
      }
         size--;
         return element;
      }
     public boolean contains(E e){
          if(head==null){
             throw new RuntimeException("the list is empty");}
          else{
              Node<E> current=head;
              while(current!=null){
                  if(current.equals(e))
                      return true;
                  current=current.next;
              } return false;
          }
             
     }
    public E get(int index){
        E element=getNode(index).element;
        return element;
    }
     public E getFirst(){
         if(head==null){
             throw new RuntimeException("the list is empty");
         }else{
         E element=head.element;
         return element;
         }
     }
     public E getLast(){
         if(head==null){
             throw new RuntimeException("the list is empty");
         }else{
         E element=tail.element;
         return element;
         }
     }
     public int indexOf(E e){
         Node<E> current=head;
         for(int i=0;i<size;i++){
             if(e.equals(current.element))
                 return i;
             current=current.next;
         }return -1;
     }
     public E set(int index,E e){
         if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");}
         Node<E> current=head;
         for(int i=0;i<index;i++){
             current=current.next;
             }
             E old=current.element;
             current.element=e;
         
         return old;
     }
     public void clear(){
         head=tail=null;
         size=0;
     }
     public void print(){
         Node<E> current=head;
         for(int i=0;i<size;i++){
             System.out.println(current.element+" ");
             current=current.next;
         }
     }
    public void reverse() {
        System.out.print("[ ");
        reversePrintHelper(head);
        System.out.println("]");
    }

    public int getSize() {
        return size;
    }
    
    
    public E getMiddleValue(){
        //龟兔赛跑
    // 1. 如果链表为空，直接返回 null
    if (head == null) {
        return null;
    }
    
    // 2. 计算中间位置的索引
    // 注意：Java 中整数除法会自动向下取整。
    // 比如 size=5 时，5/2=2 (第3个元素)；size=4 时，4/2=2 (偏右的中间元素)
    int midIndex = size / 2; 
    
    // 3. 从头节点开始往后走
    Node<E> current = head;
    for (int i = 0; i < midIndex; i++) {
        current = current.next;
    }
    
    // 4. 返回找到的元素
    return current.element;
        
    }
    // 辅助递归方法：用于逆序打印
    private void reversePrintHelper(Node<E> current) {
        if (current == null) {
            return;
        }
        reversePrintHelper(current.next); // 先递归到最后一个节点
        System.out.print(current.element + " "); // 返回时打印
    }

     
         
      
      
      
     //support method
     private Node<E> getNode(int index){
         if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
         Node<E> current=head;
         for(int i=0;i<index;i++){
             current=current.next;
         }
         return current;
     }
     
}
