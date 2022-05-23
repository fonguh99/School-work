import re
text = input()
#your code goes here
#use re.findall() with r"#\w+" as the regex
match= re.findall(r"#\w+", text)
if match:
    print("\n".join(match))