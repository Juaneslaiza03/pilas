

public class Objpila {

    private String Url;
    private String Titulo;
    private String Fecha;

    
    
    public Objpila() {
    }


    public Objpila(String url, String titulo, String fecha) {
        Url = url;
        Titulo = titulo;
        Fecha = fecha;
    }

    


    public String getUrl() {
        return Url;
    }


    public void setUrl(String url) {
        Url = url;
    }


    public String getTitulo() {
        return Titulo;
    }


    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


    public String getFecha() {
        return Fecha;
    }


    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    
}



