/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisonmaker;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Wout
 */
public class Container implements Serializable{
    private final HashMap h;
    private final HashMap hist;
    int q;
    int c;
    
    public Container(HashMap map, HashMap hi, int n, int cu)
    {
        h = map;
        hist = hi;
        q = n;
        c = cu;
    }
    
    public HashMap getMap()
    {
        return h;
    }
    
    public HashMap getHist()
    {
        return hist;
    }
    
    public int getQN()
    {
        return q;
    }
    
    public int getCu()
    {
        return c;
    }
}
