public class TestClass {
    private String nameofStudent;

    private String mailStudent;

    public TestClass(String nameofStudent, String mailStudent) {
        this.nameofStudent = nameofStudent;
        this.mailStudent = mailStudent;
    }

    public String getNameofStudent() {
        return nameofStudent;
    }

    public void setNameofStudent(String nameofStudent) {
        this.nameofStudent = nameofStudent;
    }

    public String getMailStudent() {
        return mailStudent;
    }

    public void setMailStudent(String mailStudent) {
        this.mailStudent = mailStudent;
    }

    public static void main(String[] args) {
        TestClass testClass1 = new TestClass("Maman",
                "maman@mail.com");
        System.out.println(testClass1.getNameofStudent());
        System.out.println(testClass1.getMailStudent());
    }
}
