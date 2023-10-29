package Inheritence.Intro;

public class Mwanzo {
    private String jina;
    private int umri;
    private double kimo;

    public Mwanzo(){
        this("HakunaJina",0,0);
        System.out.println("Zero parameter constructor");
    }
    public Mwanzo(String jina){
        this(jina,0,0);
        System.out.println("single parameter constructor");
    }
    public Mwanzo(int umri){
        this("HakunaJina",umri,0);
    }
    public Mwanzo(double kimo){
        this("HakunaJina",0,kimo);
    }
    public Mwanzo(String jina,int umri){
      this(jina,umri,0);
    }
    public Mwanzo(int umri,double kimo){
        this("HakunaJina",umri,0);
    }
    public Mwanzo(String jina,int umri,double kimo){
        this.jina = jina;
        this.umri = umri;
        this.kimo = kimo;
    }

    //create getters.

    public String getJina() {
        return this.jina;
    }

    public int getUmri() {
        return this.umri;
    }

    public double getKimo() {
        return this.kimo;
    }
    public static void printInners(Mwanzo x){
        System.out.println("Naitwa: "+x.getJina()+"\n"+"Nina umri wa miaka: "+x.getUmri()+"\n"+"Nina Kimo: "+x.getKimo());
        System.out.println("\n");
    }
}
