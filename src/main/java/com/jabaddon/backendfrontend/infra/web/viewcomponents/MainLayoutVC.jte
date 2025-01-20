@import com.jabaddon.backendfrontend.infra.web.viewcomponents.MainLayoutVC
@param MainLayoutVC.MainLayoutView mainLayoutView

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <link rel="icon" type="image/svg+xml" href="/vite.svg" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vite App</title>
    <script src="https://unpkg.com/htmx.org@2.0.4"></script>
    <script src="//unpkg.com/alpinejs" defer></script>
    <script type="module" crossorigin src="/assets/main.js"></script>
    <link rel="stylesheet" crossorigin href="/assets/main.css">
</head>
<body>
<div id="app">
    ${mainLayoutView.contentViewComponent()}
</div>
@if (mainLayoutView.sessionActive())
<div>
    <form action="/auth/logout" method="post">
        <input type="hidden" name="_csrf" value="${mainLayoutView.crsfToken()}" />
        <button type="submit">Logout</button>
    </form>
</div>
@endif
<script>
    document.addEventListener('DOMContentLoaded', (event) => {
        console.log('DOM fully loaded and parsed 1');
        htmx.addedProperty = "hey HTMX!";
        Alpine.addedProperty = "hey Alpine!";
        console.log("htmx(2): " + htmx.version);
    });
</script>
</body>
</html>
