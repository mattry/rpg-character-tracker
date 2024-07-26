package com.example.rpg_character_tracker.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.rpg_character_tracker.model.Character;
import com.example.rpg_character_tracker.repository.CharacterRepository;

import java.util.List;
import java.util.Optional;

@Service 
public class CharacterService {

    @Autowired
    private CharacterRepository charRepo;

    // create a character
    public Character createCharacter(Character character) {

        return charRepo.save(new Character(
            character.getCharacterName(),
            character.getCharacterClass(),
            character.getStrength(),
            character.getDexterity(),
            character.getConstitution(),
            character.getIntelligence(),
            character.getWisdom(),
            character.getCharisma()
        ));
    }

    // get all characters
    public List<Character> getAllCharacters() {
        return charRepo.findAll();
    }

    // get character by id
    public Optional<Character> getCharacterById(Long id) {
        return charRepo.findById(id);
    }
    
    // update a character
    public Character updateCharacter(Long id, Character updatedCharacter) {
        return charRepo.findById(id).map(character -> {
            character.setCharacterName(updatedCharacter.getCharacterName());
            character.setCharacterClass(updatedCharacter.getCharacterClass());
            character.setStrength(updatedCharacter.getStrength());
            character.setDexterity(updatedCharacter.getDexterity());
            character.setConstitution(updatedCharacter.getConstitution());
            character.setIntelligence(updatedCharacter.getIntelligence());
            character.setWisdom(updatedCharacter.getWisdom());
            character.setCharisma(updatedCharacter.getCharisma());
            return charRepo.save(character);
        }).orElseGet(() -> {
            updatedCharacter.setId(id);
            return charRepo.save(updatedCharacter);

        });
    }

    // delete a character by id
    public void deleteCharacter(Long id) {
        charRepo.deleteById(id);
    }

}
