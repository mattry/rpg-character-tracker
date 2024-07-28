import React from 'react';
import CharacterList from './components/CharacterList';
import SearchCharacter from './components/SearchCharacter';
import CharacterForm from './components/CharacterForm';

function App() {
  return (
    <div className="App">
      <h1>RPG Character Tracker</h1>
      <CharacterForm />
      <SearchCharacter />
      <CharacterList />
    </div>
  );
}

export default App;
