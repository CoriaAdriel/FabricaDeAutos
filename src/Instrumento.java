public class Instrumento
{
    private String ID;
    private double  precio;
    private TipoInstrumento tipo;

    public Instrumento(String ID, double precio, TipoInstrumento tipo)
    {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                "ID='" + ID + '\'' +
                ", precio=" + precio +
                ", tipo=" + tipo +
                '}';
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public String getID() {
        return ID;
    }
}
