const ctx = document.querySelector(".ctx");
const info = document.querySelector(".card.info");
const login = document.querySelector(".card.login");
const submitbtn = login.querySelector("button");

function log(){
  info.style.display = "flex";
  login.style.display = "none";
}

submitbtn.addEventListener("click",log);

if(Android != null){
  // Android code goes here
  
}