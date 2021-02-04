package pl.agh.edu.systemapp.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.agh.edu.systemapp.dao.ClientRepo;
import pl.agh.edu.systemapp.dao.entity.Client;
import pl.agh.edu.systemapp.dao.entity.Orderre;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientManager {

    private ClientRepo clientRepo;

    @Autowired
    public ClientManager(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }

    public Optional<Client> findById(Long id){
        return clientRepo.findById(id);
    }

    public Iterable<Client> findAll(){
        return clientRepo.findAll();
    }

    public Client save(Client client){
        return clientRepo.save(client);
    }

    public void deleteById(Long id){
        clientRepo.deleteById(id);
    }

//    public List<Client> getClientByOrderre(String id){
//        List<Client> clients = new ArrayList<>();
//        clientRepo.findByOrderreId(id).forEach(clients::add);
//        return clients;
//    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){
        save(new Client("Nazwa", "Ulica 12a", 1234321266L, 123456789, "example@some.com"));
    }
}
