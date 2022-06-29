//Declaration of Variables
let colorChoice = document.getElementById('colorPicker').value;
const toMakeGrid = document.getElementById('pixelCanvas');
const buttonInteraction = document.getElementById('button');


/*When size is submitted by the user, Grab height & width, Create loops to 
loop through and create divs. Then append divs to the pixelCanvas(toMakeGride variable)*/
function makeGrid() {
    const height = document.getElementById('sizePicker').elements[0].value;
    const width = document.getElementById('sizePicker').elements[1].value;
    for (let h = 0; h <= height; h++) {
        if (h == 0) {
            continue;
        }
        row = document.createElement('div');
        row.setAttribute('class', 'divBox');
        toMakeGrid.appendChild(row);
        for (let w = 0; w <= width; w++) {
            if (w <= 0) {
                continue;
            }
            column = document.createElement('div');
            column.setAttribute('class', 'divBox');
            row.appendChild(column);
        }
    }
}


/*Creating a function to interact with the submit button, inserting the above function
to create the items upon click and adding the click event to the divs for color.*/
function toRun() {
    buttonInteraction.addEventListener('click', function(a){
        a.preventDefault();
        makeGrid();
        toColorBoxes = document.querySelectorAll('.divBox');
        for (box of toColorBoxes) {
            box.addEventListener('click', function onClick(event) {
                event.target.style.backgroundColor = document.getElementById('colorPicker').value;
            })
        }
   })
}

//run the code
toRun();

