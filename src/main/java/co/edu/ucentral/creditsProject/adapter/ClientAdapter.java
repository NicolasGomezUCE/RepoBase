package co.edu.ucentral.creditsProject.adapter;

import co.edu.ucentral.creditsProject.dto.Client;
import co.edu.ucentral.creditsProject.repostory.ClientRepository;
import co.edu.ucentral.creditsProject.repostory.entity.ClientEntity;
import co.edu.ucentral.creditsProject.repostory.mapper.ClientToDto;
import co.edu.ucentral.creditsProject.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class ClientAdapter implements ClientService {
    @Autowired
    ClientToDto clientMapper;

    @Autowired
    ClientRepository clientRepository;
    @Override
    public void saveClient(Client client) {
        ClientEntity clientEntity = clientMapper.toClientEntity(client);
        clientRepository.save(clientEntity);
    }
}