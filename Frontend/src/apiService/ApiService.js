import apiClient from "./ApiClient"


export const viewAllUsers = () => {
    return apiClient.get('user/view-all');
  };


  export const saveUser = (data) => {
    return apiClient.post('user/save', data);
  };

  export const viewAllBusses = () =>{
    return apiClient.get('BusInfo/get-All-buses');
  }
