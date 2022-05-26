package service;

import dto.ListaClienteDTO;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import model.Banco;

import java.util.List;

@AllArgsConstructor
public class BancoService {

    private Banco banco;

    public void listaContas(){
        List<ListaClienteDTO> listaCliente = banco.obtemDados();
        System.out.println("--------------Listagem de Clientes-----------------");
        for (ListaClienteDTO listaClienteDTO : listaCliente) {
            System.out.println(String.format("Banco: %s", listaClienteDTO.banco));
            System.out.println(String.format("Cliente: %s", listaClienteDTO.cliente));
            System.out.println(String.format("Agencia: %s", listaClienteDTO.agencia));
            System.out.println(String.format("Numero: %s", listaClienteDTO.numero));
            System.out.println("---------------------------------------------------");
        }
    }

}
