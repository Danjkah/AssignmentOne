package sheridan.daniel.assignmentone.model;

import java.util.Arrays;
import java.util.Collections;

public class Game {
    private final String[] boxes = {"Car", "Nothing", "Trip", "Money", "Nothing"};
    private int userPick;
    private String prize;
    private String lossPrizeOne;
    private String lossPrizeTwo;
    private String lossPrizeThree;
    private String lossPrizeFour;

    public static int userPickLoss;

    public Game() {
        shuffleBoxes();
    }

    private void shuffleBoxes() {
        Collections.shuffle(Arrays.asList(boxes));
    }

    public void setUserPick(int index) {
        this.userPick = (index + 1);
        userPickLoss = (index + 1);
        this.prize = boxes[index];
        this.lossPrizeOne = boxes[(index + 1 ) % 5 ];
        this.lossPrizeTwo = boxes[(index + 2 ) % 5 ];
        this.lossPrizeThree = boxes[(index + 3 ) % 5 ];
        this.lossPrizeFour = boxes[(index + 4 ) % 5 ];
    }

    public String getPrize() {
        return prize;
    }
    public String getPrizeLossOne() {
        return lossPrizeOne;
    }
    public String getPrizeLossTwo() {
        return lossPrizeTwo;
    }
    public String getPrizeLossThree() {
        return lossPrizeThree;
    }
    public String getPrizeLossFour() {
        return lossPrizeFour;
    }

    public int getUserPick() {
        return userPick;
    }


    public static int getUserPickLoss() {
        if(((userPickLoss + 1) % 6) != 0){
            userPickLoss ++;

        }
        else{
            userPickLoss = 1;
        }
        return userPickLoss;

    }
}


