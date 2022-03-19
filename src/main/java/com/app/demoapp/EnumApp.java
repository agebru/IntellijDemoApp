package com.app.demoapp;

public class EnumApp {


    public static void main(String[] args) {

        DAYS[] values = DAYS.values();
  // iter ==> then enter

        for(DAYS d:values){
            System.out.print(d.getValue()+" ");
        }

        System.out.println();
        String name = DAYS.MONDAY.getValue();
        System.out.println(name);
        DAYS.MONDAY.lunch();
        //CTRL+ALT+V ==> Assign to local variable
    }
public void hello(){
    System.out.println("Hello");
}

    enum DAYS{
        MONDAY("Monday"){
            @Override
            public void lunch(){
                System.out.println("Monday: Lunch is Shiro! ");
            }
        },
        TUESDAY("Tuesday") {
            @Override
            public void lunch() {
                System.out.println("Tuesday: Lunch is Firfir! ");
            }
        },
        WENDESDAY("Wendesday"){
            @Override
            public void lunch() {
                System.out.println("WednesDay: Lunch is Kicha! ");
            }

        },
        THURSDAY("Thursday"){
            @Override
            public void lunch() {
                System.out.println("Thursday: Lunch is Keyih Tsebhi! ");
            }
        },
        FRIDAY("Friday"){
            @Override
            public void lunch() {
                System.out.println("Friday: Lunch is Dabo! ");
            }
        },
        SATURDAY("Satuday"){
            @Override
            public void lunch() {
                System.out.println("Satuday: Lunch is Tibsi! ");
            }
        },
        SUNDAY("Sunday"){
            @Override
            public void lunch() {
                System.out.println("Sunday: Lunch is Geat! ");
            }
        };

        private String value;
// Enum Constructor should always be private
       private DAYS(String value){
            this.value=value;

        }
        public String getValue(){
            return this.value;
        }

        public abstract void lunch();
    };
}


