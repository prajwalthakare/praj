package inetexample;

import java.net.*;
import java.io.*;

public class inet {
public static void main(String[] args) {
	
	try{
		
		InetAddress IP=InetAddress.getByName("www.google.com");
		
		System.out.println("HOst Name:"+IP.getHostName());
		System.out.println("Host Address(IP addr):"+IP.getHostAddress());
		
	}catch(Exception e){
		System.out.println(e);
	}
	
}
	
}
