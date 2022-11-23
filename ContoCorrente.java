import java.util.ArrayList;

public class ContoCorrente {
    private String nomeIntestario;
    private String cognomeIntestatario;
    private int età;
    private double saldo = 0;

    private ArrayList<Double> listaMovimenti;

    public ContoCorrente(String nomeIntestario, String cognomeIntestatario, int età,  ArrayList<Double> listaMovimenti){
        this.nomeIntestario = nomeIntestario;
        this.cognomeIntestatario = cognomeIntestatario;
        this.età = età;
        this.listaMovimenti = listaMovimenti;
    }

    public String getNomeIntestario() {
        return nomeIntestario;
    }

    public String getCognomeIntestatario() {
        return cognomeIntestatario;
    }

    public int getEtà() {
        return età;
    }

    public double getSaldo() {
        return saldo;
    }

    public ArrayList<Double> getListaMovimenti() {
        return listaMovimenti;
    }

    public void setNomeIntestario(String nomeIntestario) {
        this.nomeIntestario = nomeIntestario;
    }

    public void setCognomeIntestatario(String cognomeIntestatario) {
        this.cognomeIntestatario = cognomeIntestatario;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setListaMovimenti(ArrayList<Double> listaMovimenti) {
        this.listaMovimenti = listaMovimenti;
    }


    public void versa(int a){
        saldo = saldo + a;
        listaMovimenti.add((double) a);
    }

    public void preleva(int a){
        if(saldo < a){
            System.out.println("Non puoi prelevare un importo maggiore del tuo saldo");
        } else {
            saldo = saldo - a;
        }

        listaMovimenti.add((double) a);

    }

    public String toString() {
        String a = "Il conto è intestato a: " + this.nomeIntestario + " " + this.cognomeIntestatario + "\n" +
                "Età dell'intestatario: " + this.età + "\n" +
                "Lista movimenti: " + this.listaMovimenti;
        return a;
    }


}
