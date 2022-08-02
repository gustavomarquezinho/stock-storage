let statusMenu = true;

sideBar = document.querySelector('.sidebar');
sideBarButton = document.querySelectorAll('.sidebar-button-name');
sideBarSearch = document.querySelector('.sidebar-search');
tableSection = document.querySelector('.table-section');


function showHideMenu() {
    statusMenu = !statusMenu;
    
    if(statusMenu)
        showMenu();
    else
        hideMenu();
}

function showMenu() {
    sideBar.style.width = '15%';
    sideBarSearch.style.visibility = 'visible';

    for(let i = 0; i < sideBarButton.length; ++i) {
        sideBarButton[i].style['visibility'] = 'visible';
        sideBarButton[i].style['opacity'] = '100%';
    }

    tableSection.style.width = '81.5%';
    tableSection.style.left = '17.5%';
}

function hideMenu() {
    sideBar.style.width = '64px';
    sideBarSearch.style.visibility = 'hidden';

    for(let i = 0; i < sideBarButton.length; ++i) {
        sideBarButton[i].style['visibility'] = 'hidden';
        sideBarButton[i].style['opacity'] = '0%';
    }

    tableSection.style.width = '92%';
    tableSection.style.left = '6.25%';
}