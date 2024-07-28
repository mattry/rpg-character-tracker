import React, { useState } from 'react';
import axios from 'axios';

const SearchCharacter = () => {
  const [id, setId] = useState('');
  const [character, setCharacter] = useState(null);

  const handleSearch = (e) => {
    e.preventDefault();
    axios.get(`http://localhost:8080/api/characters/${id}`)
      .then(response => {
        setCharacter(response.data);
      })
      .catch(error => {
        console.error('Error fetching character:', error);
      });
  };

  return (
    <div>
      <h2>Search Character by ID</h2>
      <form onSubmit={handleSearch}>
        <div>
          <label>ID:</label>
          <input type="text" value={id} onChange={(e) => setId(e.target.value)} required />
        </div>
        <button type="submit">Search</button>
      </form>
      {character && (
        <div>
          <h3>Character Details</h3>
          <p>Name: {character.characterName}</p>
          <p>Class: {character.characterClass}</p>
        </div>
      )}
    </div>
  );
};

export default SearchCharacter;