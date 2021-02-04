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
    private Long clientId;
    private Long crewId;

    public Orderre() {
    }

    public Orderre(Long clientId, Long crew_id) {
        this.clientId = clientId;
        this.crewId = crew_id;
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

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public Long getCrewId() {
        return crewId;
    }

    public void setCrewId(Long crew_id) {
        this.crewId = crew_id;
    }
}