package sheridan.daniel.assignmentone.model;

import java.util.Arrays;
import java.util.Collections;

public class Game {
    private final String[] boxes = {"Car", "Nothing", "Trip", "Money", "Nothing"};
    private String userPick;
    private String prize;

    public Game() {
        shuffleBoxes();
    }

    private void shuffleBoxes() {
        Collections.shuffle(Arrays.asList(boxes));
    }

    public void setUserPick(int index) {
        this.userPick = "Box " + (index + 1);
        this.prize = boxes[index];
    }

    public String getPrize() {
        return prize;
    }

    public String getUserPick() {
        return userPick;
    }

}


