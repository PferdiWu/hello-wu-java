# Todo

Open the web application as depicted below. After entering your name in the left input and
submitting the form, the application will respond with `Hello NAME!`.

Please adjust the application in a way so it responds with the entered name in
reversed order for the right input. 

After entering a name in the form, the person should be greeted with his/her name
reversed, so e.g. entering `Dino` should result in `Hello Onid`, `Stefan` should
result in `Hello Nafets`, etc..

For reversing the name, probably existing builtin methods like `.reverse()` or anything 
similar might not be used. The reversed name should start with an uppercase letter as well.

After having made the adjustments, please commit your changes and push them to the cloned repository.

Hint: Put something like this in your SSH-Config:
```
Host github.com
    IdentityFile = ~/.ssh/id_rsa.pferdinand
```
In addition, any hints for improving the given code is highly appreciated.
Please write down your suggestions, e.g. in a new textfile in the repository. 


# Run script
`mvn spring-boot:run`

The application is available at `localhost:8080`
