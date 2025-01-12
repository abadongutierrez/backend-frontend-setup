import './style.css'
import javascriptLogo from './javascript.svg'
import viteLogo from '/vite.svg'
import {setupCounter} from './counter.js'

$(document).ready(function () {
    console.log("htmx(1): " + htmx.version);
    console.log("$.addedProperty: " + $.addedProperty);
    console.log("htmx.addedProperty: " + htmx.addedProperty);
    console.log("Alpine.addedProperty: " + Alpine.addedProperty);
    document.querySelector('#app').innerHTML = `
      <div>
        <a href="https://vite.dev" target="_blank">
          <img src="${viteLogo}" class="logo" alt="Vite logo" />
        </a>
        <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
          <img src="${javascriptLogo}" class="logo vanilla" alt="JavaScript logo" />
        </a>
        <h1>Hello Vite!</h1>
        <div class="card">
          <button id="counter" type="button"></button>
        </div>
        <div class="card">
          <button hx-post="/example/clicked" hx-swap="outerHTML">
            Click Me
          </button>
        </div>
        <p class="read-the-docs">
          Click on the Vite logo to learn more
        </p>
      </div>
    `;
    htmx.process(document.querySelector('#app'));

    setupCounter(document.querySelector('#counter'));
});


