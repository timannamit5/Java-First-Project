         function dis(val) 
         { 
             document.getElementById("answer").value+=val 
         } 
           
         function ans() 
         { 
             let x = document.getElementById("answer").value 
             let y = eval(x) 
             document.getElementById("answer").value = y 
         } 
           
         function clr() 
         { 
             document.getElementById("answer").value = "" 
         } 

      