class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeASound(){
        System.out.println("Miau, miau xd");
    }
}