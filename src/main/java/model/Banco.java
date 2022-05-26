package model;

import dto.ListaClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class Banco {
    private String nome;
    private List<Conta> contas;

    public void listaContas(){
        List<ListaClienteDTO> listaCliente = obtemDados();
        System.out.println("--------------Listagem de Clientes-----------------");
        for (ListaClienteDTO listaClienteDTO : listaCliente) {
            System.out.println(String.format("Banco: %s", listaClienteDTO.banco));
            System.out.println(String.format("Cliente: %s", listaClienteDTO.cliente));
            System.out.println(String.format("Agencia: %s", listaClienteDTO.agencia));
            System.out.println(String.format("Numero: %s", listaClienteDTO.numero));
            System.out.println("---------------------------------------------------");
        }
    }

    private List<ListaClienteDTO> obtemDados(){
        return this.contas.stream()
                .map(e -> {
                    ListaClienteDTO lista = new ListaClienteDTO();
                    lista.cliente = e.getCliente().getNome();
                    lista.banco = this.nome;
                    lista.agencia = e.getAgencia();
                    lista.numero = e.getNumero();
                    return lista;
                }).collect(Collectors.toList());
    }
}
