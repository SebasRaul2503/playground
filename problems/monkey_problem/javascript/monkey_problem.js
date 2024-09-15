const letters = 'abcdefghijklmnopqrstuvwxyz';

var formed_word = '';
var steps = 0;
const word = 'hello'; // type here the word to match

while (!formed_word.includes(word)) {
    random_letter = letters.charAt(Math.floor(Math.random() * letters.length));
    formed_word+=random_letter;
    steps+=1;

    if(formed_word.length > 100){ // can change this limit to compare larger strings
        formed_word = formed_word.slice(-50);// keeps only the 50 last letters after reach the limit of 100
    }
}

console.log(`The word ${word} was found after ${steps} characters generated, here the last 50 letters:
    \n${formed_word}`);
