<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <link rel="icon" type="image/svg+xml" href="vite.svg" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vite App</title>
    <script src="https://unpkg.com/htmx.org@2.0.4"></script>
    <script src="//unpkg.com/alpinejs" defer></script>
    <script
            src="https://code.jquery.com/jquery-3.7.1.min.js"
            integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
            crossorigin="anonymous"></script>
    <script type="module" crossorigin src="assets/main.js"></script>
    <link rel="stylesheet" crossorigin href="assets/main.css">
</head>
<body>
<div id="app"></div>
<script>
    $(document).ready(function() {
        htmx.addedProperty = "hey HTMX!";
        $.addedProperty = "hey jQuery!";
        Alpine.addedProperty = "hey Alpine!";
        console.log("htmx(2): " + htmx.version);
    });
</script>
</body>
</html>
