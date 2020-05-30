package CicilanCalculator.src;

public class Cicilan {
    private int hargaAwal, durasiCicilan;
    private double bunga;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
    }

    // public Cicilan(int hargaAwal) {
    // this.hargaAwal = hargaAwal;
    // }

    // public Cicilan(int durasiCicilan) {
    // this.durasiCicilan = durasiCicilan;
    // }

    // public Cicilan(double bunga) {
    // this.bunga = bunga;
    // }

    public int getHargaAwal() {
        return hargaAwal;
    }

    private void setHargaAwal(int hargaAwal) {
        this.hargaAwal = hargaAwal;
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    private void setDurasiCicilan(int durasiCicilan) {
        this.durasiCicilan = durasiCicilan;
    }

    public double getBunga() {
        return bunga;
    }

    private void setBunga(double bunga) {
        this.bunga = bunga;
    }

}