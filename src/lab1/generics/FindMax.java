/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.generics;

public class FindMax {
    public static class Circle implements Comparable<Circle>{
        double r;
        public Circle(double r){
            this.r=r;
        }
        @Override
        public int compareTo(Circle c){
            if(this.r>c.r){
                return 1;
            }else if(this.r==c.r){
                return 0;
            }else{
                    return -1;
                    }
            }
        
        }
    public static <E extends Comparable<E>> E max(E[] list){
        E max=list[0];
        for(int i=0;i<list.length;i++){
            if(max.compareTo(list[i])<=0){
                max=list[i];
            }
        }
        return max;
        }
       
    
    
    public static void main(String[]args){
        Integer[] arra={1,2,3};
        String[] arrb={"red", "green", "blue"};
        Circle [] circles={new Circle(2.9),new Circle(3),new Circle(5.9)};
        
       System.out.println(max(arra));
       System.out.println(max(arrb));
       System.out.println(max(circles).r);
}
    
}
