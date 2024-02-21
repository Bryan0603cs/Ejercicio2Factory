package patronfactory;
public class PagosPayPal implements CrearPago{
    @Override

    public void Crearpago(){
        System.out.println("Digite su correo electronico para pagar con PayPal");
    }
}