package guru.springframework.recipes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import guru.springframework.recipes.services.RecipeService;

@Controller
public class IndexController {
	
	private final RecipeService recipeService;
	

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}


	@GetMapping({"", "/", "/index.html"})
	public String getIndex(Model model) {		
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
	
}
