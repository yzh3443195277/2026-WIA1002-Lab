/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

public class Test {
    public static void main(String[] args) {
        // 创建一个装载字符(Character)的自定义链表
        MyLinkedList<Character> list = new MyLinkedList<>();

        // a. Append the following : a, b, c, d, e (在尾部追加)
        System.out.println("=== a. Append a, b, c, d, e ===");
        list.addLast('a');
        list.addLast('b');
        list.addLast('c');
        list.addLast('d');
        list.addLast('e');
        
        // b. Print all the elements in the list. (打印所有元素)
        System.out.println("\n=== b. Print all elements ===");
        list.print();

        // c. Reverse all the elements in the list. (逆序打印元素)
        System.out.println("\n=== c. Reverse all elements ===");
        list.reverse();

        // d. Retrieve the number of elements in the list. (获取元素数量)
        System.out.println("\n=== d. Number of elements ===");
        System.out.println("Total elements: " + list.getSize());

        // e. Retrieve the first and last value. (获取首尾元素)
        System.out.println("\n=== e. First and last value ===");
        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());

        // f. Delete the third value. (删除第三个值，即索引为 2 的元素)
        System.out.println("\n=== f. Delete the third value ===");
        list.remove(2); // 'a'是第1个(0), 'b'是第2个(1), 'c'是第3个(2)
        System.out.println("List after deleting the 3rd value:");
        list.print();

        // g. Retrieve the index location for the second and third value.
        // 这里的"第二个和第三个值"通常指原先的 'b' 和 'c'。因为 'c' 刚刚被删除了，这其实是个陷阱题。
        System.out.println("\n=== g. Index location for second ('b') and third ('c') value ===");
        System.out.println("Index of 'b': " + list.indexOf('b'));
        System.out.println("Index of 'c': " + list.indexOf('c')); // 这里应该返回 -1，因为'c'被删了

        // h. Checks if the list has the value 'c'. (检查是否包含 'c')
        System.out.println("\n=== h. Checks if the list has the value 'c' ===");
        System.out.println("Contains 'c'? " + list.contains('c')); // 应该返回 false

        // i. Replace the items individually with the following: j, a, v, a.
        // 当前链表剩4个元素 (a, b, d, e)，正好替换这4个位置 (索引 0, 1, 2, 3)
        System.out.println("\n=== i. Replace the items with j, a, v, a ===");
        list.set(0, 'j');
        list.set(1, 'a');
        list.set(2, 'v');
        list.set(3, 'a');
        System.out.println("Final list:");
        list.print();
        System.out.println("\n=== Q2. Return middle value");
        System.out.println(list.getMiddleValue());
        
    }
    
}