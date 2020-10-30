/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;
import Entities.Chair;
import Entities.Money;
import interfaces.Product;
import interfaces.Worker;
import java.security.MessageDigest;


/**
 *
 * @author pavel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        double a = new Double(5656465);
        double b = 345.42594;
        double c = a+b;
        Worker boba = new Blacksmith();
//        boolean d = boba.doubleExpression(a, b, c);
        
        Product something = boba.work(arg0);
        
//        int f = Integer.MAX_VALUE+1;
//        System.out.println(d);
//        
//        Money money = new Money();
//        boba.makeChair(money);
//        Chair goodchair = boba.makeChair(money);
                                
//        MessageDigest md = MessageDigest.getInstance("MD5");
//        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
//        for (byte b : digest) {
//            System.out.printf("%02x", b);
    }
 }

