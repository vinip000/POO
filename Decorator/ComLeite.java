public class ComLeite extends BebidaDecorator {
    public ComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Leite";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.50; 
    }
}
