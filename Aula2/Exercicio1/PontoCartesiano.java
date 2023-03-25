package Aula2.Exercicio1;

public class PontoCartesiano {
    
    private Integer Xa, Xb, Ya, Yb;
    private float dAB;

    public PontoCartesiano(){

    }

    public PontoCartesiano(Integer xa, Integer xb, Integer ya, Integer yb, float dAB) {
        Xa = xa;
        Xb = xb;
        Ya = ya;
        Yb = yb;
        this.dAB = dAB;
    }

    public Integer getXa() {
        return Xa;
    }

    public void setXa(Integer xa) {
        Xa = xa;
    }

    public Integer getXb() {
        return Xb;
    }

    public void setXb(Integer xb) {
        Xb = xb;
    }

    public Integer getYa() {
        return Ya;
    }

    public void setYa(Integer ya) {
        Ya = ya;
    }

    public Integer getYb() {
        return Yb;
    }

    public void setYb(Integer yb) {
        Yb = yb;
    }

    public float getdAB() {
        return dAB;
    }

    public void setdAB(float dAB) {
        this.dAB = dAB;
    }

    public float calculaPontoCartesiano(){
        return dAB = (float) Math.sqrt((Xb-Xa)*(Xb-Xa) + (Yb-Ya)*(Yb-Ya));
    }

}
