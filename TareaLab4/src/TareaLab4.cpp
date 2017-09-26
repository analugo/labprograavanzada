//============================================================================
// Name        : TareaLab4.cpp
// Author      : Ana Godínez
// Version     :
// Copyright   : Your copyright notice
// Description : último inciso de laboratorio y Tarea de laboratorio
//============================================================================

#include <iostream>
#include <conio.h>

using namespace std;

int main() {


		int numar[100],n;

		cout<< "Ingrese el número de elementos del arreglo: " <<endl;
		cin>>n;

		for(int i = 0; i< n; i++){

			cout<<i+1<<". Ingrese un número: ";
			cin>>numar[i];

			}
 //------------sumar el arreglo------------
		int sumar = 0;

		for(int a = 0; a<n; a++){

			sumar += numar[a];

		}

		cout<<"La suma de los elementos del vector es de: "<<sumar<<endl;

//------------Longitud del arreglo----------

			cout<< "La longitud del arreglo es de: " << n << endl;


//------------Suma de posiciones pares e impares------
			int s_par = 0, s_impar = 0;

			for(int c = 0; c < n; c++){

				if(numar[c] % 2 == 0){
					s_par+= numar[c];
				}
				else{
					s_impar += numar[c];
				}
			}

			cout<< "La suma de posiciones pares es de: "<<s_par<<endl;
			cout<< "La suma de posiciones impares es de: "<<s_impar<<endl;

//-------------Número ordenados ascendentemente--------
			int d,e;
			int cplm;

			for(d= 0; d<=n ;d++){
				for(e= 0; e< n-1; e++){
					if(numar[e] > numar[e+1]){
						cplm = numar[e];
						numar [e] = numar[e+1];
						numar [e+1] = cplm;
					}
				}

			}
		for(int f = 1; f<= n; f++){
			cout<< numar[f] <<endl;
		}

//----------------Ultimo inciso de laboratorio-----------
		  int num [10];
		  int multiplicar;

		  for (int i = 1; i<10; i++){
		      multiplicar*= num[i];
		  }
		  cout << "El resultado de la multiplicacion es de: " << multiplicar<<endl;




	return 0;

	  }




















