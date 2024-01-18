"""
SYSC 2100 Winter 2024
Lab 1, Part 3, Exercise 4, Extra-Practice Exercise 5
"""

__author__ = 'Sabeen Rafiq'
__student_number__ = '101258923'

import string

# For information about the string module, type help(string) at the shell
# prompt, or browse "The Python Standard Library", Section "Built-in Types",
# Subsection "Text Sequence Type - str" in the documentation
# (available @ python.org).


def build_concordance(filename: str) -> dict[str, list[int]]:
    """Return a concordance of words in the text file
    with the specified filename.

    The concordance is stored in a dictionary. The keys are the words in the
    text file. The value associated with each key is a list containing the line
    numbers of all the lines in the file in which the word occurs.)

    >>> concordance = build_concordance('sons_of_martha.txt')
    """
    # Open file
    infile = open(filename, "r")

    # Initalize Variables
    concordance = {}
    line_num = []
    counter = 0

    # Iterate through each line in file
    for line in infile:
        # Counter line number
        counter += 1
        
        # Make a list contaning words from the line
        word_list = line.split()

        # Iterate though the words in the line
        for word in word_list:
            # Remove punctuation and lowercase
            word = word.strip(string.punctuation).lower()
            # If the word is already a key in the dict
            if word in concordance.keys():
                # Add the line number to the list for the word
                concordance[word].append(counter)
            else:
                # Add word to list with the current line number
                concordance[word] = [counter]
        # Convert list to set to list for each word's list to ensure no duplicates
        list(set(concordance[word]))
    return concordance


# Extra-Practice: Exercise 5 Solution


if __name__ == '__main__':
    pass
    # Write your solution to Extra-practice Exercise 5 here
