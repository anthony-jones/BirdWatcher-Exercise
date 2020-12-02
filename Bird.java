
public class Bird {

    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return name;
    }
    
    public void addObservation(){
        this.observations++;
    }

    @Override
    public String toString() {
        if(this.observations == 1){
            return this.name + " (" + this.latinName + "): " + observations + " observation";
        } else {
            return this.name + " (" + this.latinName + "): " + observations + " observations";
        }
        
    }
    
    
    
    
    
}
