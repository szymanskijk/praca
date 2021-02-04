package pl.agh.edu.systemapp.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.agh.edu.systemapp.dao.entity.Client;
import pl.agh.edu.systemapp.manager.ClientManager;

import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientApi {

    private ClientManager clientManager;

    @Autowired
    public ClientApi(ClientManager clientManagers){
        this.clientManager = clientManagers;
    }

    @GetMapping("/all")
    public Iterable<Client> getAll(){
        return clientManager.findAll();
    }

    @GetMapping
    public Optional<Client> getById(@RequestParam Long id) {
        return clientManager.findById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client){
        return clientManager.save(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client){
        return clientManager.save(client);
    }

    @DeleteMapping
    public void deleteClient(@RequestParam Long id){
        clientManager.deleteById(id);
    }
}
