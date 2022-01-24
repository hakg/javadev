public class TestClass {
    private String name;
    private String age;
    private String job;

    TestClass(String name, String age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void introduce() {
        System.err.println("제이름은 " + this.name + "입니다.\n 나이는 " + this.age + "이고 \n 직업은 " + this.job + "입니다.");
    }
}
