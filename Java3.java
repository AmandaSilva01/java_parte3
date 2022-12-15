import java.util.Scanner;

//atividade 1
public class Ex1{
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Informe um numero");
    int valor1 = read.nextInt();
    System.out.println("Informe o segundo numero");
    int valor2 = read.nextInt();
    while(valor2 <= 0){
        System.out.println("O numero não pode ser negativo ou zero");
        System.out.println("Informe o segundo numero");
        valor2 = read.nextInt();
    }
    System.out.println("O resultado da divisão e " + (valor1 / valor2));
  }
}

//atividade 2
public class Ex2{
    public static void main(String[] args){
    for(int i = 30; i >= 0; i--){
        System.out.println("a bomba ira explodir em " + i);
        }
    }
}

//atividade 3
public class Ex3{
    public static void main(String[] args){

        for(int i = 10; i >= 0; i--){
            System.out.println("A contagem está em " + i);
        }
        System.out.println("EXPLOSÃO!");
    }
}

//atividade 4
public class Ex4{
    public static void main(String[] args){
        double acum = 0;
        for(int i = 0; i <= 100; i++){
            if(i >= 15 ){
                acum += i;
            }
        }
        System.out.println("o resultado é: " + (acum / 85));
    }
}

//atividade 5
public class Ex5{
    public static void main(String [] args){
        int acum = 0;
        int contador = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um numero");
        int valor1 = read.nextInt();
        System.out.println("Informe um segundo numero");
        int valor2 = read.nextInt();
        while(valor1 <= valor2){
            acum += valor1;
            valor1++;
            contador ++; 
        }

        System.out.println("O resultado é " + (acum / contador));
    }
}

//atividade 6
public class Ex6{
    public static void main(String[] args){
        int acum = 0;
        Scanner read = new Scanner(System.in);
        String resposta = "S";
        do{
            System.out.println("Informe uma nota: ");
            double valor1 = read.nextDouble();
            System.out.println("Informe uma nota: ");
            double valor2 = read.nextDouble();
            System.out.println("A média é " + (valor1 + valor2)/2);
            System.out.println("Quer continuar a calcular a media? (S)/(N) ");
            resposta = read.next();
            if ((valor1+valor2)/2 >= 9.5){
                acum++;
            }
        }
        while(resposta.equals("S"));
        System.out.println("A quantidade de alunos aprovados e " + acum );
    }
}