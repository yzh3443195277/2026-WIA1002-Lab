/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.generics;

/**
 *
 * @author yzh34
 */
public class MinMax {
    public static void main(String[]args){
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};   
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
        
    }
    public static <E extends Comparable<E>> String minmax(E[]arrays){
        //E类继承接口，凡是E类型都可以调用。继承接口搞清楚针对哪个类。
        E max=arrays[0];
        E min=arrays[0];
        for(int i=0;i<arrays.length;i++){
            if(max.compareTo(arrays[i])<=0){
                max=arrays[i];
            }if(min.compareTo(arrays[i])>=0){
                min=arrays[i];
        }
        }
        return "Min="+min+"Max="+max;
    }
}
