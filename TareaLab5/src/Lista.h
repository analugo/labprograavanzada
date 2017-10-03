/*
 * Lista.h
 *
 *  Created on: 1/10/2017
 *      Author: Ana Godínez
 */

#ifndef LISTA_H_
#define LISTA_H_
#include "Nodo.h"

class Lista{
private:
	Nodo *primero;
	Nodo *actual;
	Nodo* NULL;

	bool ListaVacia(){
		return (this->primero == NULL);


	}

public:
	Lista(){
		this->primero = NULL;
		this->actual = NULL;

	}

	void Insertar (int v ){

		Nodo *nuevo = new Nodo(v);
		if(ListaVacia()){

			this->primero = nuevo;

			}
		else{
			this->actual ->Siguiente = nuevo;
		}
		this->actual = nuevo;

	}
	void Mostrar(){
		Nodo *tmp = this->primero;

		while(tmp){
			cout<< tmp->Valor << "-->";
			tmp = tmp ->Siguiente;

		}

		cout << "NULL\n";
	}



};



#endif /* LISTA_H_INCLUDED */
