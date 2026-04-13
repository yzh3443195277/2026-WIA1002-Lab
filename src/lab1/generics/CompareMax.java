/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.generics;

/**
 *
 * @author yzh34
 */
import java.lang.Comparable;
public class CompareMax {
    public static <T extends Comparable<T>> T maximum(T a,T b,T c){
        T max;
        if(a.compareTo(b)>0 && a.compareTo(c)>0){
             max=a;
        }
        if (a.compareTo(b)>0 && a.compareTo(c)>0){
             max=b;
        }else{
             max=c;
        }
        return max;
    }
    public static void main(String[]args){
        System.out.println(maximum(10,20,30));
    }
    
}
