package aeropuerto;

public class TransporteAeropuerto {

    private String tipoTransporte;

    public TransporteAeropuerto(String tipoTransporte){
        this.tipoTransporte = tipoTransporte;
    }

    public float cobrarPasaje(String origen, String destino, int cantidadPasajeros){

        if(this.tipoTransporte == "Tren Interno")
        {
            return 0; //El tren internos es un servicio gratis del aeropuesro.
        }else{
            if(this.tipoTransporte == "Minibus")
            {
                if(origen == "Terminal A" && origen == "Terminal A")
                    return 0;
                if(origen == "Terminal A" && origen == "Terminal B")
                    return 5;
                if(origen == "Terminal A" && origen == "Terminal C")
                    return 10;
                if(origen == "Terminal B" && origen == "Terminal A")
                    return 5;
                if(origen == "Terminal B" && origen == "Terminal B")
                    return 0;
                if(origen == "Terminal B" && origen == "Terminal C")
                    return 5;
                if(origen == "Terminal C" && origen == "Terminal A")
                    return 10;
                if(origen == "Terminal C" && origen == "Terminal B")
                    return 5;
                if(origen == "Terminal C" && origen == "Terminal C")
                    return 0;
            }else{
                if(this.tipoTransporte == "Coche Privado"){
                    if(this.calcularKilometros(origen,destino) < 2){
                        return 10 * cantidadPasajeros * 1.21f; //Se cobra un 21% de IVA.
                    }
                    if(this.calcularKilometros(origen,destino) >= 2 && this.calcularKilometros(origen,destino) < 4){
                        return 20 * cantidadPasajeros * 1.21f;
                    }
                    if(this.calcularKilometros(origen,destino) >= 4){
                        return 20 * cantidadPasajeros * 1.21f * 1.2f;//Se cobra un 20% mas por ser lejos.
                    }
                }
            }
            return 0;
        }
    }
    private float calcularKilometros(String origen, String destino){
        if(origen == destino)
            return 0f;
        if((origen == "Terminal A" && destino == "Terminal B") ||
                (origen == "Terminal B" && destino == "Terminal A") ||
                (origen == "Terminal B" && destino == "Terminal C") ||
                (origen == "Terminal C" && destino == "Terminal B"))
            return 3f;
        else
            return 5f;
    }
}