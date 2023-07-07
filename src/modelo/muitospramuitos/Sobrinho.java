package modelo.muitospramuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nome;

    @ManyToMany(mappedBy = "sobrinhos")
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {
    }

    public Sobrinho(String nome) {
        super();
        Nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }
}
