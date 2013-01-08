package EDD.Estructuras;


public class NodoUsuario 
{
	private String NickName, Contrasena;
	private NodoUsuario NodoSig;
	private NodoUsuario NodoAnt;
	private ListaDireccion Direcciones;
	private ListaProductosxComprar ProductosxComprar;
	//private ListaProductosxComprar ProductosxComprar;
	
	/**Constructor
	 * @pNombre Nombre del Usuario
	 * @pNickName NickName del Usuario
	 * @pContrasena Contrasena del Usuario
	 * @pNodoAnt Nodo Padre 
	 * */
	public NodoUsuario(String pNickName,String pContrasena, ListaDireccion pDirecciones) 
	{
		// TODO Auto-generated constructor stub
		NickName = pNickName;
		Contrasena = pContrasena;
		Direcciones = pDirecciones;
		ProductosxComprar = null;
		NodoAnt = null;
		NodoSig = null;
	}
	
	public ListaDireccion ObtDirecciones()
	{
		return Direcciones;
	}
	public void SetDirecciones(ListaDireccion pDirecciones)
	{
		Direcciones = pDirecciones;
	}
	
	public ListaProductosxComprar ObtProductosxComprar()
	{
		return ProductosxComprar;
	}
	public void SetDirecciones(ListaProductosxComprar pProductosxComprar)
	{
		ProductosxComprar = pProductosxComprar;
	}
	
	public NodoUsuario ObtNodoSiguiente()
	{
		return NodoSig;
	}
	public void SetNodoSiguiente(NodoUsuario nodo)
	{
		NodoSig = nodo;
	}
	public NodoUsuario ObtNodoAnterior()
	{
		return NodoAnt;
	}
	public void SetNodoAnterior(NodoUsuario nodo)
	{
		NodoAnt = nodo;	
	}
	public String ObtNickName()
	{
		return NickName;
	}	
	public String SetNickName()
	{
		return NickName;
	}	
	public String ObtContrasena()
	{
		return Contrasena;
	}	
	public String SetContrasena()
	{
		return Contrasena;
	}	
}
