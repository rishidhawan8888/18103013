<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<pre>
<script>
    
    var n = 8;
    
    if(n<3){
        document.write("Too small")
    }
    else if(n<=5){
        christmasTree(n);
        
        for(p=1; p<=2; p++)
        {
            for(q=0; q<(n*2-4)/2; q++)
            {
                document.write(" ")
            }
            for(q=0;q<=2;q++)
            {
            document.write("0");
            }
            document.write("<br>");
        }
    }
    else{
        christmasTree(n);
        tree(n);
        
    }
    
    function christmasTree(n) {
        for(x=1; x<=n; x++)
        { 
            for(y=x; y<n; y++)
            {
                document.write(" ");
            }
            for(y=1; y<=(2*x-1); y++)
            {
                if(x==1){
                    document.write("*");
                }
                else{
                document.write("0");
                }
            }
        
            document.write("<br>");
        }
    }

    function tree(n) {
        for(p=1; p<=3; p++)
        {
            for(q=0; q<=(n*2-5)/2; q++)
            {
                document.write(" ")
            }
            for(q=0;q<=2;q++)
            {
            document.write("0");
            }
            document.write("<br>");
        }
    }

</script>
</pre>
</body>
</html>