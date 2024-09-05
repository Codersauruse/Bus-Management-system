import { ReactComponent as Funnel } from "../resources/funnel-fill.svg";
import Button from "react-bootstrap/Button";

function Sort({  SortbyName, SortbyAttribute }) {
  return (
    <div className="Container">
      <div className="Label">
        <Button variant="outline-dark">
          <Funnel />
        </Button>
        <h4>Sort By :</h4>
      </div>
      <div className="sort">
        <Button
          variant="outline-dark"
          onClick={() => SortbyName()} // No need to pass bustable
        >
          Name
        </Button>
        <Button
          variant="outline-dark"
          onClick={() => SortbyAttribute("fare")} // Pass attribute name only
        >
          Fare
        </Button>
        <Button
          variant="outline-dark"
          onClick={() => SortbyAttribute("seats")}
        >
          Seats Availability
        </Button>
        <Button
          variant="outline-dark"
          onClick={() => SortbyAttribute("departure")} // Corrected typo
        >
          Departure Time
        </Button>
        <Button
          variant="outline-dark"
          onClick={() => SortbyAttribute("arrival")}
        >
          Arrival Time
        </Button>
      </div>
    </div>
  );
}

export default Sort;
