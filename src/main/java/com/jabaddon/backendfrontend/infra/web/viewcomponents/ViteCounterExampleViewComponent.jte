@import com.jabaddon.backendfrontend.infra.web.viewcomponents.ViteCounterExampleViewComponent

@param ViteCounterExampleViewComponent.ViteCounterExampleView viteCounterExampleView

<div>
    <a href="https://vite.dev" target="_blank">
        <img src="vite.svg" class="logo" alt="Vite logo" />
    </a>
    <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
        <img src="javascript.svg" class="logo vanilla" alt="JavaScript logo" />
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

<script type="module" crossorigin src="assets/myComponent.js"></script>

