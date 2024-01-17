public class Calentador {
    private  Integer temperatura;
    private  Integer incremento;
    private  Integer maximo;
    private  Integer minimo;



    public Calentador(Integer minimo,Integer maximo) {
        this.temperatura=15;
        this.incremento=5;
        this.minimo=minimo;
        this.maximo=maximo;

    }
    public void calentar(){

        this.temperatura+=this.incremento;
        if (this.temperatura>maximo){
            throw new IllegalArgumentException("Error la temperatura no puede superar la maxima");
        }
    }
    public void enfriar(){

        this.temperatura-=this.incremento;
        if (this.temperatura<minimo){
            throw new IllegalArgumentException("Error la temperatura no puede superar la maxima");
        }
    }

    public Integer getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Integer temperatura) {
        this.temperatura = temperatura;
    }

    public Integer getMaximo() {
        return maximo;
    }

    public void setMaximo(Integer maximo) {
        this.maximo = maximo;
    }

    public Integer getMinimo() {
        return minimo;
    }

    public void setMinimo(Integer minimo) {
        this.minimo = minimo;
    }
    public Integer getIncremento() {
        return incremento;
    }

    public void setCremento(Integer cremento) {
        if (cremento<0){
            throw new IllegalArgumentException("el cremento no puede ser menor que 0");
        }
        this.incremento = cremento;
    }
}
