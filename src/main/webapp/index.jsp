<%@ page contentType="text/html;charset=Windows-1251" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="ui/button.css"/>
    <link rel="stylesheet" href="ui/background.css"/>
    <title> Calculator </title>

    <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <link rel="stylesheet" href="/resources/demos/style.css">

</head>
<body>
<center><h1> Калькулятор </h1></center>


<form name="form1" method=POST action=/controller id="form1"/>
<fieldset style="width:320px">
    <legend style="font-weight: bold">Выберите систему счисления для расчета выражения:</legend>
    <ul>
        <input type="radio" name="radix" value="2" required>
        Двоичная<br>
        <input type="radio" name="radix" value="10" >
        Десятичная <br>
        <input type="radio" name="radix" value="16" >
        Шестнадцатиричная<br>
    </ul>
</fieldset>

<br>

<table>
    <tr>
        <td> Введите уравнение: <br>
            <input type=text name="lineInFormula" placeholder="Поле для заполнения" required/>
        </td>
    </tr>
    <tr>
        <td>
            <button id="button" class="button" type="submit"> Рассчитать</button>
        </td>
    </tr>

</table>
</form>

<br> Ответ:
<br>
<input type=text name="" id="result"/>

<div id="dialog" title="">
    <p>Неверный формат ввода уравнеия.</p>
</div>
</body>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script type="text/javascript" src="/ui/script.js"></script>
</html>


