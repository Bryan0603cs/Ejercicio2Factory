package patronfactory;

public class PagosBaratos {

    public CrearPago ObtenerPago (TiposDePago tiposDePago) throws NoSuchFieldException{
        return switch (tiposDePago){
            case APPLE -> new PagoApple();
            case EFECTIVO-> new PagoEfectivo();
            case BITCOIN -> new PagosBitcoin();
            case CREDITO-> new PagosCredito();
            case PAYPAL -> new PagosPayPal();
            case DEBITO -> new PagosDebito();
            case GOOGLE -> new PagosGoogle();
            case TRANFERENCIA-> new PagosTransferencia();
           

            default -> throw new NoSuchFieldException("Tipo de pago no disponible para este servicio");
        };
        

    }
    
}
