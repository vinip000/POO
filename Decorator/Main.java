public class Main {
    public static void main(String[] args) {
        Bebida cafe = new Cafe();
        System.out.println(cafe.getDescricao() + " custa " + cafe.getCusto());

        Bebida cafeComLeite = new ComLeite(cafe);
        System.out.println(cafeComLeite.getDescricao() + " custa " + cafeComLeite.getCusto());

        Bebida cafeComLeiteEAçucar = new ComAcucar(cafeComLeite);
        System.out.println(cafeComLeiteEAçucar.getDescricao() + " custa " + cafeComLeiteEAçucar.getCusto());
    }
}
