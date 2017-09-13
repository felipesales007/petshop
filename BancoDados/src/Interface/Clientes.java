package Interface;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "clientes", catalog = "pet_shop", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c"),
    @NamedQuery(name = "Clientes.findById", query = "SELECT c FROM Clientes c WHERE c.id = :id"),
    @NamedQuery(name = "Clientes.findByCliente", query = "SELECT c FROM Clientes c WHERE c.cliente = :cliente"),
    @NamedQuery(name = "Clientes.findByCpf", query = "SELECT c FROM Clientes c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Clientes.findByTelefone", query = "SELECT c FROM Clientes c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Clientes.findByPet", query = "SELECT c FROM Clientes c WHERE c.pet = :pet"),
    @NamedQuery(name = "Clientes.findByRaca", query = "SELECT c FROM Clientes c WHERE c.raca = :raca"),
    @NamedQuery(name = "Clientes.findByIdade", query = "SELECT c FROM Clientes c WHERE c.idade = :idade")})
public class Clientes implements Serializable
{
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "Cliente")
    private String cliente;
    @Basic(optional = false)
    @Column(name = "CPF")
    private int cpf;
    @Basic(optional = false)
    @Column(name = "Telefone")
    private int telefone;
    @Basic(optional = false)
    @Column(name = "Pet")
    private String pet;
    @Basic(optional = false)
    @Column(name = "Raca")
    private String raca;
    @Basic(optional = false)
    @Column(name = "Idade")
    private int idade;

    public Clientes()
    {
        
    }

    public Clientes(Integer id)
    {
        this.id = id;
    }

    public Clientes(Integer id, String cliente, int cpf, int telefone, String pet, String raca, int idade)
    {
        this.id = id;
        this.cliente = cliente;
        this.cpf = cpf;
        this.telefone = telefone;
        this.pet = pet;
        this.raca = raca;
        this.idade = idade;
    }

    public Integer getId() 
    {
        return id;
    }

    public void setId(Integer id)
    {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getCliente()
    {
        return cliente;
    }

    public void setCliente(String cliente)
    {
        String oldCliente = this.cliente;
        this.cliente = cliente;
        changeSupport.firePropertyChange("cliente", oldCliente, cliente);
    }

    public int getCpf()
    {
        return cpf;
    }

    public void setCpf(int cpf)
    {
        int oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public int getTelefone()
    {
        return telefone;
    }

    public void setTelefone(int telefone)
    {
        int oldTelefone = this.telefone;
        this.telefone = telefone;
        changeSupport.firePropertyChange("telefone", oldTelefone, telefone);
    }

    public String getPet()
    {
        return pet;
    }

    public void setPet(String pet) 
    {
        String oldPet = this.pet;
        this.pet = pet;
        changeSupport.firePropertyChange("pet", oldPet, pet);
    }

    public String getRaca() 
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        String oldRaca = this.raca;
        this.raca = raca;
        changeSupport.firePropertyChange("raca", oldRaca, raca);
    }

    public int getIdade() 
    {
        return idade;
    }

    public void setIdade(int idade) 
    {
        int oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    @Override
    public int hashCode() 
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        
        if (!(object instanceof Clientes))
        {
            return false;
        }
        Clientes other = (Clientes) object;
        return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
    }

    @Override
    public String toString()
    {
        return "Interface.Clientes[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener)
    {
        changeSupport.removePropertyChangeListener(listener);
    } 
}