package EDD.Estructuras;


public class ListaProductosxComprar 
{
	private NodoProductoxComprar Cabeza;
	private NodoProductoxComprar Fin;
	
	/**Constructor*/
	public ListaProductosxComprar() 
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
    private void Enlazar(NodoProductoxComprar nodoA, NodoProductoxComprar nodoB) 
    {
    	nodoA.SetNodoSiguiente(nodoB);
        nodoB.SetNodoAnterior(nodoA);
    }

    /*inserta un nuevo nodo al inicio de la lista*/
    public void InsertarInicio(int pCantidad,NodoProducto pProducto) 
    {
    	NodoProductoxComprar nuevo = new NodoProductoxComprar(pCantidad, pProducto);
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
    public void InsertarFinal(int pCantidad,NodoProducto pProducto) 
    {
    	NodoProductoxComprar nuevo = new NodoProductoxComprar(pCantidad, pProducto);
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
        	NodoProductoxComprar primero = Cabeza.ObtNodoSiguiente();
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
        	NodoProductoxComprar ultimo = Fin.ObtNodoAnterior();
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

    //devuelve una referencia al nodo buscado con su Producto, si no se encuentra devuelve null
    public NodoProductoxComprar ObtBuscar(NodoProducto pProducto) 
    {
    	NodoProductoxComprar buscado = null;
    	NodoProductoxComprar iterador = Cabeza;
        while ( buscado == null && iterador != null ) 
        {
            if ( iterador.ObtProducto().equals(pProducto)) 
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
    	NodoProductoxComprar iterador = Cabeza;
        while ( iterador != null ) 
        {
            System.out.print( iterador.ObtProducto().ObtCodigo() + " -> " );
            iterador = iterador.ObtNodoSiguiente();
        }
        System.out.println( "null" );
    }
    
    public NodoProductoxComprar ObtCabeza()
    {
    	return Cabeza;
    }
    public void SetCabeza(NodoProductoxComprar pCabeza)
    {
    	Cabeza = pCabeza;
    }
    
    public NodoProductoxComprar ObtFin()
    {
    	return Fin;
    }
    public void SetFin(NodoProductoxComprar pFin)
    {
    	Fin = pFin;
    }
}
