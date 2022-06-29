//Declaration of Variables
let height = document.getElementById('sizePicker').elements[0].value;
let width = document.getElementById('sizePicker').elements[1].value;
let colorChoice = document.getElementById('colorPicker').value;
const toMakeGrid = document.getElementById('pixelCanvas');

// When size is submitted by the user, call makeGrid()
function makeGrid() {
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




//Call make grid
makeGrid();

//code to color the boxes by grabbing nodelist
//looping through node list and add clickevent to each and changing the color.
toColorBoxes = document.querySelectorAll('.divBox');
for(box of toColorBoxes){
    box.addEventListener('click',function onClick(event){
        event.target.style.backgroundColor = document.getElementById('colorPicker').value;;
    })
}


alert("Enter grid height/width, then refresh page.\n For new table values refresh. \n Submit clears page. This message repeats upon refresh.\n .")


