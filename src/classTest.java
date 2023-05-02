import java.util.ArrayList;
import java.util.List;

public class classTest {
    public static void main(String[] args) throws Exception {

        List<Colaboradoes_Parceiros> lista_colaboradores = new ArrayList<Colaboradoes_Parceiros>();

        lista_colaboradores.add(
                new Colaboradoes_Parceiros("Fidalgo", 12412314, 1244123, "20-20-20", "tarde"));
        lista_colaboradores.add(
                new Colaboradoes_Parceiros("Helena", 412124, 4123112, "20-23-20", "manhã"));
        lista_colaboradores.add(
                new Colaboradoes_Parceiros("Lucas", 421412, 1424123, "20-20-21", "noite"));

        for (int i = 0; i < lista_colaboradores.size(); i++){
            System.out.println(lista_colaboradores.get(i).toString());
        }

    }
}
