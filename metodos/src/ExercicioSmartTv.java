public class ExercicioSmartTv {
    
        boolean ligada = false;
        int volume = 20;
        int canal = 1;
    
    public void ligar(){
        ligada = true;
    }
    
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;      // ou volume = volume + 1
        System.out.println("Aumentando o volume para " + volume);
    }

    public void diminuirVolume(){
        volume --;      // ou volume = volume - 1
        System.out.println("Diminuindo o volume para " + volume);
    }    

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal ++;
    }

    public void descerCanal(){
        canal --;
    }

}