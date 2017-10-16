/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanodo;

/**
 *
 * @author ricar
 */
public class PruebaNodo {

  public Nodo siguiente;
  public Nodo ultimo;
  public int cont;
  
  public void pushCola(int id,String des)
  {
    if(siguiente==null)
    {
      siguiente = new Nodo();
      siguiente.setId(id);
      siguiente.setDescripcion(des);
      siguiente.setSiguiente(null);
      ultimo = siguiente;
      cont ++;
    }
    else
    {
      Nodo temp = new Nodo();
      temp.setId(id);
      temp.setDescripcion(des);
      ultimo.setSiguiente(temp);
      ultimo = temp;
      cont ++;
    }
    
  }
  
   public void pushPila(int id,String des)
  {
    if(siguiente==null)
    {
      siguiente = new Nodo();
      siguiente.setId(id);
      siguiente.setDescripcion(des);
      siguiente.setSiguiente(null);
      cont++;
    }
    else
    {
        Nodo tempo = siguiente;
      Nodo temp = new Nodo();
      temp.setId(id);
      temp.setDescripcion(des);
      temp.setSiguiente(tempo);
      siguiente = temp;
      cont++;
    }
    
  }
   
  public Nodo popCola()
  {
    Nodo temp = siguiente;
    siguiente = siguiente.getSiguiente();
    return temp;
  }
  
    public Nodo popPila()
  { 
      Nodo temp = siguiente;
      siguiente = temp.getSiguiente();
      
     return temp;
  }
  
  public void imprimir()
  {
     Nodo temp = siguiente;
     
     while(temp != null)
     {
         System.out.println("ID : "+temp.getId());
         System.out.println("Descripcion : "+temp.getDescripcion());
         temp = temp.getSiguiente();
     }
  
  }
  
  public void eliminar(int id)
  {
    Nodo tmp = siguiente;
    int con = 0;
    if(siguiente != null)
    {
       while(con<cont)
       {
          if(tmp.getId()==id)
          {
            tmp=null;
            tmp = tmp.getSiguiente();
          }
          con++;
       }
    }
  }
    public static void main(String[] args) 
    {
      PruebaNodo a = new PruebaNodo();
//       a.pushPila(1, "Holi");
//       a.pushPila(2, "Poli");
//       a.pushPila(3, "Boli");
//       a.pushPila(4, "Manco sin manos :u ¡¡¡");
//       a.imprimir();
//       a.popPila();
//       a.imprimir();
      a.pushCola(1, "Holi");
      a.pushCola(2, "Poli");
      a.pushCola(3, "Boli");
      a.pushCola(4, "Manco sin manos :u ¡¡¡");
      a.imprimir();
      a.popCola();
      a.imprimir();
       
    }
    
}
