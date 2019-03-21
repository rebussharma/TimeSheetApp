/**
 * Created by Asus on 6/7/2018.
 */
$(document).ready(function () {
    $('#usertab').DataTable({
        "processing": true,
        "ajax": {
            "url": "/users",
            "type": "GET",
            "dataSrc": ""
        },
        "columns": [{
            "data": "name"
        }, {
            "data": "userName"
        }, {
            "data": "email"
        }, {
            "data": "phoneNumber"
        }, {
            "data": "address"
        }],
        dom: 'Bfrtip',
        buttons: [
            {
                extend: 'pdfHtml5',
                title: function () {
                    return "laliguras";
                },
                orientation: 'Portrait',
                pageSize: 'A1',
                titleAttr: 'PDF',
                label:"PDF"
            },
            {
                extend: 'print',
                titleAttr: 'PRINT'
            }
        ]
    });

    $("#addUser").submit(function(event) {

        //stop submit the form, we will post it manually.
        event.preventDefault();
        $("#acceptBtn").prop("disabled", false);
        fire_ajax_submit();
    });

    function fire_ajax_submit() {
        $.ajax({
            type: "POST",
            url: "/user",
            data: $("#addUser").serialize(),
            cache: false,
            success: function(result) {

alert("data added");
                // $('#form')[0].reset();


            },
            error: function(e) {
alert("error occur");
            }
        });
    }

})




