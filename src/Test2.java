import Package2.Person;

class Test2 extends Person {
    protected int id;

    public static void main(String[] args) {
        // public, privet, default(все что default, достопно в пределах этого пакета),
        // protected(доступны в пределах одного пакета, доступны всем подклассам,
        // даже если эти подкоассы вне пакета)
    }
}
