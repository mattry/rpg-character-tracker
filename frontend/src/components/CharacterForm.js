import React, { useState } from 'react';
import axios from 'axios';

const CharacterForm = () => {

    const [characterName, setCharacterName] = useState('');
    const [characterClass, setCharacterClass] = useState('');
    const [strength, setStrength] = useState(1);
    const [dexterity, setDexterity] = useState(1);
    const [constitution, setConstitution] = useState(1);
    const [intelligence, setIntelligence] = useState(1);
    const [wisdom, setWisdom] = useState(1);
    const [charisma, setCharisma] = useState(1);

    const handleSubmit = (e) => {
        e.preventDefault();
        const newCharacter = { characterName, characterClass, strength,
                            dexterity, constitution, intelligence,
                            wisdom, charisma
        };
        axios.post('http://localhost:8080/api/characters', newCharacter)
        .then(response => {
            console.log('Character created:', response.data);
            setCharacterName('');
            setCharacterClass('');
            setStrength(1);
            setDexterity(1);
            setConstitution(1);
            setIntelligence(1);
            setWisdom(1);
            setCharisma(1);
        })
        .catch(error => {
            console.error('Error creating character', error);
        });
    };

    return (
        <div>
            <h2>Create New Character</h2>
            <form onSubmit={handleSubmit}>
                <div>
                    <label>Name:</label>
                    <input type="text" value={characterName} onChange={(e) => setCharacterName(e.target.value)} required />
                </div>
                <div>
                    <label>Class:</label>
                    <input type="text" value={characterClass} onChange ={(e) => setCharacterClass(e.target.value)} required />
                </div>
                <div>
                    <label>Strength:</label>
                    <input type="number" value={strength} onChange={(e) => setStrength(parseInt(e.target.value, 10))} required />
                </div>
                <div>
                    <label>Dexterity:</label>
                    <input type="number" value={dexterity} onChange={(e) => setDexterity(parseInt(e.target.value, 10))} required />
                </div>
                <div>
                    <label>Constitution:</label>
                    <input type="number" value={constitution} onChange={(e) => setConstitution(parseInt(e.target.value, 10))} required />
                </div>
                <div>
                    <label>Intelligence:</label>
                    <input type="number" value={intelligence} onChange={(e) => setIntelligence(parseInt(e.target.value, 10))} required />
                </div>
                <div>
                    <label>Wisdom:</label>
                    <input type="number" value={wisdom} onChange={(e) => setWisdom(parseInt(e.target.value, 10))} required />
                </div>
                <div>
                    <label>Charisma:</label>
                    <input type="number" value={charisma} onChange={(e) => setCharisma(parseInt(e.target.value, 10))} required />
                </div>
                <button type="submit">Create</button>
            </form> 
        </div>
    );
};

export default CharacterForm;