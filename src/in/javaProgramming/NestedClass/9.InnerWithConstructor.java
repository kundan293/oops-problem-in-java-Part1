package in.javaProgramming.NestedClass;

class Person {
    class Address {
        String city;
        String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }

        void displayAddress() {
            System.out.println("city" + city + " state " + state);

        }
    }
}


    class InnerWithConstructor {
        public static void main(String[] args) {
            Person person = new Person();
            Person.Address address = person.new Address("Sitamarhi", "Bihar");
            address.displayAddress();

        }
    }

