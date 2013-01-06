package EDD.Estructuras;


public class NodoUsuario 
{
	private String NickName, Contrasena;
	private NodoUsuario NodoSig;
	private NodoUsuario NodoAnt;
	private ListaDireccion Direcciones;
	
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
		NodoAnt = null;
		NodoSig = null;
	}
	
	public ListaDireccion ObtDirecciones()
	{
		return Direcciones;
	}
	public void SetArbolContactos(ListaDireccion pDirecciones)
	{
		Direcciones = pDirecciones;
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
