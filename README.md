# Simple Web Application using Java

## Approach

**1. Use Excel Macro**

We can create an Excel VBA app , and consume apis from App B & App B
then consolidate this data to derive daily summary requirements

Benefits : 
- No hosting required
- Users can have their copy of macro

Drawbacks :
- not centralized , every update needs a new version of macro file.
- need to share a copy with everyone
- accounts credentials need be shared with everyone
- Lot of coding required to manipulate data 
- - limitations around machine compatibility (ex : MS Office support)


**2. Use a standalone desktop app**

Benefits : 
- No hosting required
- Users can have their copy

Drawbacks :
- not centralized , every update needs a new version of app exe/jar.
- need to share a copy of app with everyone
- accounts credentials need be shared with everyone
- limitations around machine compatibility (ex : Java runtime)

**3. Web Application** 

A simple web application that can take input from user and 
consume apis from App A & App B their consolidate the data

Benefits -
- Centralized
- No need to share account credentials
- Can be accessed by anyone
- Any change made to the tool is available to users automatically
- No hassle around machine / OS compatibility

Drawbacks -
- Ensuring availability 
 but this can be solved by using some cloud solutions.
 

