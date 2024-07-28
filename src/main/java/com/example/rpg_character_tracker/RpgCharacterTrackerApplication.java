package com.example.rpg_character_tracker;

import com.example.rpg_character_tracker.model.Character;
import com.example.rpg_character_tracker.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RpgCharacterTrackerApplication implements CommandLineRunner {

	@Autowired
	private CharacterService characterService;

	public static void main(String[] args) {
		SpringApplication.run(RpgCharacterTrackerApplication.class, args);
	}

	// make a default character in the database for testing
	@Override
	public void run(String... args) throws Exception {
		Character testCharacter = new Character(
			"Testermann",
			"Tester",
			10, 10, 10, 10, 10, 10
		);

		characterService.createCharacter(testCharacter);
	}

}
