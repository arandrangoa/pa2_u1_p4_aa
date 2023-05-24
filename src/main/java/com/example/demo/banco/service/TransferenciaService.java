package com.example.demo.banco.service;

import com.example.demo.banco.modelo.Transferencia;

public interface TransferenciaService {
	
	public void agregar(Transferencia transferencia);
	
	public void modificar(Transferencia transferencia);
	
	public void borrar(String numero);
	
	public Transferencia buscarPorNumero(String numero);

}
