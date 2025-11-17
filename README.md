```
                                                   ,gggg,
 ,dPYb,                                          ,88"""Y8b,                      ,dPYb,
 IP'`Yb                                         d8"     `Y8                      IP'`Yb
 I8  8I                                        d8'   8b  d8                      I8  8I
 I8  8bgg,                                    ,8I    "Y88P'                      I8  8'
 I8 dP" "8    ,gggg,gg   ,gggggg,    ,gggg,gg I8'            ,gggg,gg    ,gggg,  I8 dPgg,    ,ggg,
 I8d8bggP"   dP"  "Y8I   dP""""8I   dP"  "Y8I d8            dP"  "Y8I   dP"  "Yb I8dP" "8I  i8" "8i
 I8P' "Yb,  i8'    ,8I  ,8'    8I  i8'    ,8I Y8,          i8'    ,8I  i8'       I8P    I8  I8, ,8I
,d8    `Yb,,d8,   ,d8b,,dP     Y8,,d8,   ,d8b,`Yba,,_____,,d8,   ,d8b,,d8,_    _,d8     I8, `YbadP'
88P      Y8P"Y8888P"`Y88P      `Y8P"Y8888P"`Y8  `"Y8888888P"Y8888P"`Y8P""Y8888PP88P     `Y8888P"Y888

```

A simple cache implementation in Java.

## Project Overview

This project provides a basic cache implementation in Java. It includes an interface for a cache and a First-In, First-Out (FIFO) implementation.

## Features

*   `ICache` interface defining the basic cache operations (`put`, `get`, `remove`, `clear`, `getSize`, `containsKey`).
*   `FIFOCache` class implementing the `ICache` interface with a FIFO eviction policy.
*   A simple application to test the cache implementation.

## Project Structure

The project is structured as follows:

```
.
└─ README.md
└─ src
│   └─ App.java
│   └─ CacheImpl
│   │   └─ FIFOCache.java
│   └─ Interfaces
│       └─ ICache.java
└─ bin
```

*   `src`: Contains the Java source files.
*   `src/Interfaces`: Contains the cache interface.
*   `src/CacheImpl`: Contains the cache implementation.
*   `src/App.java`: The main application file.
*   `bin`: Will contain the compiled `.class` files.

## How to Compile and Run

1.  **Compile the source files:**

    ```bash
    javac -d bin -sourcepath src src/App.java src/Interfaces/ICache.java src/CacheImpl/FIFOCache.java
    ```

2.  **Run the application:**

    ```bash
    java -cp bin App
    ```
