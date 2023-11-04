public class LengthConversion {
private double inches;
private double meters;
private double yards;
private double Km;
private double Cm;
private double miles;

    public LengthConversion(double inches, double meters, double yards, double km, double cm, double miles) {
        this.inches = inches;
        this.meters = meters;
        this.yards = yards;
        Km = km;
        Cm = cm;
        this.miles = miles;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getMeters() {
        return meters;
    }

    public void setMeters(double meters) {
        this.meters = meters;
    }

    public double getYards() {
        return yards;
    }

    public void setYards(double yards) {
        this.yards = yards;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double km) {
        Km = km;
    }

    public double getCm() {
        return Cm;
    }

    public void setCm(double cm) {
        Cm = cm;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
