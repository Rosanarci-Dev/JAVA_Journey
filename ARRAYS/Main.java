public class Main {
public static void main(String[] args) {
// Lets start ARRAYS in java   
int[] notas ={8,9,6,6};
int soma=0;
double maior=notas[0];
int menor= notas[0];
int aprovados=0;
int reprovados=0;
//LOOP//
for( int i=0; i<notas.length; i++){
System.out.println(notas[i]);
soma+=notas[i];
//aprovados reprovados//
if(notas[i]>=7){
aprovados++;

}

else{
reprovados++;

}

//MAIOR NOTA//
if(maior<=notas[i]){
   maior=notas[i];
};
//menor//
if(menor>=notas[i]){
    menor=notas[i];
}
}

//SAÍDAS DE TEXTO//

System.out.println("aprovados: "+aprovados);
System.out.println("reprovados: "+reprovados);


System.out.println("Maior nota: "+maior);
System.out.println("Menor nota: "+menor);
double media= (double) soma/notas.length;
System.out.println("Soma das notas: "+soma);
System.out.println("média das notas: "+ media);
System.out.println("Quantidade de notas: "+notas.length);






}
    
}
