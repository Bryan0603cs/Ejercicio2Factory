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
            case TRANSFERENCIA-> new PagosTransferencia();
           

            default -> throw new NoSuchFieldException("Tipo de pago no encontrado");
        };
        

    }
    
}
