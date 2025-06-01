public class Main {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("John Doe")
                .setAge(30)
                .setEmail("john@example.com")
                .build();

        System.out.println(user);
    }
}
