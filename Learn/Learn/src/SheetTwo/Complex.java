package SheetTwo;

public class Complex {
    private double rel;
    private double img;

    public Complex() {
        this(0, 0);
    }

    public Complex(double rel, double img) {
        this.rel = rel;
        this.img = img;
    }

    public void setRel(double rel) {
        this.rel = rel;
    }

    public void setImg(double img) {
        this.img = img;
    }

    public double getRel() {
        return rel;
    }

    public double getImg() {
        return img;
    }

    public boolean isReal() {
        return img == 0;
    }

    public boolean isImaginary() {
        return rel == 0 && img != 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Complex)) return false;
        Complex c = (Complex) o;
        return this.rel == c.rel && this.img == c.img;
    }

    public Complex addTo(Complex c) {
        return new Complex(this.rel + c.rel, this.img + c.img);
    }

    public Complex multiplyTo(Complex c) {
        double real = this.rel * c.rel - this.img * c.img;
        double imag = this.rel * c.img + this.img * c.rel;
        return new Complex(real, imag);
    }

    public Complex conjugate() {
        return new Complex(this.rel, -this.img);
    }

    public double magnitude() {
        return Math.sqrt(rel * rel + img * img);
    }

    @Override
    public String toString() {
        if (img >= 0)
            return rel + " + " + img + "i";
        else
            return rel + " - " + (-img) + "i";
    }
}
