#include <iostream>
#include <string>
#include <random>
#include <ctime>

// function that generates a random character from a-z (can also include A-Z, just needs to be added)
char random_char() {
    static const char alphanum[] = "abcdefghijklmnopqrstuvwxyz";
    int stringLength = sizeof(alphanum) - 1; // because the last element is '\0'
    return alphanum[rand() % stringLength];
}

// main function to generate random letters until the target word is found
void generate_word_until_match(const std::string& target_word) {
    std::string formed_word;
    int attempts = 0;
    
    while (formed_word.find(target_word) == std::string::npos) {
        char new_letter = random_char();
        formed_word += new_letter;  // appends the letter
        attempts++;
        
        if (formed_word.length() > 100) {
            formed_word = formed_word.substr(formed_word.length() - 50); // keep the last 50 characters (optimization)
        }
        
    }

    std::cout << "Target word '" << target_word << "' was found after " << attempts << " attempts." << std::endl;
}

int main() {
    srand(time(nullptr)); // seed the random generator with current time

    std::string target_word;
    std::cout << "Enter the target word: ";
    std::cin >> target_word; // input the target word in console

    generate_word_until_match(target_word);

    return 0;
}
