package com.example.rpg_character_tracker.model;

import jakarta.persistence.*;

@Entity
@Table(name="characters")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long charId;

    @Column(name="characterName")
    private String characterName;

    @Column(name="characterClass")
    private String characterClass;

    @Column(name="strength")
    private int strength;

    @Column(name="dexterity")
    private int dexterity;

    @Column(name="constitution")
    private int constitution;

    @Column(name="intelligence")
    private int intelligence;

    @Column(name="wisdom")
    private int wisdom;

    @Column(name="charisma")
    private int charisma;

    // default constructor
    public Character() {}

    // parameterized constructor
    public Character(String characterName, String characterClass,
                     int strength, int dexterity, int constitution,
                     int intelligence, int wisdom, int charisma) {

        this.characterName = characterName;
        this.characterClass = characterClass;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma; 
    }

    // getters and setters

    public long getId() {
        return charId;
    }

    public void setId(Long charId) {
        this.charId = charId;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getCharisma() {
        return charisma;
    }

    @Override
    public String toString() {
        return "Character: {" +
                "charId=" + charId +
                ", characterName='" + characterName + '\'' +
                ", characterClass='" + characterClass + '\'' +
                ", STR=" + strength +
                ", DEX=" + dexterity +
                ", CON=" + constitution +
                ", INT=" + intelligence +
                ", WIS=" + wisdom +
                ", CHA=" + charisma +
                '}';
    }



    

    
}
