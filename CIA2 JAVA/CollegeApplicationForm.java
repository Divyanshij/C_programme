import java.awt.*;

public class CollegeApplicationForm extends Frame {
    private Label nameLabel, ageLabel, genderLabel;
    private TextField nameField, ageField;
    private CheckboxGroup genderGroup;
    private Checkbox maleCheckbox, femaleCheckbox;
    private Button submitButton;

    public CollegeApplicationForm() {
        super("College Application Form");
        setLayout(new GridLayout(5, 2, 5, 5));

       
        nameLabel = new Label("Name:");
        add(nameLabel);

        nameField = new TextField(20);
        add(nameField);

        ageLabel = new Label("Age:");
        add(ageLabel);

        ageField = new TextField(5); 
        add(ageField);

        genderLabel = new Label("Gender:");
        add(genderLabel);

       
        genderGroup = new CheckboxGroup();
        maleCheckbox = new Checkbox("Male", genderGroup, false);
        femaleCheckbox = new Checkbox("Female", genderGroup, false);
        Panel genderPanel = new Panel();
        genderPanel.add(maleCheckbox);
        genderPanel.add(femaleCheckbox);
        add(genderPanel);

        
        submitButton = new Button("Submit");
        add(submitButton);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CollegeApplicationForm();
    }
}
