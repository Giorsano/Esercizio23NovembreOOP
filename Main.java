import java.util.ArrayList;

public class Main {
    public static void main(String[] args)  {
    ContoCorrente contoUno = new ContoCorrente("Giordano", "Orlacchio", 25, new ArrayList<>());
    ContoCorrente contoDue = new ContoCorrente("Francesco", "Mattei", 30, new ArrayList<>());

        System.out.println(contoUno.getSaldo());
        System.out.println(contoUno.getListaMovimenti());
        contoUno.versa(300);
        contoUno.preleva(100);
        contoUno.preleva(100);
        System.out.println(contoUno.getSaldo());
        System.out.println(contoUno.getListaMovimenti());



    }
}














































