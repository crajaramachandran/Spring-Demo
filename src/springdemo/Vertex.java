/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author Raja
 */
public class Vertex {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    @Required
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    @Required
    public void setY(int y) {
        this.y = y;
    }
    
}
