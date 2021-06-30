package com.example.demo;

public class GetData {
    public static boolean ValidateInput(String[] args) {
        if (args.length==1){
            int input = 0;
            try {
                input = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }
}
