public class Vaga implements Cloneable {

    private String titulo;
    private String experiencia;
    private float remuneracao;
    private boolean ehOnline;
    private String contrato;


    public Vaga (String titulo, float remuneracao, String experiencia, boolean ehOnline, String contrato) {
        this.titulo = titulo;
        this.remuneracao = remuneracao;
        this.experiencia = experiencia;
        this.ehOnline = ehOnline;
        this.contrato = contrato;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public float getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(float remuneracao) {
        this.remuneracao = remuneracao;
    }

    public boolean isEhOnline() {
        return ehOnline;
    }

    public void setEhOnline(boolean ehOnline) {
        this.ehOnline = ehOnline;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    @Override
    public Vaga clone() throws CloneNotSupportedException {
        Vaga vagaClone = (Vaga) super.clone();
        return vagaClone;
    }

    @Override
    public String toString() {
        String modelo = ehOnline ? "Remoto" : "Presencial";

        return "Vaga{" +
                "titulo=" + titulo +
                ", experiencia='" + experiencia + '\'' +
                ", remuneracao=" + remuneracao +
                ", modelo='" + modelo + '\'' +
                ", contrato='" + contrato + '\'' +
                '}';
    }

}
