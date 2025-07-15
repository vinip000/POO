public class ComAcucar extends BebidaDecorator {
    public ComAcucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com Açúcar";
    }

    @Override
    public double getCusto() {
        return bebida.getCusto() + 0.20; // adiciona o custo do açúcar
    }
}
