import axios from 'axios';


const Apiclient = axios.create({
    baseURL: 'http://localhost:8090/api/v1/',
    headers: {
      'Content-Type': 'application/json',
    },
  });

  export default Apiclient;


