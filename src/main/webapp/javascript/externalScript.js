function changeImage() {
    var lightbulbImage = document.getElementById("lightbulb");
    if (lightbulbImage.src.match("bulboff")) {
        lightbulbImage.src = "images/pic_bulbon.gif";
    } else {
        lightbulbImage.src = "images/pic_bulboff.gif";
    }
}
