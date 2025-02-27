package domain;
public class Lagarto extends Algoritmo {
    @Override
    public void executar(TipoJogada tipo) {
        switch (tipo) {
             case TESOURA: System.out.println("Perdeu - Tesoura decapita Lagarto."); break; 
            case PAPEL: System.out.println("Ganhou - Lagarto come papel"); break;
            case PEDRA: System.out.println("Perdeu - Pedra esmaga Lagarto"); break;
            case SPOCK: System.out.println("Ganhou - Lagarto envenena Spock."); break;
            default: System.out.println("Opção inválida"); break;
            case LAGARTO: System.out.println("Empatou - Lagarto empata com Lagarto."); break;
        }
    }    
}