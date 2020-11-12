<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<script>
var brackets = {
    "(": ")",
    "[": "]",
    "{": "}"
  }
var isValid = (x) => {
var s = [];
for (var i = 0; i < x.length; i++) {
    var j = x[i];
    if (brackets[j]) {
        s.push(brackets[j]);
    } else {
    if (j !== s.pop()) {
        return false;
    }
    }
}
return s.length === 0;
};

x = prompt("input string", "{({[)}}]")
document.write(isValid(x));

</script>
</body>
</html>
