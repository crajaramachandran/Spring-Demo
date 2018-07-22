/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author Raja
 */
public class Circle implements Shape{
    private Vertex center;

    
    public Vertex getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleRelated")
    public void setCenter(Vertex center) {
        this.center = center;
    }
    
    public String getVertex(Vertex v){
        return "("+v.getX()+","+v.getY()+")";
    }

    @Override
    public void draw() {
        System.out.println("Circle\nCenter:"+getVertex(center));
    }
    
    
    
}
