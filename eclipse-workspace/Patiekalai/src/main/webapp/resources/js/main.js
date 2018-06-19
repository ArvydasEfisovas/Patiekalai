
var $animation_elements = $('.animation-element');
var $window = $(window);
var xhr = new XMLHttpRequest();


var $animation_elements = $('.animation-element');
var $window = $(window);




$('.scrollto1').click(function () {
    $('html, body').animate({
        scrollTop: $('#scrollto').offset().top
    },500);
})

$('.scrollto2').click(function () {
    $('html, body').animate({
        scrollTop: $('#scrollto').offset().top
    },500);
})
$('.scrollto3').click(function () {
    $('html, body').animate({
        scrollTop: $('#scrollto').offset().top
    },500);
})

$('#click').click(function () {
    $('html, body').animate({
        scrollTop: $('body').offset().top
    },500);
})







function check_if_in_view() {
    var window_height = $window.height();
    var window_top_position = $window.scrollTop();
    var window_bottom_position = (window_top_position + window_height);

    $.each($animation_elements, function() {
        var $element = $(this);
        var element_height = $element.outerHeight();
        var element_top_position = $element.offset().top;
        var element_bottom_position = (element_top_position + element_height);

        //check to see if this current container is within viewport
        if ((element_bottom_position >= window_top_position) &&
            (element_top_position <= window_bottom_position)) {
            $element.addClass('in-view');
        } else {
            $element.removeClass('in-view');
        }
    });
}

$window.on('scroll resize', check_if_in_view);
$window.trigger('scroll');

$('#Load').click(function () {

    xhr.onreadystatechange =function () {
        if(xhr.readyState === 4) {
            var mouses = JSON.parse(xhr.responseText);
            var p = document.getElementById('tekstas');
            p.innerHTML = mouses[0].tekstas;
        }

    };
    xhr.open('GET','duomenys/mouses.json');
    xhr.send();
    $('#Load').hide();
})


$('#Load1').click(function () {

    xhr.onreadystatechange =function () {
        if(xhr.readyState === 4) {
            var mouses = JSON.parse(xhr.responseText);
            var p1 = document.getElementById('tekstas1');
            p1.innerHTML = mouses[1].tekstas;
        }
    };
    xhr.open('GET','duomenys/mouses.json');
    xhr.send();
    $('#Load1').hide();
})


$('#Load2').click(function () {

    xhr.onreadystatechange =function () {
        if(xhr.readyState === 4) {
            var mouses = JSON.parse(xhr.responseText);
            var p2 = document.getElementById('tekstas2');
            p2.innerHTML = mouses[2].tekstas;
        }
    };
    xhr.open('GET','duomenys/mouses.json');
    xhr.send();
    $('#Load2').hide();
})






$('#setting').click(function () {

    $('.settings').slideToggle(700);
    $('.setting1').slideToggle(700);
})

