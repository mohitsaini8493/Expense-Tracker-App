import React, { Component } from 'react';
import {Route, BrowserRouter as Router, Switch } from 'react-router-dom';
import Category from './Category';
import Home from './Home';
import Expenses from './Expenses';
import AppNav from './AppNav';


export default class App extends Component {
    render() {
        return (
            <Router>
                <div>
                    <AppNav />
                    <Switch>
                        <Route path='/' exact={true} component={Home}/>
                        <Route path='/categories' exact={true} component={Category} />
                        <Route path='/expenses' exact={true} component={Expenses} />
                    </Switch>
                </div>
            </Router>
            
        );
    }
}
