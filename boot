<!DOCTYPE html>
<html lang="en">
<head>
        
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport"
    content="width=device-width, initial-scale=1">
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
    .demo-content
    {
        padding: 15px;
        font-size: 18px;
        background: #00aeff;
        margin-bottom: 15px;
    }
    .demo-content.bg-alt
    {
        background: #abb1b8;
    }
    </style>
    <script>
    function validate()

{
    var a1=document.getElementById("inputUsername").value;
    var a2=document.getElementById("inputName").value;
    var a1=document.getElementById("inputEmail").value;
    var a1=document.getElementById("inputPassword").value;
    var a3=document.getElementById("inputCpassword").value;
    var a3=document.getElementById("input DOB").value;
    var a3=document.getElementById("input Phone Number").value;
    var a3=document.getElementById("input gender").value;
    
    
    
    if(a1.length<6)
    {
document.getElementById("result").innerHTML="invalid";
    }
    else{
       document.getElementById("result").innerHTML="valid";
    }
    

}
    </script>
    
    
</head>
<body style="background:url(bg123.jpg);">
    <center>
    <table cellpadding="5" cellspacing="5">
            <p><h1 align="center">REGISTER</h1> 
            <p><h2 align="center">please fill in this form to create an account</h2> 
            </p>
           
    <div class="container">
        <div class="bs-example">
                <form action="Register" method="post" onsubmit="validate()">

                        <div class="form-group row">
                                <label for="inputUsername" class="col-sm-2 col-form-label">Username</label>
                                <div class="col-sm-10">
                                    <input type="text" class="form-control" name="uname" placeholder="Username" required>
                                </div>
                            </div>

                            <div class="form-group row">
                                    <label for="inputName" class="col-sm-2 col-form-label">Name</label>
                                    <div class="col-sm-10">
                                        <input type="text" class="form-control" name="name" id="inputName" placeholder="Name" required >
                                    </div>
                            
                                </div>


                    <div class="form-group row">
                        <label for="inputEmail" class="col-sm-2 col-form-label">Email</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" name="email" id="inputEmail" placeholder="Email" required>
                        </div>
                    </div>

                    <div class="form-group row">
                        <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" name="pass" id="inputPassword" placeholder="Password" required>
                        </div>
                    </div>

                   
                        <div class="form-group row">
                                <label for="inputDOB" class="col-sm-2 col-form-label">DOB</label>
                                <div class="col-sm-10">
                                    <input type="date" class="form-control" name="dob" id="input DOB">
                                </div>
                            </div>

                            <div class="form-group row">
                                    <label for="input Phone Number" class="col-sm-2 col-form-label">Phone Number</label>
                                    <div class="col-sm-10">
                                        <input type="number" class="form-control" name="phno" id="input Phone Number" placeholder="Number" required>
                                    </div>
                                </div>

                          
                                </div>


                    <div class="form-group row">
                        <div class="col-sm-6 offset-sm-6">
                                <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
                            <button type="submit" class="btn btn-primary">Register</button>
                           
                            <button type="reset" class="btn btn-primary">Clear</button>
                        </div>
                    </div>
                    <div class="container signin">
                            <p>Already have an account? <a href="#">Sign in</a>.</p>
                          </div>

                    
                </form>
            </div>
        </center>
    </div>
</body>

</html>
