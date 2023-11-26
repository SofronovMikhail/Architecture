public class Person {
    private int id;
    private String FIO;
    private Long cardNumber;
    private Long hashPass;
    private String login;

    public int getId() {
        return id;
    }

    public String getFIO() {
        return FIO;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getHashPass() {
        return hashPass;
    }

    public void setHashPass(Long hashPass) {
        this.hashPass = hashPass;
    }
}
