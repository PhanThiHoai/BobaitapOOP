/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai15.shape2;

import bai15.Circle;

/**
 *
 * @author admin
 */
public class Circle2 extends Shape2 implements Action{
    int r;
    public Circle2(int _x, int _y, int _r) {
        super(_x, _y);
        r = _r;
        draw();
        }
    @Override
    public void moveTo(int x1, int y1) {
        erase();
        int x = x1;
        int y = y1;
        draw();
    }

    @Override
    public void erase() {System.out.println("Than lop erase");}
    @Override
    public void draw() {System.out.println("Than lop draw");}
    public static void main(String [] args){
        Circle c = new Circle (10,10, 100);
        c.erase();
        c.draw();
    }

}