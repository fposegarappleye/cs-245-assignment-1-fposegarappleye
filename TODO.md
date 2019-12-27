#TODO FILE

Download jazzy

Main file
  Calls to read the data
  Calls to process/read the data
  Calls to produce the data

Create a file reader
  First check if online, if so pull from there

Functional Figuring:
  Need a tree
  Need a trie

The root is completely null
The children characters map to other nodes
Seems like a node is added after a completed word to indicate it is a valid, complete word - a node has a character-to-node-map and indicators whether something is a valid end of word or not (existing as a separate(?) node or IsWord indicator after the final letter of the word)

#Main
  1. Create storage
  2. Read English.0 into storage
  3. Read input; produce output

#Storage
  - Insert(string): void
  - find(string):boolean(?)
  - suggest(string):String[]||List<String>||...

Finding the distance between two strings is called the hamming distance
