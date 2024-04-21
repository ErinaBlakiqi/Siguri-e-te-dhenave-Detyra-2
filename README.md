DETAILED DESCRIPTION ON HOW TO EXECUTE THE PROGRAM

1. Trifid Cipher (Encryption)
   - First we run the program
   - Enter a secret keyword
   - Enter the desired plaintext
   - See the encripted text
2. Trifid Cipher (Decryption)
   - First we run the program
   - Enter a secret keyword
   - Enter the desired plaintext
   - See the encripted text
   
   
2. Columnar Transposition (Encryption)
   - First we run the program
   - Write the desired plaintext
   - Write a keyword
   - Call the encrypt function
   - Get the encrypted text
   - Call the decrypt function
   - See the Decrypted Text
  
3. Columnar Transposition (Decryption)
   - First we run the program
   - Write the ciphertext
   - Write the keyword
   - Call the decrypt function
   - See the decripted text



DESCRIPTION OF ALGORITHMS
1. TRIFID CIPHER (Encryption)
   
    This algorithm implements the Trifid Cipher encryption technique in Java.
    The Trifid Cipher is a cryptographic technique that combines elements of substitution and transposition ciphers to encrypt messages.
    The key points provided are:
      1. Preparation of the alphabet for encryption, including a secret key provided by the user.
      2. Arranging the remaining alphabet after the secret keyword.
      3. Creation of a three-dimensional cube to represent the prepared alphabet for encryption.
      4. Retrieve the plaintext from the input.
      5. Identification of coordinates for each letter from the plaintext using the three-dimensional cube.
      6. Utilization of the found coordinates in the cube to encrypt the plaintext, based on the structure and logic of the Trifid Cipher.
      7. Display of the encrypted text for the user.

2.  TRIFID CIPHER (Decryption)
 Decryption in the Trifid Cipher involves reversing the encryption process.
 The key points provided are:

    1.Input the Ciphertext and Keyword: First, the user needs to input the ciphertext and the secret keyword used for encryption.

    2.Preparation of the Alphabet: The same steps for preparing the alphabet are followed as in encryption. This involves combining the secret keyword with the remaining alphabet and appending a special character (in this case, '#').

    3.Creation of the Three-Dimensional Cube: A three-dimensional cube (or array) is created to represent the prepared alphabet for decryption.This cube will serve as the reference for finding the coordinates of letters.

    4.Retrieving Coordinates of Ciphertext Letters: Similar to encryption, the ciphertext is scanned to find the coordinates of each letter within the three-dimensional cube. 
  Each letter will have three coordinates (x, y, z) within the cube.
The coordinates of each letter in the ciphertext might not be in their original order due to the encryption process. These coordinates need to be shuffled back into the correct order before decryption can proceed.

     5.Shuffle the Coordinates (Reordering):The coordinates obtained from the ciphertext are likely shuffled compared to their original order during encryption. To decrypt the message, these coordinates must be rearranged into the correct order.
The shuffling of coordinates during encryption is a crucial aspect of the Trifid Cipher, adding complexity and making decryption without the correct key more challenging.

     6.Decrypting the Ciphertext: Once the coordinates of all letters in the ciphertext are found, the corresponding letters from the cube are retrieved based on these coordinates. This essentially reverses the encryption process, using the coordinates to retrieve the original letters.

     7.Displaying the Decrypted Text: Finally, present the decrypted text to the user for reading

4. Columnar Transposition (Encryption)

   Columnar transposition is a technique used in cryptography to encrypt and decrypt messages. Here's a step-by-step explanation of how columnar transposition works:
     1. Chose a Keyword or Keyphrase: The first step is to choose a keyword or keyphrase that will be used to determine the order in which the columns are arranged. For              example, if the keyword is "CRYPTO", each letter of the keyword represents the order in which the columns will be arranged.
     2. Write the Message in Rows: Write the message to be encrypted in rows, typically left-to-right and top-to-bottom, filling up rows before starting a new one. If the            message doesn't fill up a row completely, fill the remaining spaces with placeholder characters, usually "X" or "Z".
     3. Arrange Columns According to Keyword: Write down the keyword above the rows, in alphabetical order. Each letter of the keyword represents a column.
     4. Rearrange Columns: Rearrange the columns of the message according to the alphabetical order of the keyword. This means if the keyword is "CRYPTO", the columns would          be arranged in the order of "C", "O", "P", "R", "T", "Y".
     5. Read the Encrypted Message: Read the rearranged columns from left to right and top to bottom to get the encrypted message.

5. Columnar Transposition (Decryption)
   
      Columnar transposition decryption is a process used to decrypt messages encrypted using the columnar transposition technique. Here's a step-by-step explanation of how           columnar transposition decryption works:
      1. Arrange Columns According to Keyword: To begin decryption, the columns of the ciphertext are arranged according to the alphabetical order of the keyword used                 during encryption. Each letter of the keyword represents the order in which the columns will be arranged.
      2. Inverse Rearrange Columns: After arranging the columns according to the keyword, the columns are inverse rearranged to their original order. This involves                    restoring the original positions of the columns based on the alphabetical order of the keyword.
      3. Read the Decrypted Message: Once the columns are rearranged to their original order, the decrypted message can be obtained by reading the columns from left to                right and top to bottom.
      Placeholder characters used during encryption (such as "X" or "Z") should be ignored during decryption.
       

EXAMPLES FROM EXCECUTION
1. Trifid Ciper (Encryption)

 <img width="796" alt="trifidddddddd" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/155022915/09a1c032-9238-40d8-9310-42b2a4bb1a68">

 2. Trifid Ciper (Decryption)

     <img width="796" alt="trifidddddddd" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121411956/f60782f1-a7d7-4554-a5c4-6a25c5a4c7bd">

3. Columnar Transposition (Encryption)
   
   <img width="695" alt="image" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/8bfc2794-3cac-4e47-941b-e9b24bd835e4">
   
   Compare the outcome from the code with the outcome from a online encryption code
   
   <img width="793" alt="image" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/5234c34f-05c8-4f1e-a6f1-d82d366630f4">
   

4. Columnar Transposition (Decryption)

![Screenshot 2024-04-21 020244](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121455234/e311984a-5f6e-4089-ba18-9eb853923e6c)


