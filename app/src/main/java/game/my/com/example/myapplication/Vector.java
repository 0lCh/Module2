package game.my.com.example.myapplication;

public class Vector {
    float x, y;

    public void print() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    void sum(Vector v) {
        this.x += v.x;
        this.y += v.y;
    }

    void min(Vector v) {
        this.x -= v.x;
        this.y -= v.y;
    }

     void mul(float k) {
        x *= k;
        y *= k;
    }

    void set(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        x = 0;
        y = 0;
    }

    Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    void cre(Vector a, Vector b) {
        this.sum(a);
        this.min(b);
    }

    void sum(float v, float v1) {
        this.x += v;
        this.y += v1;
    }

    void min(float v, float v1) {
        this.x -= v;
        this.y -= v1;
    }

    static Vector v;

    public static void main(String argS[]) {
        System.out.println(v);
    }


}
