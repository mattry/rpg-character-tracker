package com.example.rpg_character_tracker.repository;

import com.example.rpg_character_tracker.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    
}
