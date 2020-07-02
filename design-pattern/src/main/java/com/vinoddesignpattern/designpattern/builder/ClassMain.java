package com.vinoddesignpattern.designpattern.builder;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class ClassMain {

    static class Employee{
        public String name;
        public int age;
        public int id;

        public Employee(String name, int age, int id) {
            this.name = name;
            this.age = age;
            this.id = id;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", id=" + id +
                    '}';
        }
    }
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("abc", 23, 5));
        employees.add(new Employee("xyz", 25, 1));
        employees.add(new Employee("bat", 31, 3));
        employees.add(new Employee("klm", 39, 6));
        employees.add(new Employee("ers", 80, 8));
        employees.forEach(f-> System.out.print(f));
        System.out.println("\n=====================");
        List<Employee> employees1 = employees.stream().filter(e -> ((e.id&1)==0)  && !e.name.equalsIgnoreCase("abc")).collect(Collectors.toList());
        employees1.forEach(f-> System.out.print(f));
        System.out.println("\n=====================");
    }















    public static void main1(String[] args) {
//        check(null);
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        Map<Integer, Integer > map = new HashMap<>();
        list.add(new Pair(1,5));
        list.add(new Pair(4,2));
        list.add(new Pair(6,9));
        map.put(1, map.getOrDefault(1, 0)+1);
        map.put(1, map.getOrDefault(1, 0)+1);
        map.put(1, map.getOrDefault(1, 0)+1);
        map.put(1, map.getOrDefault(1, 0)+1);
        map.put(1, map.getOrDefault(1, 0)+1);
        map.put(4, map.getOrDefault(4, 0)+1);
        map.put(4, map.getOrDefault(4, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.put(6, map.getOrDefault(6, 0)+1);
        map.entrySet().forEach(f->{
            System.out.println(f.getKey() + " : "+ f.getValue());
        });
        System.out.println("=================================");
        map = map.entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        map.entrySet().forEach(f->{
            System.out.println(f.getKey() + " : "+ f.getValue());
        });
        map = map.entrySet()
                .stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2)-> e2, LinkedHashMap::new));
        System.out.println("=================================");
        map.entrySet().forEach(f->{
            System.out.println(f.getKey() + " : "+ f.getValue());
        });
        System.out.println(" ===================================== "+ map.size());
        Set<Integer> set = map.keySet();
        /*for(Integer key : set){
            System.out.println(key + " : "+ map.get(key));
            map.remove(key);
//            map.remove(1);
        }*/
//
//        Collections.sort(list, (a,b) ->
//            a.getValue() - b.getValue()
//        );
//        list.forEach(f->{
//            System.out.println(f.getKey() +" : "+f.getValue());
//        });
    }

    static void check(String str){
        System.out.println("STRING :"+str);
    }
    static void check(Object str){
        System.out.println("OBJECT :" +str);
    }

    static void check(Integer str){
        System.out.println("INTEGER :" +str);
    }
}
