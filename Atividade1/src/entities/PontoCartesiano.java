package entities;

public class PontoCartesiano {
    
    private Float xa, xb, ya, yb;

    public PontoCartesiano(){

    }

    public PontoCartesiano(Float xa, Float xb, Float ya, Float yb) {
        this.xa = xa;
        this.xb = xb;
        this.ya = ya;
        this.yb = yb;
    }

    public Float getXa() {
        return xa;
    }

    public void setXa(Float xa) {
        this.xa = xa;
    }

    public Float getXb() {
        return xb;
    }

    public void setXb(Float xb) {
        this.xb = xb;
    }

    public Float getYa() {
        return ya;
    }

    public void setYa(Float ya) {
        this.ya = ya;
    }

    public Float getYb() {
        return yb;
    }

    public void setYb(Float yb) {
        this.yb = yb;
    }

    
    public Float distEuclidiana(){
        float res = (float) Math.sqrt(((xb - xa)*(xb - xa)) + ((yb - ya)*(yb - ya)));
        return res;
    }
}
