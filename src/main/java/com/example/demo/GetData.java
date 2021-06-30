package com.example.demo;

public class GetData {

    private static String[] args;

    public GetData(String[] args) {
        GetData.args = args;
    }

    public boolean validateInput() {
        if (args.length==1){
            try {
                Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                return false;
            }
            return true;
        }
        return false;
    }
}
