/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springinterface;


/**
 *
 * @author Administrator
 */
public class Triangle implements Shape {

    private Point pointA, pointB, pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Drawing Triangle");
        System.out.println("A =(" + getPointA().getX() + " " + getPointA().getY() + ")");
        System.out.println("A =(" + getPointB().getX() + " " + getPointB().getY() + ")");
        System.out.println("A =(" + getPointC().getX() + " " + getPointC().getY() + ")");
//}

    }

}
