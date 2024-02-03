package reflexion;

public class Club {
    private Long id;
    private int version;
    private String fabricant;
    private Double poids;

    // Constructor
    public Club() {
        
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getFabricant() {
        return fabricant;
    }

    public Double getPoids() {
        return poids;
    }
    
    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }
}
