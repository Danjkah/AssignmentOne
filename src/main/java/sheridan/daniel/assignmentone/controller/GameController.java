package sheridan.daniel.assignmentone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import sheridan.daniel.assignmentone.model.Game;

@Controller
public class GameController {

    @GetMapping("/")
    public String showGamePage() {
        return "game";
    }

    @GetMapping("/play")
    public String playGame(@RequestParam("box") int boxIndex, Model model) {
        Game game = new Game();
        game.setUserPick(boxIndex);

        model.addAttribute("userPick", game.getUserPick());
        model.addAttribute("prize", game.getPrize());

        model.addAttribute("lossPrizeOne", game.getPrizeLossOne());
        model.addAttribute("userPickLossOne", Game.getUserPickLoss());

        model.addAttribute("lossPrizeTwo", game.getPrizeLossTwo());
        model.addAttribute("userPickLossTwo", Game.getUserPickLoss());

        model.addAttribute("lossPrizeThree", game.getPrizeLossThree());
        model.addAttribute("userPickLossThree", Game.getUserPickLoss());


        model.addAttribute("lossPrizeFour", game.getPrizeLossFour());
        model.addAttribute("userPickLossFour", Game.getUserPickLoss());

        return "result";
    }
}