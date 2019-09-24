import React, { Component } from 'react';
import AppNav from './AppNav';
import DatePicker from "react-date-picker";

import 'bootstrap/dist/css/bootstrap.css';
import { Container, Button, Form, FormGroup, Label, Input, FormText } from 'reactstrap';
import {Link} from 'react-router-dom';

export default class Expenses extends React.Component {
    render() {
        return (
            <Container>
                <p></p>
            <Form>
                <FormGroup>
                    <Label for="title">Title</Label>
                    <Input type="text" name="title" id="title" onChange={this.handleChange}/>
                </FormGroup>
                <FormGroup>
                    <Label for="category">Category</Label>
                    <Input type="text" name="category" id="category" onChange={this.handleChange} />
                </FormGroup>
                
                <FormGroup>
                    <Label for="expenseDate">Expense Date</Label>
                    <Input type="text" name="expenseDate" id="expenseDate" onChange={this.handleChange} />
                </FormGroup>
                <FormGroup>
                    <Label for="location">Location</Label>
                    <Input type="text" name="location" id="location" onChange={this.handleChange} />
                </FormGroup>

                <FormGroup>
                    <Button type ="submit">Submit</Button><span> </span>
                    <Button tag={Link} to="/categories">Cancel</Button>
                </FormGroup>  
            </Form>
            </Container>
        );
    }
}