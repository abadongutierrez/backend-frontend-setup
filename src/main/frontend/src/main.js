import './style.css'
import {setupCounter} from './counter.js'

document.addEventListener('DOMContentLoaded', (event) => {
    console.log("New console.log");
    console.log("htmx(1): " + htmx.version);
    console.log("htmx.addedProperty: " + htmx.addedProperty);
    console.log("Alpine.addedProperty: " + Alpine.addedProperty);

    setupCounter(document.querySelector('#counter'));
});

window.addEventListener('beforeunload', function (event) {
    navigator.sendBeacon('/auth/logout');
});


