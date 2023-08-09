class Main {
  public static void main(String[] args) {
    Carro carro1 = new Carro();
    carro1.ano = 1980;
    carro1.marca = "Fusca";
    carro1.modelo = "VW";
    carro1.cor = "Azul";
    
    System.out.println("Carro 1: ");
    carro1.exibirModelo();
    carro1.exibirAnoECor();

    Carro carro2 = new Carro();
    carro2.ano = 2000;
    carro2.marca = "Ford";
    carro2.modelo = "Fiesta";
    carro2.cor = "Vermelho";

    System.out.println("Carro 2: ");
    carro2.exibirModelo();
    carro2.exibirAnoECor();

    Carro meuCarro = new Carro();
    meuCarro.ano = 2013;
    meuCarro.marca = "Toyota";
    meuCarro.modelo = "Civic";
    meuCarro.cor = "Preto";
    
    System.out.println("Meu carro: ");
    meuCarro.exibirModelo();
    meuCarro.exibirAnoECor();
  }
}
