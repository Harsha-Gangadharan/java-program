import javax.swing.*;
import java.awt.*;

public class UserProfileGUI {
    public static void main(String[] args) {
        final UserProfile User1 = new UserProfile("Anu", 24, "anu@gmail.com");
        UserProfile User2 = new UserProfile("Sanu", 34, "sanu@gmail.com");

        JFrame frame = new JFrame("User Profile");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.add("Anu", createUserProfilePanel(User1));
        tabbedPane.add("Sanu", createUserProfilePanel(User2));

        frame.add(tabbedPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private static JPanel createUserProfilePanel(UserProfile User) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));
        panel.add(new JLabel("Name:"));
        panel.add(new JLabel(User.getName()));
        panel.add(new JLabel("Age:"));
        panel.add(new JLabel(String.valueOf(User.getAge())));
        panel.add(new JLabel("Email:"));
        panel.add(new JLabel(User.getEmail()));
        return panel;
    }
}

class UserProfile {
    private String name;
    private int age;
    private String email;

    public UserProfile(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
