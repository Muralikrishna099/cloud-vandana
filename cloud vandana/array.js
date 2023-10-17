function sortArrayDescending(arr) {
    arr.sort(function(a, b) {
        return b - a; 
    });
}

let arr = [5, 1, 9, 3, 7, 2];
sortArrayDescending(arr);

console.log("Array sorted in descending order: " + arr);