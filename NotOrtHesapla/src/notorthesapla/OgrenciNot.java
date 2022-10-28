
package notorthesapla;

public class OgrenciNot {
    private String name;
    private String lastname;
    private int noteone;
    private int noteto;
    public int ort;
    
    public OgrenciNot(String name,String lastname,int noteone,int noteto){
    this.name=name;
    this.lastname=lastname;
    this.noteone=noteone;
    this.noteto=noteto;
    
    }
    
    public float notCalculate(){
        ort=(noteone+noteto)/2;
        
        return ort;
        
    }
    
}
