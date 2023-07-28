import React, { useState } from 'react';
import axios from 'axios';
import '../App.css';

const ContactForm = () => {
  const [formData, setFormData] = useState({
    name: '',
    education: '',
    city: '',
    email: '',
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    console.log(formData); // This will log the form data to the console for now
    // Here, you can make the API call to your Spring Boot backend
        // Here, you can make the API call to your Spring Boot backend using axios
        axios.post('http://localhost:8084/api/v1/students/save', formData)
        .then((response) => {
          // Handle the API response here (response.data will contain the response from the server)
          console.log(response.data);
        })
        .catch((error) => {
          // Handle any errors that occur during the API call
          console.error('Error:', error);
        });
  };

  return (
    <form className="contact-form" onSubmit={handleSubmit}>
      <div className="form-group">
        <label htmlFor="name">Name</label>
        <input
          type="text"
          id="name"
          name="name"
          value={formData.name}
          onChange={handleChange}
          placeholder="Enter your name"
        />
      </div>

      <div className="form-group">
        <label htmlFor="education">Education</label>
        <input
          type="text"
          id="education"
          name="education"
          value={formData.education}
          onChange={handleChange}
          placeholder="Enter your education"
        />
      </div>

      <div className="form-group">
        <label htmlFor="city">City</label>
        <input
          type="text"
          id="city"
          name="city"
          value={formData.city}
          onChange={handleChange}
          placeholder="Enter your city"
        />
      </div>

      <div className="form-group">
        <label htmlFor="email">Email</label>
        <input
          type="email"
          id="email"
          name="email"
          value={formData.email}
          onChange={handleChange}
          placeholder="Enter your email"
        />
      </div>

      <button type="submit">Submit</button>
    </form>
  );
};

export default ContactForm;
