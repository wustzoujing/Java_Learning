package com.test.obj;

/**
 * Created by zoujing on 2017/5/10.
 *
 */

    //默认也会继承object，这里就证明toString()方法被调用了。
    public class Employee extends Object {
        private String name;
        public Employee(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public static void main(String[] args) {
            Employee emp = new Employee("John Doe");

            //System.out.println(emp.getName());
            System.out.println(emp.getClass());
        }
    }

