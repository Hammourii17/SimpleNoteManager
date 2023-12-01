
import java.util.ArrayList;
import java.util.List;

public class NoteManager {
    private List<String> notes;

    public NoteManager() {
        notes = new ArrayList<>();
    }

    public void addNote(String note) {
        notes.add(note);
    }

    public void displayNotes() {
        System.out.println("Notes:");
        for (String note : notes) {
            System.out.println("- " + note);
        }
    }

    // Main method for demonstration purposes
    public static void main(String[] args) {
        NoteManager manager = new NoteManager();
        manager.addNote("its working! and is here  ");
        manager.addNote("Second note");
        manager.displayNotes();
    }
}


