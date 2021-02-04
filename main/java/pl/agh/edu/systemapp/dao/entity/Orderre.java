package pl.agh.edu.systemapp.dao.entity;

import pl.agh.edu.systemapp.dao.ClientRepo;

import javax.persistence.*;
import java.util.Date;
import java.util.Optional;

@Entity
public class Orderre {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date orderDate = new Date();

    @ManyToOne(cascade = CascadeType.MERGE)
    private Client client;

    public Orderre() {
    }

    public Orderre(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}