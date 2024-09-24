public class SmartTv {   
  boolean ligada=false;
  int canal=1;
  int volume=15;

  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }

  public void aumentarVolume(){ 
    System.out.println("Aumentando volume para:" + volume);
    volume ++;
  }
  
  public void diminuirVolume(){ 
    System.out.println("Dimunuindo volume para:" + volume);
    volume --;
  }

  public void aumentarCnal(){ 
    System.out.println("Mudando de canal para o canal :" + canal);
    canal ++;
  }

  public void diminuirCanal(){ 
    System.out.println("Mudando de canal para o canal :" + canal);
    canal --;
  }

  public void ligar(){ 
    ligada=true;
  }
  public void desligar(){ 
    ligada=false;
  }

 }