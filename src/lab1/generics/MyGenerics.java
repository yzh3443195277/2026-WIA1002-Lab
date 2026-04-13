/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1.generics;

/**
 *
 * @author yzh34
 */
public class MyGenerics <E>{
    private E e;
    MyGenerics(){}
    MyGenerics(E e){
        this.e=e;
    }
    public void setter(E a){
        this.e=a;
    }
    public E getter(){
        return e;
    }

public static void main(String[]args){
 MyGenerics<String> strObj=new MyGenerics<>("Hurry");
 MyGenerics<Integer> intObj=new MyGenerics<>(3);
 System.out.println(strObj.getter()+"  "+intObj.getter());
}}
