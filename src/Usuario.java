public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv SmartTv = new SmartTv(); 
        System.out.println("tv ligada?" + SmartTv.ligada);
        System.out.println("canal:" + SmartTv.canal);
        System.out.println("volume:" + SmartTv.volume);

        SmartTv.ligar();
        System.out.println("Novo status -> tv ligada?" + SmartTv.ligada);
    }
}
