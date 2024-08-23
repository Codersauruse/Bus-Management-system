import React from "react";
import "./App.css";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Home from "./pages/Home";
import Booking from "./pages/Booking";
import Map from "./pages/Map";
import SignUp from "./pages/Signup";
import Login from "./pages/Login";
import { useState } from "react";

function App() {
  const isLoggedIn = true; // Replace with actual login state
  const [destination, setDestination] = useState("");
 

  return (
    <Router>
      <div className="App">
        <Routes>
          <Route path="/home" element={<Home isLoggedIn={isLoggedIn}  destination={destination} setDestination={setDestination}/>} />
          <Route path="/booking" element={<Booking />} />
          <Route path="/map" element={<Map destination={destination} setDestination={setDestination}/>} />
          <Route path="/" element={<Home isLoggedIn={isLoggedIn} />} />
          <Route path="/signup" element={<SignUp />} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
