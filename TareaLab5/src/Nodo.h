/*
 * Nodo.h
 *
 *  Created on: 1/10/2017
 *      Author: Ana Godínez
 */

#ifndef NODO_H_INCLUDED
#define NODO_H_INCLUDED

class Nodo {
	private:
		int Valor;
		Nodo *Siguiente;
	int NULL;

	public:
		Nodo(int v,Nodo *sig = NULL ){
		this->Valor = v
		this->Siguiente = sig;

	}

	friend class Lista;
};

#endif /* NODO_H_ */
