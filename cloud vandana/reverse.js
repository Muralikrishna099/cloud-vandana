function reverseWordsInSentence(sentence) {
    let words = sentence.split(" ");

    let reversedSentence = words.map(word => reverseWord(word)).join(" ");
    
    return reversedSentence;
}

function reverseWord(word) {
    return word.split("").reverse().join("");
}

let inputSentence = "This is a sunny day";


let reversedResult = reverseWordsInSentence(inputSentence);

console.log("Reversed Sentence: " + reversedResult);