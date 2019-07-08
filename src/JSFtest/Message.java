
package JSFtest;

import javax.annotation.ManagedBean;

@ManagedBean
public class Message  {
    public String getWorld() {
        return w;
    } 
    private String w = "Hello World!";    
}
