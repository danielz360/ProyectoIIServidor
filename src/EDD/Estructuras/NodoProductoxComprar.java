package EDD.Estructuras;


public class NodoProductoxComprar 
{
	private String NickNameUsuario;
	private int Cantidad;
	private NodoProductoxComprar NodoSig;
	private NodoProductoxComprar NodoAnt;
	
	/**Constructor
	 * @pNombre Nombre del Usuario
	 * @pNickName NickName del Usuario
	 * @pContrasena Contrasena del Usuario
	 * @pNodoAnt Nodo Padre 
	 * */
	public NodoProductoxComprar(String pDireccion, boolean pEnvio,boolean pFacturacion) 
	{
		// TODO Auto-generated constructor stub
		Direccion = pDireccion;
		Envio = pEnvio;
		pFacturacion = Facturacion;
		NodoAnt = null;
		NodoSig = null;
	}
	
	public String ObtDireccion()
	{
		return Direccion;
	}
	public void SetDireccion(String pDireccion)
	{
		Direccion = pDireccion;
	}
	
	public boolean ObtEnvio()
	{
		return Envio;
	}
	public void SetEnvio(boolean pEnvio)
	{
		Envio = pEnvio;
	}
	public boolean ObtFacturacion()
	{
		return Facturacion;
	}
	public void SetFacturacion(boolean pFacturacion)
	{
		Facturacion = pFacturacion;
	}
	
	public NodoProductoxComprar ObtNodoSiguiente()
	{
		return NodoSig;
	}
	public void SetNodoSiguiente(NodoProductoxComprar nodo)
	{
		NodoSig = nodo;
	}
	public NodoProductoxComprar ObtNodoAnterior()
	{
		return NodoAnt;
	}
	public void SetNodoAnterior(NodoProductoxComprar nodo)
	{
		NodoAnt = nodo;	
	}
	public String ObtNickNameUsuario()
	{
		return NickNameUsuario;
	}	
	public String SetNickNameUsuario()
	{
		return NickNameUsuario;
	}	
}
