public class Car{
   //Lazy Way

    //creating a object intiate variable
    private static Car instance;

    //constructor => making it private so that we can not create object from outside
    private Car(){

    }

    //creating a static method to get the object (we had make it static so we can call it without the objet)
    public static Car getCar(){

        if(instance == null){
            instance = new Car();
        }
        return instance;
    }


}