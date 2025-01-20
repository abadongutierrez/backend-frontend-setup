@import com.jabaddon.backendfrontend.infra.web.viewcomponents.LoginForm
@param LoginForm.LoginFormView loginFormView

<form action="/auth/login" method="post">
    <input type="hidden" name="_csrf" value="${loginFormView.crsfToken()}" />
    <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <button type="submit">Login</button>
</form>