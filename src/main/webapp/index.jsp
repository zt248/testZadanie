<%@ page contentType="text/html;charset=Windows-1251" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="ui/button.css"/>
</head>
<body>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>


<form method=POST action=/controller id="form1"/>
<fieldset style="width:270px">
    <legend style="font-weight: bold">�������� ������� ��������� ��� ������� ���������</legend>
    <input type="radio" name="radix" value="2">
    ��������<br>
    <input type="radio" name="radix" value="10">
    ����������<br>
    <input type="radio" name="radix" value="16">
    �����������������<br>
</fieldset>
<table>
    <tr>
        <input type=text name="vvodnay_stroka"/>
    </tr>
    <tr>
        <td>
            <br> �����:
            <br>
            <input type=text name="" id="result"/>
        </td>
    </tr>
    <tr>
        <button class="button" type="submit"> ����������</button>
    </tr>
</table>
</form>


<script type="text/javascript">
    var form = $('form');
    form.submit(function () {
        var formID = $(this).attr('id'); // ��������� ID �����
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
</script>


</body>
</html>
