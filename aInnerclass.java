class outer{
    public void show() {
        System.out.println("showing from outer class");
    }
}

class aInnerclass{
    public static void main(String[] args) {

        outer o = new outer()
        {
            public void show(){
                System.out.println("showing from inner class");
            }
        };
        o.show();
    }
}