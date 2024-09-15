import random
import string

def generate_word_until_match(target_word):
    letters = string.ascii_lowercase  #lower case only
    formed_word = ''
    attempts = 0
    
    while target_word not in formed_word:
        new_letter = random.choice(letters)  #generates random letter
        formed_word += new_letter
        attempts += 1

    print(f"Target word '{target_word}' found in {formed_word} after {attempts} attempts.")

# You can change the target word here
target_word = input("Enter the target word: ").strip()
generate_word_until_match(target_word)
