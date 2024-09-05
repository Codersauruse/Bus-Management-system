import apiClient from "./Apiclient";


export const viewAllUsers = () => {
    return apiClient.get('user/view-all');
  };


  export const saveUser = (data) => {
    return apiClient.post('user/save', data);
  };

