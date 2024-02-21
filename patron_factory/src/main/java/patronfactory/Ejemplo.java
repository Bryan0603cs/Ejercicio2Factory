package patronfactory;

public class Ejemplo {
    public static void main(String[] args) throws NoSuchFieldException {
        //ejemploConIF(TipoDePago.BITCOIN);
        procesarPago(TiposDePago.PAYPAL);
        procesarPago(TiposDePago.CREDITO);
        procesarPago(TiposDePago.BITCOIN);
        procesarPago(TiposDePago.APPLE);
    }

    public static void ejemploConIF(TiposDePago tiposDePago) {
        if (tiposDePago == TiposDePago.PAYPAL) {
            crearPagoPayPal();
        } else if(tiposDePago == TiposDePago.CREDITO){
            //hacer algo
        } else if(tiposDePago == TiposDePago.DEBITO){
            //hacer algo
        } else if(tiposDePago == TiposDePago.TRANSFERENCIA){
            //hacer algo
        } else if(tiposDePago == TiposDePago.BITCOIN){
            //hacer algo
        } else if(tiposDePago == TiposDePago.EFECTIVO){
            //hacer algo
        } else if(tiposDePago == TiposDePago.APPLE){
            //hacer algo
        } else if(tiposDePago == TiposDePago.GOOGLE){
            //hacer algo
        } else {
            //hacer algo
        }
    }

    public static void crearPagoPayPal() {
        //Tener cada uno de estos método hará que la clase crezca mucho :(
    }

    public static void procesarPago(TiposDePago tipoDePago) throws NoSuchFieldException {
        PagosBaratos pagosBaratos = new PagosBaratos();
        CrearPago pago = pagosBaratos.ObtenerPago(tipoDePago);
        pago.Crearpago();
    }
}
