import java.util.ArrayList;

public class Sucursal
{
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public void agregarInstrumentos(Instrumento instrumento){
        this.instrumentos.add(instrumento);
    }

    public void listarInstrumentos(){
        for (Instrumento instrumento :
                instrumentos) {
            System.out.println(instrumento);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo)
    {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();

        for (Instrumento instrumento : instrumentos)
        {
            if(instrumento.getTipo() == tipo)
            {
                instEncontrados.add(instrumento);
            }
        }
        return instEncontrados;
    }

    public Instrumento borrarInstrumento(String ID)
    {
        // buscarInstrumentoPorID
        // Si existe, borralo
        Instrumento instrumentoABorrar = buscarInstrumento(ID);
        this.instrumentos.remove(instrumentoABorrar);

        return instrumentoABorrar;
    }
    private Instrumento buscarInstrumento(String ID)
    {
        int i= 0;
        Instrumento instrumentoEncontrado = null;
        while (i < instrumentos.size() && this.instrumentos.get(i).getID().equals(ID))
        {
            i++;
        }
        if(i < instrumentos.size())
        {
            instrumentoEncontrado = this.instrumentos.get(i);
        }
        return instrumentoEncontrado;
    }
    public double[] porcIntrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];

        for (Instrumento instrumento :instrumentos) {
            porcentajes[instrumento.getTipo().ordinal()]++;
        }
        absolutoAPorcentaje(porcentajes);
        return porcentajes;
    }
    private void absolutoAPorcentaje(double[] porcentajes){
        for(int i= 0; i < porcentajes.length; i++){
            porcentajes[i] = (porcentajes[i] * 100) / instrumentos.size();
        }
    }
}
