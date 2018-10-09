
function setCookie(c_name, value, expiredays) {
    // document.cookie=document.cookie.match(/[^ =;]+(?=\=)/g)[0]+'=0;expires=' + new Date( 0).toUTCString() 清除cookie
    var exdate = new Date()
    // exdate.setDate(exdate.getDate() + expiredays)
    exdate.setTime(exdate.getTime()+expiredays * 24 * 60 * 60 * 1000)
    document.cookie = c_name + "=" + escape(value) ;
    document.cookie = ((expiredays == null) ? "" : "expires=" + exdate.toUTCString())
}

function getCookie(c_name) {
    var strCookie = document.cookie;
    var arrCookie = strCookie.split(";");
    for (var i = 0 ; i < arrCookie.length; i++) {
        var arr = arrCookie[i].split("=");
        if (arr[0] == c_name) {
            return arr[1];
        }
    }
    return "";
}

// function getCookie(c_name) {
//     debugger
//     if (document.cookie.length > 0) {
//         c_start = document.cookie.indexOf(c_name + "=")
//         if (c_start != -1) {
//             c_start = c_start + c_name.length + 1
//             // c_end = document.cookie.indexOf(";", c_start)
//             // if (c_end != -1) {
//                 c_end = document.cookie.length
//             // }
//             return unescape(document.cookie.substring(c_start, c_end))
//         }
//     }
//     return ""
// }

function checkCookie() {
    username = getCookie('user')
    if (username != null && username != "") {
        return true;
    } else {
        return false;
    }
}