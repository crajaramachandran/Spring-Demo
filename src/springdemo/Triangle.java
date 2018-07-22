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
public class Triangle implements Shape{
    
    private Vertex origin;
    private Vertex vertexA;
    private Vertex vertexB;

    public Vertex getOrigin() {
        return origin;
    }
    
    @Required
    public void setOrigin(Vertex origin) {
        this.origin = origin;
    }

    public Vertex getVertexA() {
        return vertexA;
    }
    @Required
    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexB() {
        return vertexB;
    }
    @Required
    public void setVertexB(Vertex vertexB) {
        this.vertexB = vertexB;
    }

    
    public String getVertex(Vertex v){
        return "("+v.getX()+","+v.getY()+")";
    }
    
    public void draw(){
        System.out.println("Triangle vertices");
        System.out.println("origin:"+getVertex(origin));
        System.out.println("vertexA:"+getVertex(vertexA));
        System.out.println("vertexB:"+getVertex(vertexB));

        
    }   

    
}
