package complexe;
public class Complexe {
    private double re, im;

    public Complexe(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public Complexe plus(Complexe autre) {
        return new Complexe(this.re + autre.re, this.im + autre.im);
    }

    public Complexe moins(Complexe autre) {
        return new Complexe(this.re - autre.re, this.im - autre.im);
    }

    @Override
    public String toString() {
        if (im >= 0) return re + " +" + im + "i";
        else return re + " " + im + "i";
    }
}

