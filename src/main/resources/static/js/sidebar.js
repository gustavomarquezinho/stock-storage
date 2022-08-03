sideBarMain = document.querySelector('.sidebar');
sideBarSearch = document.querySelector('.sidebar-search');
sideBarButton = document.querySelectorAll('.sidebar-button-name');

productsTable = document.querySelector('.products-table');
registerMain = document.querySelector('.register-main');


if(localStorage.getItem('statusMenu') === null)
    localStorage.setItem('statusMenu', 'true');
else {
    if(localStorage.getItem('statusMenu') === 'false') {
        if(productsTable !== null)
            hideMenuProducts();

        if(registerMain !== null)
            hideMenuRegister();
    }
}

// --------------- //

function displaySidebarProducts() {
    statusMenu = localStorage.getItem('statusMenu') === 'false' ? 'true' : 'false'
    localStorage.setItem('statusMenu', statusMenu);

    if(statusMenu === 'true') {
        showMenuProducts();
        return
    }

    hideMenuProducts();
    return
}

function showMenuProducts() {
    showSidebar();
    productsTable.style.width = '81.5%';
    productsTable.style.left = '17.5%';
}

function hideMenuProducts() {
    hideSidebar();
    productsTable.style.width = '92%';
    productsTable.style.left = '6.25%';
}

// --------------- //

function displaySidebarRegister() {
    statusMenu = localStorage.getItem('statusMenu') === 'false' ? 'true' : 'false'
    localStorage.setItem('statusMenu', statusMenu);

    if(statusMenu === 'true') {
        showMenuRegister();
        return
    }

    hideMenuRegister();
    return
}

function showMenuRegister() {
    showSidebar();
    registerMain.style.left = '39%';
}

function hideMenuRegister() {
    hideSidebar();
    registerMain.style.left = '33.5%';
}

// --------------- //

function showSidebar() {
    sideBarMain.style.width = '15%';
    sideBarSearch.style.visibility = 'visible';

    for(let i = 0; i < sideBarButton.length; ++i) {
        sideBarButton[i].style.visibility = 'visible';
        sideBarButton[i].style.opacity = '100%';
    }
}

function hideSidebar() {
    sideBarMain.style.width = '64px';
    sideBarSearch.style.visibility = 'hidden';

    for(let i = 0; i < sideBarButton.length; ++i) {
        sideBarButton[i].style.visibility = 'hidden';
        sideBarButton[i].style.opacity = '0%';
    }
}
