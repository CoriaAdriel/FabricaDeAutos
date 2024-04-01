import java.util.ArrayList;

public class Principal
{
    public static void main(String[] args)
    {
        // Creamos fábricas
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        f.listarInstrumentos();
//        ArrayList<Instrumento> lista = f.instrumentoPorTipo(TipoInstrumento.VIENTO);
//        for (Instrumento instrumento :lista) {
//            System.out.println(instrumento);
//        }
//        Instrumento instrumentoBorrado = f.borrarInstrumento("ABC123");
//        System.out.println("Se ha borrado el instrumento: " + instrumentoBorrado);
//        f.listarInstrumentos();

        // Calculamos el porcentaje de cada instrumento por tipo
//        double[] porc = f.porcIntrumentosPorTipo("Sucursal A");
//        for(int i = 0; i < porc.length; i++){
//            System.out.println(porc[i]);;
//        }
    }
    private static void cargarFabrica(Fabrica f)
    {
        // Creamos sucursales
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");

        // Agregamos instrumentos a las sucursales, creamos objetos de tipo Instrumentos a medida que agregamos objetos
        s1.agregarInstrumentos(new Instrumento("ABC123", 13214, TipoInstrumento.CUERDA));
        s1.agregarInstrumentos(new Instrumento("BCD456", 13432, TipoInstrumento.PERCUSION));
        s1.agregarInstrumentos(new Instrumento("DEF789", 15464, TipoInstrumento.VIENTO));

        s2.agregarInstrumentos(new Instrumento("ASD753", 13214, TipoInstrumento.CUERDA));
        s2.agregarInstrumentos(new Instrumento("VXCBE", 13432, TipoInstrumento.VIENTO));

//        s1.listarInstrumentos();

        // Agregamos sucursales a las fábricas
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
    }
}
