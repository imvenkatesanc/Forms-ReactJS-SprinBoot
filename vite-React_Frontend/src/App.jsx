import React, { useState } from 'react';
import Navbar from './Components/Navbar';
import ContactForm from './Components/ContactForm';
import './App.css';

const App = () => {

  return (
    <div className="App">
      <Navbar/>
      <ContactForm/>
    </div>
  );
};

export default App;