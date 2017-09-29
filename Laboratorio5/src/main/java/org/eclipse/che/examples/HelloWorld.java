package org.eclipse.che.examples;

public class HelloWorld {
      public static void main(String... argvs) {
          
          SinglyLinkedList lists = new SinglyLinkedList();
          
          lists.addFirst("GUA");
          lists.addLast("MEX");
          lists.addLast("USA");
          lists.addLast("ESP");
          lists.addLast("FRA");
          lists.addLast("ITA");
          lists.addLast("RUS");
          lists.addLast("SUI");
          lists.addLast("CHI");
          lists.addLast("JAP");
          lists.addLast("COL");
          
          lists.addLast("SING");
          
          String valor = lists.removeFirst();
          while(valor!= null){
              System.out.println(valor);
              valor = lists.removeFirst();
          }
        
    /*  Node a = new Node();
      a.setPropiedad("GUA");
      
      Node b = new Node();
      b.setPropiedad("MEX");
      a.setNext(b);
      
      Node c = new Node();
      c.setPropiedad("USA");
      a.getNext().setNext(c);
      
      Node d = new Node();
      c.setPropiedad("ESP");
      a.getNext().getNext().setNext(d);
      
      
      
      
      System.out.println(a.getPropiedad());
      System.out.println(a.getNext().getPropiedad());
      System.out.println(a.getNext().getNext().getPropiedad());  
      System.out.println(a.getNext().getNext().getNext().getPropiedad());    
      
      //Next no ha existir
      System.out.println(a.getNext().getNext().getNext().getNext()
      .getPropiedad());  
    }
    /**
     * Inner class Node
     */
    
    /*private static class Node{
        private String propiedad;
        private Node next;
        
        
        private String getPropiedad(){
            
            return this.propiedad;
        }
        private void setPropiedad(String propiedad){
            this.propiedad = propiedad;
        }
        
        private Node getNext(){
           return this.next; 
            
        }
        
        private void setNext(Node next){
            
            this.next = next;
        }
        
    }
    **/
}
}
