users = {
    'username': 'admin',
    'password': '123'
};


function verifyLoginFields() {
    username = document.getElementById('username').value;
    password = document.getElementById('password').value;

    colors = {
        true: 'crimson', false: 'black'
    };

    document.getElementById('userTitle').style.color = colors[!username.length];
    document.getElementById('passTitle').style.color = colors[!password.length];

    if(!username.length || !password.length) {
        document.getElementById('message').innerHTML = 'Preencha todos os campos.';
        return false;
    }

    return verifyLoginDatabase(username, password);
}


function verifyLoginDatabase(username, password) {
    if(username == users.username) {
        if(password == users.password) {
            window.location.href = '../panel/index.html';
            return true;
        }
    }

    document.getElementById('message').innerHTML = 'Usuário e/ou senha inválidos.';
    return false;
}


document.getElementById('username').addEventListener('keypress', function(event) {
    if(event.key === 'Enter') {
        event.preventDefault();
        document.getElementById('loginButton').click();
    }
});

document.getElementById('password').addEventListener('keypress', function(event) {
    if(event.key === 'Enter') {
        event.preventDefault();
        document.getElementById('loginButton').click();
    }
});