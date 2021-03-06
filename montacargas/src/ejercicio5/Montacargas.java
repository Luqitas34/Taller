package ejercicio5;

public class Montacargas {

    private Integer pesoMaximo;
    private Integer pesoAcumulado;
    private Integer pesoDescargado;
    private Integer cantidadDescargas;

    public Montacargas(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
        pesoAcumulado = 0;
        pesoDescargado = 0;
        cantidadDescargas = 0;
    }
    
    public void cargar(Integer peso) throws Exception{
        if(pesoAcumulado + peso > pesoMaximo){
            throw new Exception();
        }
        pesoAcumulado += peso;
    }
    
    public int obtenerCarga(){
        return pesoAcumulado;
    }

    public void descargar() {
        pesoDescargado += pesoAcumulado;
        pesoAcumulado = 0;
        cantidadDescargas++;
    }

    public int obtenerCargaPromedio() {
        if(cantidadDescargas != 0){
            return pesoDescargado / cantidadDescargas;
        }
        return 0;
    }
}
