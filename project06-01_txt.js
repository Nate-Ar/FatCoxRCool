"use strict";
/*    JavaScript 7th Edition
      Chapter 6
      Project 06-01

      Project to validate a form used for setting up a new account
      Author: Nathan Arter
      Date:   11/28/22

      Filename: project06-01.js
*/
console.log("File is connectede")
document.getElementById("button").addEventListener("click",function () {
    const pw1 = document.getElementById("pwd").value
    const pw2 = document.getElementById("pwd2").value
    if (pw1 == pw2){
        alert("YOur PaSsWoRds MaTcH")
    }else {
        alert("YOur PaSsWoRds dO nOt MaTcH")
    }
})
