package com.example.demo;

import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.jcp.xml.dsig.internal.dom.ApacheTransform;

public class GetData {
    public static void main(String[] args) {
        AppGateway appGateway = new AppGateway();
        appGateway.getResponseItem(args);
        //Convert to CSV/Excel
    }
}
