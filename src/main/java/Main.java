public class Main {
    public static void main(String[] args) {
        FormDate birthday = new FormDate();
        birthday.day = 13;
        birthday.month = 6;
        birthday.year = 1999;

        Post post = new Post();
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.surname = "Иванов";
        post.passport = "4444 № 444444";
        post.phone = "+7 (999) 999-99-99";
        post.subscription = true;

    }
}