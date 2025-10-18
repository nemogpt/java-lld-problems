package org.example.DesignPatterns.Problem2.BetterCode;

public class User {
    int id;
    String name;
    String email;
    int age;
    double salary;

    private User(){

    }

    public static Builder builder(){
        return new Builder();
    }

    public String toString(){
        return "The user details are: "+ "id="+id+ " name="+name+ " email="+email+" age="+age+" salary="+salary;
    }


    public static class Builder{
        private final User user;

        public Builder(){
            user = new User();
        }

        public Builder setId(int id){
            this.user.id=id;
            return this;
        }
        public Builder setName(String name){
            this.user.name=name;
            return this;
        }
        public Builder setEmail(String email){
            this.user.email=email;
            return this;
        }
        public Builder setAge(int age){
            this.user.age=age;
            return this;
        }
        public Builder setSalary(double salary){
            this.user.salary=salary;
            return this;
        }
        public User build(){
            return user;
        }
    }
}
