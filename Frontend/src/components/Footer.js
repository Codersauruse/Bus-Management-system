import React from 'react';
import { Link } from 'react-router-dom';
import "./Footer.css";
export default function Footer() {
    return (
        <div className="footer">
            <div className="footer-section">
                <Link to="./AboutUs">About Us</Link>
                <p>Learn more about our company and values.</p>
            </div>
            <div className="footer-section">
                <Link to="/faq">FAQ</Link>
                <p>Find answers to commonly asked questions.</p>
            </div>
            <div className="footer-section">
                <Link to="/rate-us">Rate Us</Link>
                <p>We value your feedback!</p>
            </div>
        </div>
    );
}