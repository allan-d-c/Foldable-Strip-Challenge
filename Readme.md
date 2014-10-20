Introduction
============
This is an interview problem that a colleague ran into when applying to an unnamed company for a job. It looked like
an interesting challenge, given the hour time limit, so I took a shot.

Problem
=======
A set of instructions is given that consists of "left" and "right." For a number n of instructions, there is a strip of paper "2 to the n" spaces 
long. E.g., "LLR" applies to a strip of paper 8 spaces long. The spaces are numbered starting at 1. An instruction L or R means to fold the strip 
along its center in that direction. Thus a strip numbered up to 4 and folded left would have 4 on top of 1 and 3 on top of 2. Folded left again, 
you have 2 on top and 3-4-1 underneath. For any set of instructions, the program must provide the order of the numbers in the resulting stack.

You have exactly 60 minutes total to get as many test cases running as you can.

Notes
-----
This was a challenge. It was not a technical challenge. It was not a design challenge. It was a how fast can you type challenge. I consider
myself a pretty clean coder and fast enough (if pushed). This problem barely left me time for about four quick trips in the debugger and three
test cases. (I'm not even sure I got the third test case in time, because my daughter interrupted me for a few minutes in the middle of the
hour.)

I have not productized the code - it is more important that you see where I left off when I had to put my pencil down. Better code would
have unit tests with code coverage. It probably could have been abstracted better. I did not even go back to analyze the code for refactoring
opportunities.

I hope any company who does this to candidates in a timed, high pressure manner finds what they are looking for. (It is unlikely that they'll get developers who abstract well, who code for clarity, and who know how to produce an agile code base.)