# **Graph Representation**

## Matrix Representation
Adjacency Matrix: 2D array containing weights on edges
- Row for each vertex
- Column for each vertex
- Entries contain weight of edge from row vertex to column vertex
- Entries contain ∞ (ie Integer'last) if no edge from row vertex to column vertex
- Entries contain 0 on diagonal (if self edges not allowed)

<br />

<img src="https://www.radford.edu/~nokie/classes/360/Diagrams/Graph2.png" width="200">

Example undirected graph (assume self-edges not allowed):
 	A	B	C	D
A	0	1	1	1
B	1	0	∞	1
C	1	∞	0	1
D	1	1	1	0

<img src="https://www.radford.edu/~nokie/classes/360/Diagrams/Graph3.png" width="200">

Example directed graph (assume self-edges allowed):
 	A	B	C	D
A	∞	1	1	1
B	∞	∞	∞	1
C	∞	∞	∞	∞
D	∞	∞	1	∞

<br />

- Space: Θ(V2)
- Time: 
To visit each node that is adjacent to node u: Θ(V)
To determine if node u is adjacent to node v: Θ(1)


## List Representation



