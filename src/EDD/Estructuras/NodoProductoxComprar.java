package EDD.Estructuras;


public class NodoProductoxComprar 
{
	private String NickNameUsuario;
	private int Cantidad;
	private NodoProducto Producto;
	private NodoProductoxComprar NodoSig;
	private NodoProductoxComprar NodoAnt;
	
	/**
	 * 
	 * @param pCantidad
	 * @param pProducto
	 */
	public NodoProductoxComprar(int pCantidad, NodoProducto pProducto) 
	{
		// TODO Auto-generated constructor stub
		Cantidad = pCantidad;
		Producto = pProducto;
		NodoAnt = null;
		NodoSig = null;
	}
	
	public int ObtCantidad()
	{
		return Cantidad;
	}
	public void SetCantidad(int pCantidad)
	{
		Cantidad = pCantidad;
	}
	
	public NodoProducto ObtProducto()
	{
		return Producto;
	}
	public void SetProducto(NodoProducto pProducto)
	{
		Producto = pProducto;
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
