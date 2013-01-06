package EDD.Estructuras;


public class ListaUsuario 
{
	private NodoUsuario Cabeza;
	private NodoUsuario Fin;
	
	/**Constructor*/
	public ListaUsuario() 
	{
		// TODO Auto-generated constructor stub
	    Cabeza = null;
	    Fin = null;
	}
	
	/**Indica si la lista está vacia*/
    private boolean EstaVacia() 
    {
        boolean vacia = false;
        if (Cabeza == null) 
        {
            vacia = true;
        }
        return vacia;
    }
    
    /**Enlaza dos nodos mediante enlace doble*/
    private void Enlazar(NodoUsuario nodoA, NodoUsuario nodoB) 
    {
    	nodoA.SetNodoSiguiente(nodoB);
        nodoB.SetNodoAnterior(nodoA);
    }

    /*inserta un nuevo nodo al inicio de la lista*/
    public void InsertarInicio(String pNickName,String pContrasena,ListaDireccion pDirecciones) 
    {
    	NodoUsuario nuevo = new NodoUsuario(pNickName,pContrasena,pDirecciones);
        if ( EstaVacia() ) 
        {
            Cabeza = nuevo;
            Fin = nuevo;
        } else 
        {
            Enlazar(nuevo, Cabeza);
            Cabeza = nuevo;
        }
    }

    //inserta un nuevo nodo al final de la lista
    public void InsertarFinal(String pNickName,String pContrasena, ListaDireccion pDirecciones) 
    {
    	NodoUsuario nuevo = new NodoUsuario( pNickName,pContrasena,pDirecciones);
        if ( EstaVacia() ) 
        {
            Cabeza = nuevo;
            Fin = nuevo;
        } 
        else 
        {
            Enlazar(Fin, nuevo);
            Fin = nuevo;
        }
    }

    //elimina el nodo del frente de la lista
    public void EliminarInicio() 
    {
        if ( !EstaVacia() ) 
        {
        	NodoUsuario primero = Cabeza.ObtNodoSiguiente();
            if ( primero == null ) 
            {
                Cabeza = null;
                Fin = null;
            } 
            else 
            {
                primero.SetNodoAnterior(null) ;
                Cabeza = primero;
            }
        }
    }

    //elimina el nodo del final de la lista
    public void EliminarFinal() 
    {
        if ( !EstaVacia() ) 
        {
        	NodoUsuario ultimo = Fin.ObtNodoAnterior();
            if ( ultimo == null ) 
            {
                Cabeza = null;
                Fin = null;
            } 
            else 
            {
                ultimo.SetNodoSiguiente(null);
                Fin = ultimo;
            }
        }
    }

    //devuelve una referencia al nodo buscado con su nickname, si no se encuentra devuelve null
    public NodoUsuario ObtBuscar(String pNickName) 
    {
    	NodoUsuario buscado = null;
    	NodoUsuario iterador = Cabeza;
        while ( buscado == null && iterador != null ) 
        {
            if ( iterador.ObtNickName().equals(pNickName)) 
            {
                buscado = iterador;
                break;
            }
            iterador = iterador.ObtNodoSiguiente();
        }
        return buscado;
    }
    
    //muestra los valores en la lista
    public void mostrar() 
    {
    	NodoUsuario iterador = Cabeza;
        while ( iterador != null ) 
        {
            System.out.print( iterador.ObtNickName() + " -> " );
            iterador = iterador.ObtNodoSiguiente();
        }
        System.out.println( "null" );
    }
}
