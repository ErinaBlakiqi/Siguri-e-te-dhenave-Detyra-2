# Cryptographic Techniques Implementation

This repository contains implementations of various cryptographic algorithms including the Trifid Cipher and Columnar Transposition, both in encryption and decryption forms.

## Table of Contents
- [1. Trifid Cipher](#1-trifid-cipher)
  - [Encryption](#encryption)
  - [Decryption](#decryption)
- [2. Columnar Transposition](#2-columnar-transposition)
  - [Encryption](#encryption-1)
  - [Decryption](#decryption-1)
- [Execution Examples](#execution-examples)

## 1. Trifid Cipher

### Encryption

The Trifid Cipher encryption process involves:
1. Running the program and entering a secret keyword.
2. Entering the plaintext that needs to be encrypted.
3. The program then displays the encrypted text.

### Decryption

The Trifid Cipher decryption reverses the encryption steps:
1. Input the encrypted text and the secret keyword.
2. Prepare the alphabet as in the encryption process.
3. Create the three-dimensional cube.
4. Retrieve and reorder the coordinates of each letter to decrypt.
5. Display the decrypted text.

## 2. Columnar Transposition

### Encryption

Steps to encrypt using Columnar Transposition:
1. Run the program and enter the plaintext.
2. Enter a keyword which determines the order of columns.
3. Encrypt the text by rearranging columns based on the keyword.
4. Display the encrypted text.

### Decryption

Decryption of Columnar Transposition involves:
1. Inputting the encrypted text and the keyword.
2. Rearranging the columns to their original order based on the keyword.
3. Reading the decrypted text from left to right.

# Description of Algorithms

## Trifid Cipher

### Encryption
The Trifid Cipher combines substitution and transposition ciphers to encrypt messages. The encryption process includes the following steps:
1. **Preparation of the Alphabet:** Start with a secret key provided by the user to prepare the alphabet.
2. **Arranging the Remaining Alphabet:** Place the remaining alphabet after the secret keyword.
3. **Creation of a Three-Dimensional Cube:** Use the prepared alphabet to create a three-dimensional cube.
4. **Retrieval of Plaintext:** Input the plaintext to be encrypted.
5. **Identification of Coordinates:** Find coordinates for each letter of the plaintext within the cube.
6. **Utilization of Coordinates:** Encrypt the plaintext using the identified coordinates based on the Trifid Cipher logic.
7. **Display Encrypted Text:** Show the encrypted text to the user.

### Decryption
Decryption reverses the encryption steps:
1. **Input Ciphertext and Keyword:** Users enter the ciphertext and the secret keyword.
2. **Preparation of the Alphabet:** Follow the same steps as in encryption, including adding a special character ('#').
3. **Creation of a Three-Dimensional Cube:** Create a cube to represent the alphabet for decryption.
4. **Retrieving Coordinates:** Locate the coordinates of each letter from the ciphertext within the cube.
5. **Shuffle the Coordinates:** Reorder the shuffled coordinates into their correct order.
6. **Decrypting the Ciphertext:** Use the coordinates to find the corresponding letters in the cube.
7. **Displaying the Decrypted Text:** Present the decrypted text.

## Columnar Transposition

### Encryption
Columnar Transposition is used to encrypt messages by rearranging columns of text:
1. **Choose a Keyword or Keyphrase:** Select a keyword that will dictate the column order.
2. **Write the Message in Rows:** Fill rows with the message, adding placeholder characters if necessary.
3. **Arrange Columns According to Keyword:** Place the keyword alphabetically above the rows, each letter representing a column.
4. **Rearrange Columns:** Sort the message columns according to the keyword's alphabetical order.
5. **Read the Encrypted Message:** Compile the encrypted message by reading the rearranged columns.

### Decryption
Decryption of messages using Columnar Transposition:
1. **Arrange Columns According to Keyword:** Sort the ciphertext columns according to the keyword used in encryption.
2. **Inverse Rearrange Columns:** Restore columns to their original order.
3. **Read the Decrypted Message:** Read the message from left to right, ignoring placeholders.

This comprehensive guide outlines the necessary steps to execute Trifid Cipher and Columnar Transposition ciphers both for encryption and decryption.


## Execution Examples

### Trifid Cipher

#### Encryption
![Trifid Cipher Encryption Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/155022915/09a1c032-9238-40d8-9310-42b2a4bb1a68)

#### Decryption
![Trifid Cipher Decryption Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121411956/f60782f1-a7d7-4554-a5c4-6a25c5a4c7bd)

### Trifid Cipher Execution Examples
#### Encrypt
![Encrypt Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121411956/cf9813b0-ab7d-47ed-9c77-c7ffd1c626b6)

#### Decrypt
![Decrypt Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121411956/89d100ba-0d7c-41e8-ba66-272f72651bd5)

### Columnar Transposition

#### Encryption
![Columnar Transposition Encryption Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/8bfc2794-3cac-4e47-941b-e9b24bd835e4)
![Comparison with Online Tool](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/5234c34f-05c8-4f1e-a6f1-d82d366630f4)

#### Decryption
![Columnar Transposition Decryption Example](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121455234/e311984a-5f6e-4089-ba18-9eb853923e6c)
