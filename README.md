DETAILED DESCRIPTION ON HOW TO EXECUTE THE PROGRAM

1. Trifid Cipher (Encryption)
   - First we run the program
   - Enter a secret keyword
   - Enter the desired plaintext
   - See the encripted text
   
2. Columnar Transpotion (Encryption)
   - First we run the program
   - Write the desired plaintext
   - Write a keyword
   - Call the encrypt function
   - See the encripted text



DESCRIPTION OF ALGORITHMS
1. TRIFID CIPHER (Encryption)
   
    This algorithm implements the Trifid Cipher encryption technique in Java.
    The Trifid Cipher is a cryptographic technique that combines elements of substitution and transposition ciphers to encrypt messages.
    The key points provided are:
      1. Preparation of the alphabet for encryption, including a secret key provided by the user.
      2. Arranging the alphabet to create a random permutation of letters.
      3. Creation of a three-dimensional cube to represent the prepared alphabet for encryption.
      4. Retrieve the plaintext from the input.
      5. Identification of coordinates for each letter from the plaintext using the three-dimensional cube.
      6. Utilization of the found coordinates in the cube to encrypt the plaintext, based on the structure and logic of the Trifid Cipher.
      7. Display of the encrypted text for the user.

3. Columnar Transposition (Encryption)

   Columnar transposition is a technique used in cryptography to encrypt and decrypt messages. Here's a step-by-step explanation of how columnar transposition works:
     1. Chose a Keyword or Keyphrase: The first step is to choose a keyword or keyphrase that will be used to determine the order in which the columns are arranged. For              example, if the keyword is "CRYPTO", each letter of the keyword represents the order in which the columns will be arranged.
     2. Write the Message in Rows: Write the message to be encrypted in rows, typically left-to-right and top-to-bottom, filling up rows before starting a new one. If the            message doesn't fill up a row completely, fill the remaining spaces with placeholder characters, usually "X" or "Z".
     3. Arrange Columns According to Keyword: Write down the keyword above the rows, in alphabetical order. Each letter of the keyword represents a column.
     4. Rearrange Columns: Rearrange the columns of the message according to the alphabetical order of the keyword. This means if the keyword is "CRYPTO", the columns would          be arranged in the order of "C", "O", "P", "R", "T", "Y".
     5. Read the Encrypted Message: Read the rearranged columns from left to right and top to bottom to get the encrypted message.

4. Columnar Transposition (Decryption)
   
      Columnar transposition decryption is a process used to decrypt messages encrypted using the columnar transposition technique. Here's a step-by-step explanation of how        columnar transposition decryption works:
         1. Arrange Columns According to Keyword: To begin decryption, the columns of the ciphertext are arranged according to the alphabetical order of the keyword used                 during encryption. Each letter of the keyword represents the order in which the columns will be arranged.
         2. Inverse Rearrange Columns: After arranging the columns according to the keyword, the columns are inverse rearranged to their original order. This involves                    restoring the original positions of the columns based on the alphabetical order of the keyword.
         3. Read the Decrypted Message: Once the columns are rearranged to their original order, the decrypted message can be obtained by reading the columns from left to                right and top to bottom.
      Placeholder characters used during encryption (such as "X" or "Z") should be ignored during decryption.
       

EXAMPLES FROM EXCECUTION
1. Trifid Ciper (Encryption)

   <img width="796" alt="TrifidCipher" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/155022915/8a8ffe1c-1048-4e21-91ed-e1ce0c763a8b">

   
2. Columnar Transposition (Encryption)
   
   <img width="695" alt="image" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/8bfc2794-3cac-4e47-941b-e9b24bd835e4">
   
   Compare the outcome from the code with the outcome from a online encryption code
   
   <img width="793" alt="image" src="https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/95575593/5234c34f-05c8-4f1e-a6f1-d82d366630f4">
   

3. Columnar Transposition (Decryption)

![Screenshot 2024-04-21 020244](https://github.com/ErinaBlakiqi/Siguri-e-te-dhenave-Detyra-2/assets/121455234/e311984a-5f6e-4089-ba18-9eb853923e6c)


