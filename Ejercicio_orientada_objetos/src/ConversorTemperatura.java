public class ConversorTemperatura {
    private double grados;

    public ConversorTemperatura(double grados){
        this.grados=grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }
    double toFahrenheitDegrees(){
        return (this.grados*1.8)+32;
    }
    double toCentigradeDegrees(){
        return (this.grados-32)/1.8;
    }
}
