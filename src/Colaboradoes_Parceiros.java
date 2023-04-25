import java.util.Date;

public class Colaboradoes_Parceiros {

    private String Nome;
    private long CPF;
    private long Telefone;
    private String DataDeAgendamento;
    private String Periodo;

    Colaboradoes_Parceiros(String Nome, long CPF, long Telefone, String DataDeAgendamento, String Periodo){
        this.Nome = Nome;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.DataDeAgendamento = DataDeAgendamento;
        this.Periodo = Periodo;
    }

    public String getNome() {
        return Nome;
    }

    public String getDataDeAgendamento() {
        return DataDeAgendamento;
    }

    public long getCPF() {
        return CPF;
    }

    public long getTelefone() {
        return Telefone;
    }

    public String getPeriodo() {
        return Periodo;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setDataDeAgendamento(String DataDeAgendamento) {
        this.DataDeAgendamento = DataDeAgendamento;
    }

    public void setTelefone(long telefone) {
        this.Telefone = telefone;
    }

    public String toString() {
        return  "Nome: " + Nome + "\n" +
                "CPF: " + CPF + "\n" +
                "Telefone: " + Telefone + "\n" +
                "DataDeAgendamento: '" + DataDeAgendamento + "'" + '\n' +
                "Periodo: " + Periodo;
    }
}
