<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  </head>
  <style>
    .nav-color{
        background-color: rgb(147, 202, 224);
    }
    .bg-colour{
        background-color: rgb(131, 186, 207);
    }
        
  </style>
  <body>
    
      <nav class="navbar nav-color">
        <div class="container-fluid">
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarToggleExternalContent" aria-controls="navbarToggleExternalContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <h2 class="z-index-1 position-absolute ms-3">Home</h2>
         
        </div>
    </nav>
        <div class="collapse" id="navbarToggleExternalContent">
            <div class="bg-colour p-2">
              <div class="text-black ms-3"  >Home</div>
              <div class="text-black ms-3">Developer</div>
              <div class="text-black ms-3">HR</div>
              <div class="text-black ms-3">Manager</div>
              <div class="text-black ms-3">About Us</div>
              <div class="text-black ms-3">Contact Us</div>
            </div>
          </div>
      
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
  </body>
</html>