<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>好きな食べ物は？</title>
</head>
<body>
    <h1>ユーザー名</h1>
    <!-- form要素のaction属性にリクエスト送信先を指定 -->
    <form method="post" action="./oregisttest">
        <!-- name属性でパラメータ名を指定 -->
        ユーザー名<input type="text" name="name"><br>
        <!-- -->
        食べ物<input type="text" name="food"><br>
        <input type="submit" value="登録" />
    </form>
</body>
</html>