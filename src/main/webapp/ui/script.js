var form = $('form');
form.submit(function () {
    var formID = $(this).attr('id'); // Получение ID формы
    var formNm = $('#' + formID);
    $.ajax({
        type: form.attr('method'),
        url: form.attr('action'),
        data: formNm.serialize(),
        success: function (data) {
            var result = data;
            $('#result').attr("value", result);
        }
    });
    return false;
});
