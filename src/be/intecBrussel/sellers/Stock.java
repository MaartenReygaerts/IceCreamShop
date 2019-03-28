package be.intecBrussel.sellers;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public class Stock {
    int iceRockets;
    int cones;
    int balls;
    int magni;

    public Stock() {
        this.iceRockets = 5;
        this.cones = 3;
        this.balls = 10;
        this.magni = 6;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagni() {
        return magni;
    }

    public void setMagni(int magni) {
        this.magni = magni;
    }
}
