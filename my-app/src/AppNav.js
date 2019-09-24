import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink
} from 'reactstrap';

export default class AppNav extends React.Component {
    
    render() {
        return (
            <div>
                <Navbar color="dark" dark expand="md">
                    <NavbarBrand href="/">Expense Tarcker App</NavbarBrand>
                            <Nav className="ml-auto" navbar>
                            <NavItem>
                                <NavLink href="/home">Home</NavLink>
                            </NavItem>
                            
                            <NavItem>
                                <NavLink href="/categories">Category</NavLink>
                            </NavItem>

                            <NavItem>
                                <NavLink href="/expenses">Expenses</NavLink>
                            </NavItem>
                            
                        </Nav>
                    
                </Navbar>
            </div>
        );
    }
}