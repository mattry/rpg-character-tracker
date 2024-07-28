import React, { useEffect, useState } from 'react';
import axios from 'axios';

const CharacterList = () => {
    const [characters, setCharacters] = useState([]);

    useEffect(() => {
        axios.get('http://localhost:8080/api/characters')
        .then(response => {
            setCharacters(response.data);
        })
        .catch(error => {
            console.error('Error fetching characters', error);
        });
    }, []);

    const deleteCharacter = (id) => {
        axios.delete(`http://localhost:8080/api/characters/${id}`)
        .then(() => {
            setCharacters(characters.filter(character => character.id !== id));
        })
        .catch(error => {
            console.error('Error deleting character', error);
        });
    };

    return (
        <div>
            <h2>All Characters</h2>
            <ul>
                {characters.map(character => (
                    <li key={character.id}>
                        {character.characterName} - {character.characterClass}
                        <button onClick={() => deleteCharacter(character.id)}>Delete</button>
                    </li>
                ))}
            </ul>
        </div>
    );
};

export default CharacterList;