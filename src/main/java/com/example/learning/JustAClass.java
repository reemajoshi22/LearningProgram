package com.example.learning;

 public class JustAClass {
     public static void add(int a, long b) {
         System.out.println("all primitives");
     }

   //public static void add(Integer a, long b) {
   //     System.out.println("Wraper int, primitive long");
   //}

     public static void add(int a, Long b) {
         System.out.println("Primitive int, Wrapper long");
     }

     public static void add(Integer a, Long b){
         System.out.println("All wrapper");
     }

     public static void main(String[] args) {
        int a = 10;
        Integer b = 10;
        long c = 9;
        Long d = 9l;

        add(a,c);
        add(a,d);
        add(b,c);
        add(b,d);
 }

}