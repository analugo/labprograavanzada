// Simple Hello World
 
#include <iostream>
 
int sumar(int,int); //prototipos = para colocar mis métodos en cualquier lado.
int restar(int,int);
int multiplicar(int,int);
int dividir(int,int);

void sumapunteros(int,int, int*);
void restapunteros(int, int, int*);
void multiplicacionpunteros(int, int, int*);
void divisionpunteros(int, int, int*);
 
int main()
{
  int resultadoo = -1; //-1 significa que todavía no ha sido modificado
  sumapunteros(6,5, &resultadoo);
  std::cout << "Resultado puntero suma es: " << resultadoo << std::endl; 
  
  int resultadoo1 = -1;
  restapunteros(10,5, &resultadoo1);
  std::cout << "Resultado puntero resta es: " << resultadoo1 << std::endl; 
  
  int resultadoo2 = -1;
  multiplicacionpunteros(5,8,&resultadoo2);
  std::cout << "Resultado puntero multiplicacion es: " << resultadoo2 << std::endl; 
 
  int resultadoo3 = -1;
  divisionpunteros(100,5, &resultadoo3);
  std::cout << "Resultado puntero division es: " << resultadoo3 << std::endl; 
  
  int resultado = sumar (5,7);
  int resultado2 = restar(2,2);
  int resultado3 = multiplicar(50,2);
  int resultado4= dividir(15,7);
  std::cout << "Hola amiguitos programadores :)" << std::endl;
  std::cout << "Resultado normal es: " << resultado << std::endl;
  std::cout << "Resultado normal es: " << resultado2 << std::endl;
  std::cout << "Resultado normal es: " << resultado3 << std::endl; 
  std::cout << "Resultado normal es: " << resultado4 << std::endl; 
  
  return 0;
}

int sumar (int a, int b){
   return a+b;
}

int restar(int a, int b){
    return a-b;
}
int multiplicar(int a, int b){
    return a*b;
}

int dividir(int a, int b){
    return a/b;
}
void sumapunteros(int a, int b, int* resultadoo){
    *resultadoo = a+b;
}
void restapunteros(int a, int b, int* resultadoo1 ){
    *resultadoo1 = a-b;
}

void multiplicacionpunteros(int a, int b, int* resultadoo2){
    *resultadoo2 = a*b;
}

void divisionpunteros(int a, int b, int* resultadoo3){
    *resultadoo3 = a/b;
}
