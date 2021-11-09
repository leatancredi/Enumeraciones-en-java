package enumeracion;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    //para cargar atributos a "enum" creamos un constructor
    private final int paises;
    Continentes(int paises){
        this.paises = paises;
    }
    
    //el atributo paises al ser final esta encapsulado, entonces tenemos que crear un metodo.
    //no se puede creear un set porque es final
    public int getPaises(){
        return this.paises;
    }
}
