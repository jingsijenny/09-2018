public class Array {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("blue");
//        Car car3 = new Car("res", 10);

        int i = 5;
        System.out.println(car1.size);
        System.out.println(car2.color);
//        System.out.println(car3.color);

    }

   static class Car {
        String color;
        String own = "jjj";
        boolean size;

        public Car () {

        }

        public Car (String ss) {
            color = ss;
        }

//        public Car (String ss, int dd) {
//            color = ss;
//            size = dd;
//        }
//
//       public Car (int dd, String ss) {
//           own = ss;
//           size = dd;
//       }
    }
}
