public class employeefactory {

    public static employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("webdeveloper")){
            return new webdeveloper();
        }else if(type.trim().equalsIgnoreCase("androiddeveloper")){
            return new androiddeveloper();
        }else{
            return null;
        }
    }
}