package com.emc.one_to_many;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		cliente.setNombre("Pepe");
		cliente.setApellidos("Soto");
		cliente.setId(1);

		Set<Pedido> hashSetPedidos = new HashSet<Pedido>();
		Pedido pedido1 = new Pedido();
		pedido1.setNumeroPedido(1);
		pedido1.setCantidad(1.00);
		pedido1.setPrecio(500.89);

		hashSetPedidos.add(pedido1);

		Pedido pedido2 = new Pedido();
		pedido2.setNumeroPedido(2);
		pedido2.setCantidad(2.00);
		pedido2.setPrecio(890.23);

		hashSetPedidos.add(pedido2);

		cliente.setPedido(hashSetPedidos);

		Iterator<Pedido> pedidoIterator = cliente.getPedido().iterator();

		// Displaying the values after iterating through the set
		System.out.println("The iterator values are: ");
		while (pedidoIterator.hasNext()) {
			System.out.println(pedidoIterator.next());
		}

	}

}
