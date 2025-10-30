public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Esdras", 30, "123.456.789-00", "esdrasfonseca@gmail.com");
        Carro c1 = new Carro("Toyota", "Corolla", "Prata", 2022);
        Animal a1 = new Animal("Cachorro", "Thor", 5);
        Livro l1 = new Livro("Java para Iniciantes", "Deitel");

        // Testando métodos
        p1.falar("Aprendendo Java com Daniel Paiva!");
        c1.ligar();
        a1.emitirSom();
        l1.ler();

        // Relacionamento entre entidades
        System.out.println(p1 + " está lendo " + l1);
    }
}

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String email;

    public Pessoa(String nome, int idade, String cpf, String email) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
    }

    public void andar() { System.out.println(nome + " está andando."); }
    public void comer() { System.out.println(nome + " está comendo."); }
    public void dormir() { System.out.println(nome + " está dormindo."); }
    public void falar(String frase) { System.out.println(nome + " disse: " + frase); }
}

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Carro(String marca, String modelo, String cor, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public void ligar() { System.out.println(modelo + " ligado."); }
    public void acelerar() { System.out.println(modelo + " acelerando."); }
    public void frear() { System.out.println(modelo + " freando."); }
    public void desligar() { System.out.println(modelo + " desligado."); }
}

public class Animal {
    private String especie;
    private String nome;
    private int idade;

    public Animal(String especie, String nome, int idade) {
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() { System.out.println(nome + " está comendo."); }
    public void dormir() { System.out.println(nome + " está dormindo."); }
    public void emitirSom() { System.out.println(nome + " emitiu um som."); }
}
public class Computador {
    private String marca;
    private String sistemaOperacional;

    public Computador(String marca, String sistemaOperacional) {
        this.marca = marca;
        this.sistemaOperacional = sistemaOperacional;
    }

    public void ligar() { System.out.println("Computador " + marca + " ligado."); }
    public void processar() { System.out.println("Computador processando..."); }
    public void desligar() { System.out.println("Computador desligado."); }
}

public class Celular {
    private String modelo;
    private String numero;

    public Celular(String modelo, String numero) {
        this.modelo = modelo;
        this.numero = numero;
    }

    public void ligar() { System.out.println(modelo + " ligado."); }
    public void fazerChamada(String destino) { System.out.println("Ligando para " + destino); }
    public void enviarMensagem(String msg) { System.out.println("Mensagem enviada: " + msg); }
}

public class Relogio {
    private String marca;
    private String tipo;

    public Relogio(String marca, String tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public void mostrarHora() { System.out.println("Mostrando hora no relógio " + marca); }
    public void ajustarHora() { System.out.println("Hora ajustada."); }
}

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void abrir() { System.out.println("Abrindo o livro: " + titulo); }
    public void ler() { System.out.println("Lendo o livro: " + titulo); }
    public void fechar() { System.out.println("Fechando o livro: " + titulo); }
}

public class Televisao {
    private String marca;
    private int tamanho;

    public Televisao(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
    }

    public void ligar() { System.out.println("TV " + marca + " ligada."); }
    public void trocarCanal(int canal) { System.out.println("Canal alterado para: " + canal); }
    public void desligar() { System.out.println("TV desligada."); }
}

public class Bicicleta {
    private String marca;
    private String cor;

    public Bicicleta(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public void pedalar() { System.out.println("Pedalando a bicicleta " + marca); }
    public void frear() { System.out.println("Freando a bicicleta " + marca); }
}

public class Cadeira {
    private String tipo;
    private String material;

    public Cadeira(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    public void ajustarAltura() { System.out.println("Altura da cadeira ajustada."); }
    public void reclinar() { System.out.println("Cadeira reclinada."); }
}
