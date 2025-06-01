// Step 1: Create the Product class
public class User {
    private String name;
    private int age;
    private String email;

    // Private constructor to force the use of the builder
    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    // Getters (optional)
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    // Step 2: Create the static inner Builder class
    public static class UserBuilder {
        private String name;
        private int age;
        private String email;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Step 3: toString for easy output
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
