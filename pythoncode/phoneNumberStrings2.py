digit_map = {
    '1':' ',
    '2': 'abc',
    '3': 'def',
    '4': 'ghi',
    '5': 'jkl',
    '6': 'mno',
    '7': 'pqrs',
    '8': 'tuv',
    '9': 'wxyz',
    '0': "+",
}

def word_numbers(input):
  input = str(input)
  ret = ['']
  for char in input:
    letters = digit_map.get(char, '')
    ret = [anything+letter for anything in ret for letter in letters]
  return ret
 
print(word_numbers("23"))
