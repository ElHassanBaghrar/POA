package fr.parisnanterre.miage.poa.shapes.impl;


import fr.parisnanterre.miage.poa.shapes.api.Translatable3D;

public abstract class Shape3D extends Shape implements Translatable3D {
    private Point3D refPoint;

    public Shape3D()
    {
        this.refPoint = refPoint;
    }

    public Point3D getrefPoint() {return this.refPoint;}
    public void setrefPoint(Point3D refPoint) {this.refPoint = refPoint;}

    public double volume()
    {
        return 0;

    }
    public Point3D getRefPoint()
    {
        return this.refPoint;
    }



}
