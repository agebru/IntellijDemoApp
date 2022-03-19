package com.app.demoapp.exception;

public class NotFoundExeption extends Exception {
    public NotFoundExeption(String messaage) {
        super(messaage);
    }

    public String getAMessageStatement() {

        String message = super.getMessage();
        if (message.length() != 0) {
            String[] split = message.split(".");
            //
            if(split.length!=0){
               return split[0] ;
            }
        }
        return "No Exception found!";
    }
}
