import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';

import * as serviceWorker from './serviceWorker';

import Category from './Category';
import Home from './Home';
ReactDOM.render(<Home />, document.getElementById('root'));


serviceWorker.unregister();
