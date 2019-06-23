public class Program
{
    public static void main(String[] args) {
      
        Pilha p = new Pilha();
        p.push("willian");
        p.push("Tamires");
        
        while(!p.isEmpty()){
            String element = p.pop();
            System.out.println("desempilhei " + element);
        }
        
    }
}
public class Pilha 
{
    public String book[];
    public int positionTop;
    
    public Pilha()
    {
        book = new String[8];
        positionTop = -1;
    }
    
    public boolean isEmpty()
    {
        if(positionTop == -1)
        {
            return true;
        }
            return false;
    }
    
    public boolean isFull()
    {
        if(this.positionTop == book.length){
            
            return true;
        }
            return false;
    }
    public void push(String element)
    {
            if(isFull())
            {
                System.out.println("pilha cheia");
            }
           else
           {    
                positionTop++;
                book[positionTop] = element;
           }
            
        
    }
    public String pop()
    {  
            String element;
          element = book[positionTop];
             positionTop--;
         
           return element;
         
    }
    public String top()
    { 
        if(!isEmpty())
        {
            System.out.println("vazia");
        }
        return book[positionTop];
       
    }
}

