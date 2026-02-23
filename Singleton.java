public class Singleton {

    private static Singleton instancia;

    private Singleton() {
    }

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}

/*
 * A titulo de explicação, para o singleton, temos presentes aqui:
 * a) a única instância da classe possível;
 * b) um construtor privado (impossibilitando, assim, a criação do objeto
 * diretamente com new Singleton() ) ;
 * c) o método público e estático, que só vai permitir a instanciação se ela já
 * não existir (se for null, no caso.);
 */