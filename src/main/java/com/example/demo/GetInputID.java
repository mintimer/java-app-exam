package com.example.demo;

public class GetInputID {

    private static String[] args;

    public GetInputID(String[] args) {
        GetInputID.args = args;
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

    public int getInput() {
        return Integer.parseInt(args[0]);
    }
}
