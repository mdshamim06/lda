/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movielens;

import java.util.Vector;


/**
 *
 * @author kaldr
 */
public class test {
    public Vector<Integer>[] z;
    public test(){
        z=new Vector[3];
    }
    public static void main(String args[]) {
        test test=new test();
        test.z[1]=new Vector();
       test.z[1].add(12);

    }
}
