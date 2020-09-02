# Running

Your implementation is correct when there's no failing test after running `mvn clean test`.

# Operation cost

After you're done try these to get a feel for computational cost.

You can *run the `main` method from IntelliJ and pass command-line arguments at the same time* like this: https://www.youtube.com/watch?v=kAAbdoq1to8

## Access cost

Description: `java Main <number of elements> access <index to access>`

```
java Main 100000 access 0
java Main 100000 access 1234
java Main 100000 access 99999
```

## Search cost

Description: `java Main <number of elements> search <number to search for>`

```
java Main 100000 search 0
java Main 100000 search 1234
java Main 100000 search 99999
```

## Insertion cost

Description: `java Main <number of elements> insert <index to insert at> <number to insert>`

```
java Main 100000 insert 0 42
java Main 100000 insert 1234 42
java Main 100000 insert 99999 42
```

## Deletion cost

Description: `java Main <number of elements> delete <index to delete at>`

```
java Main 100000 delete 0
java Main 100000 delete 1234
java Main 100000 delete 99999
```
