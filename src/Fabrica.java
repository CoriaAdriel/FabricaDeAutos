import java.util.ArrayList;

public class Fabrica
{
    private ArrayList<Sucursal> sucursales;

    public Fabrica(){
        this.sucursales = new ArrayList<>();
    }
    public void agregarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }
    public void listarInstrumentos(){
        for (Sucursal sucursal : sucursales) {
            System.out.println(sucursal.getNombre());
            sucursal.listarInstrumentos();
        }
    }
    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo)
    {
        ArrayList<Instrumento> instEncontrados = new ArrayList<>();
        for (Sucursal sucursal : sucursales)
        {
            instEncontrados.addAll(sucursal.instrumentoPorTipo(tipo));
        }

        return instEncontrados;
    }
    public Instrumento borrarInstrumento(String ID)
    {
        Instrumento instrumentoBorrado = null;

        // Realizamos una búsqueda por ID
        int i = 0;
        while (i < sucursales.size() && instrumentoBorrado == null)
        {
            instrumentoBorrado = sucursales.get(i).borrarInstrumento(ID);
            i++;
        }
        return instrumentoBorrado;
    }
    public double[] porcIntrumentosPorTipo(String nombreSuc){
        double[] porcentajes = new double[TipoInstrumento.values().length];

        Sucursal sucursalEncontrada = buscarSucursal(nombreSuc);
        if(sucursalEncontrada != null) {
            porcentajes = sucursalEncontrada.porcIntrumentosPorTipo();
        }
        return porcentajes;
    }
    public Sucursal buscarSucursal(String nombreSuc){
        int i = 0;
        Sucursal sucEncontrada = null;
        while (i < sucursales.size() && !this.sucursales.get(i).getNombre().equals(nombreSuc));{
            i++;
        }
        if(i < sucursales.size()){
            sucEncontrada = this.sucursales.get(i);
        }
        return sucEncontrada;
    }
}
