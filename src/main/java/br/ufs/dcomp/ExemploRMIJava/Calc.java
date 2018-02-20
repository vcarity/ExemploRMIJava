package br.ufs.dcomp.ExemploRMIJava;

import java.rmi.*;
/**
 * Hello world!
 *
 */
public class Calc implements ICalc{
    public int add(int x, int y) throws RemoteException{
        System.out.println("Add Done");
        return (x+y);
    }
    public int mult(int x, int y) throws RemoteException{
        System.out.println("Mult Done");
        return (x*y);
    }
}
