class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeASound(){
        System.out.println("Szczek, szczek");
    }
}