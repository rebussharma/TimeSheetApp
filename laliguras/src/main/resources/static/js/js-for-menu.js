/**
 * Created by Asus on 6/7/2018.
 */
function loadPage(obj) {
    $.get('/'+obj.id, function (data) {
        $('#pageLoader').html(data);


    });

    // $( "#pageLoader" ).load( '/'+obj.id, function() {
    //     alert( "Load was performed." );
    // });
};

