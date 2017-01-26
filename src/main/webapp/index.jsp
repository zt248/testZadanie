<%@ page contentType="text/html;charset=Windows-1251" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="ui/button.css"/>
    <link rel="stylesheet" href="ui/background.css"/>
    <title> Calculator </title>

</head>
<body>
<center><h1 > Калькулятор </h1></center>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>


<form name="form1" method=POST action=/controller id="form1"/>
<fieldset style="width:320px">
    <legend style="font-weight: bold">Выберите систему счисления для расчета выражения:</legend>
    <ul class="test">
    <input  type="radio" name="radix" value="2" required>
    Двоичная<br>
    <input type="radio" name="radix" value="10" required>
    Десятичная <br>
    <input type="radio" name="radix" value="16" required>
    Шестнадцатиричная<br>
    </ul>

</fieldset>

<br>

<table>
    <tr>
        Введите формулу: <br>
        <input type=text name="lineInFormula" placeholder="Поле для заполнения" required />
    </tr>
    <tr>
        <td>
            <br> Ответ:
            <br>
            <input type=text name="" id="result"/>
        </td>
    </tr>
    <tr>
        <button id="button" class="button" type="submit"> Рассчитать</button>
    </tr>
</table>
</form>

<script type="text/javascript" src="/ui/script.js"></script>


</body>
</html>


