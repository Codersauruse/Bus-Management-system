import React, { useState, useEffect } from "react";
import { useLocation, useNavigate } from "react-router-dom";
import Header from "../components/Header";
import Bussearch from "../components/Bussearch";
import Sort from "./Sort";
import Journey from "../components/Timetable-components/Journey";
import { viewAllBusses } from "../apiService/ApiService";

export default function Map() {
  const [Destination, setDestination] = useState("");
  const [bustable, setBustable] = useState([]);
  const [filteredBustable, setFilteredBustable] = useState([]);
  const location = useLocation();
  const destination = location.state?.destination || "";
  const navigate = useNavigate();




  const handleBooking = (bus) => {
    navigate("/booking", { state: { busJourney: bus } });
  };

  useEffect(() => {
    const getBusDetails = async () => {
      try {
        const response = await viewAllBusses();
        setBustable(response.data);
        setFilteredBustable(response.data); // Initialize filteredBustable with all data
        console.log(response.data);
      } catch (error) {
        console.error("Error fetching data:", error);
      }
    };

    getBusDetails();
  }, []); // Only runs once on component mount

  useEffect(() => {
    if (destination) {
      const filtered = bustable.filter((bus) => bus.city === destination);
      setFilteredBustable(filtered);
    } else {
      setFilteredBustable(bustable); // Show all if no destination is selected
    }
  }, [destination, bustable]); // Only filters when destination or bustable changes

  function SortbyName() {
    const sortedBustable = filteredBustable.slice().sort((a, b) => a.name.localeCompare(b.name));
    setFilteredBustable(sortedBustable);
  }
  
  function SortbyAttribute(attribute) {
    const sortedBustable = filteredBustable.slice().sort((a, b) => {
      if (typeof a[attribute] === 'string') {
        return a[attribute].localeCompare(b[attribute]);
      }
      return a[attribute] - b[attribute];
    });
    setFilteredBustable(sortedBustable);
  }

  function SortByCity() {
    if (location.pathname !== "/map") {
      navigate("/map");
    }
    const filteredBustable = bustable.filter((bus) => bus.city === Destination);
    setFilteredBustable(filteredBustable);
  }

  return (
    <div className="home-container">
      <div className="head">
        <Header />
        <br />
        <br />
        <br />
        <div className="content">
          <br />
          <br />
          <div className="search-bar">
            <br />
            <Bussearch bustable={filteredBustable} destination={Destination}  setDestination={setDestination} onSearch={SortByCity}/>
          </div>
        </div>
      </div>
      <Sort
        SortbyName={SortbyName}
        SortbyAttribute={SortbyAttribute}
      />
      <Timetable bustable={filteredBustable} handleBooking={handleBooking}/>
    </div>
  );
}

function Timetable({ bustable,handleBooking }) {
 
  const color = [
    "primary",
    "secondary",
    "success",
    "danger",
    "warning",
    "info",
    "dark",
  ];

  return (
    <div className="list">
      
      <ul>
        {bustable.map((init,index) => (
          <Journey
            key={`${index}`} // Make sure each item has a unique key
            journey={init}
            color={color[Math.floor(Math.random() * 7)]
            }
            handleBooking={() => handleBooking(init)}
          />
        ) )}
      </ul>
    </div>
  );
}
