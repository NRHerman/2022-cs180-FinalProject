# Directory Structure
* `doc/`
    * Verbal Test Cases for the Behavior of our App
* `src/`
    * Source Code
    * Client-related classes
        * Client.java
            * Contains all the GUI logic, as well as Network I/O to server
    * Server-related classes
        * ThreadSpawner.java
            * Spawns the threads that listen to the clients
        * Server.java
            * The actual thread that listens to clients
            * implements Runnable
        * ServerFunctions.java
            * Contains functions for processing server data
        * CartFunctions.java
            * Contains functions for adding/removing items from customer carts
        * ClientFunctions.java
            * Contains functions for sending formatted data to the client
        * Product.java
            * Holds all the data related to our products
* `build/`
    * Build Artifacts

# Compilation
```sh
mkdir -p build
javac src/*.java -d build
```

# Executing our program
Spawning a server:
```sh
java -cp build ThreadSpawner
```

Running a client:
```sh
java -cp build Client
```

# Submission details
| **Task**     | **Submitter** |
| ------------ | ------------- |
| Report       |               |
| Vocareum     |               |
| Presentation |               |
