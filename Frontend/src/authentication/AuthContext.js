import React, { createContext, useState } from 'react';


export const AuthContext = createContext();


export const AuthProvider = ({ children }) => {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  
  const login = () => {
    setIsLoggedIn(true);
    console.log('User logged in');
  };

  
  const logout = () => {
    setIsLoggedIn(false);
    console.log('User logged out');
  };

  return (
    <AuthContext.Provider value={{ isLoggedIn, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
};
