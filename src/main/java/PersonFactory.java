public class PersonFactory {
    public static Person create(String objectYouWant) {
        if (objectYouWant.equals("Lecturer")) {
            return new Lecturer();
        } else if (objectYouWant.equals("Student")) {
            return new Student();
        } else {
            return null;
        }
    }
}
