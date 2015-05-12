# Code Review Response

## prompt: [Print Consecutive numbers by comparing two parameters](http://codereview.stackexchange.com/q/90495)

## response:

I'd like to supplement [the answer given by 200_success](http://codereview.stackexchange.com/a/90502/32292) in saying that I think the printing should be done outside of the function, and that the function should return a value like an array or ArrayList. I suppose this really depends on your usage, but I prefer to keep functions that modify values apart from I/O. This makes it easier to test and also manipulate the format of your output with less risk of breaking your code.