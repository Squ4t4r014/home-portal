import "jquery"
import "bootstrap-honoka"
import "bootstrap-honoka/dist/css/bootstrap.min.css"
import "./style.scss"

(function () {
    setInterval(function updateTime() {
        const now = new Date()
        const timeHour = String(now.getHours())
        const timeMinute = String(now.getMinutes())
        let timeColon
        if (document.getElementById("time-colon").innerText == "") {
            timeColon = ":"
        } else {
            timeColon = " "
        }
        document.getElementById("time-hour").innerText = timeHour
        document.getElementById("time-colon").innerText = timeColon
        document.getElementById("time-minute").innerText = timeMinute
    }, 1000)
})();