//Declaration of Variables
let colorChoice = document.getElementById('colorPicker').value;
const toMakeGrid = document.getElementById('pixelCanvas');
const buttonInteraction = document.getElementById('button');

// When size is submitted by the user, call makeGrid()
function makeGrid() {
    let height = document.getElementById('sizePicker').elements[0].value;
    let width = document.getElementById('sizePicker').elements[1].value;
    for (let h = 0; h <= height; h++) {
        if(h == 0){
            continue;
        }
        row = document.createElement('div');
        row.setAttribute('class', 'divBox');
        toMakeGrid.appendChild(row);
        for(let w = 0; w <= width; w++){
            if( w == 0){
                continue
            }
            column = document.createElement('div');
            column.setAttribute('class', 'divBox');
            row.appendChild(column);
        }
    }
}


function toRun () {
    buttonInteraction.addEventListener('click',function(a){
    a.preventDefault();
    makeGrid();
    toColorBoxes = document.querySelectorAll('.divBox');
    for(box of toColorBoxes){
        box.addEventListener('click',function onClick(event){
            event.target.style.backgroundColor = document.getElementById('colorPicker').value;;
        })
    }
    })
}


toRun();
alert("Refresh page to create a new piece of art! \nHitting submit after creating will expand your drawing space!")