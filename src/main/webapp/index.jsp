<%@ page contentType="text/html;charset=Windows-1251" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="ui/button.css"/>
</head>
<body>

<form method=POST action=/controller id="form1"/>
<input type="hidden" name="radix" value="10"/>
<table>
    <tr>
        <input type=text name="vvodnay_stroka"/>
    </tr>
    <tr>
        <td><br> Ответ:
            <br>
            <input type=text name="" id="result"/></td>
    </tr>
    <tr>
        <button class="button" type="submit"> Рассчитать</button>
    </tr>
</table>
</form>


<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>

<script type="text/javascript">
    var form = $('#form1');
    form.submit(function () {
        $.ajax({
            type: form.attr('method'),
            url: form.attr('action'),
            data: form.serialize(),
            success: function (data) {
                var result = data;
                $('#result').attr("value", result);
            }
        });
        return false;
    });
</script>


</body>
</html>
