package Collections;

public abstract class AbstractCollection implements collection{

    protected AbstractCollection() {}
    public abstract Iterator iterator();

    public abstract int size();

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty()
    {
 return (size() == 0);
    }

    public void clear()
    {
        for (Iterator it = iterator(); it.hasNext();)
        {
            it.next();
            it.remove();
        }
    }

    public String toString()
    {
        if(isEmpty()) return "[]";

        Iterator it = iterator();
        StringBuffer buf = new StringBuffer("[" + it.next());
        
        while(it.hasNext())
        {
            buf.append( "," +it.next());
        }
        return (buf + "]");
    }
    public boolean contains(Object obj) 
    {
       Iterator it = iterator();
       if(obj == null) {
           while (it.hasNext()) {
               if (it.next() == null) {
                   return true;
               }
           }
       } else {
                   while (it.hasNext()) {
                       if (obj.equals(it.next())) {
                           return true;
                   }
               }
            }
            return false;
    }

    public boolean remove(Object obj)
    {
        Iterator it = iterator();
        if(obj == null)
        {
            while(it.hasNext())
            {
                if(it.next() == null)
                {
                    it.remove();
                    return true;
                }
            }
        }
        else{
            
            while(it.hasNext())
            {
                if(obj.equals(it.next()))
                {
                    it.remove();
                    return true;
                }
            }

        }
        return false;
    }
}
