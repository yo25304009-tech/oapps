<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>ユーザー登録</title>
</head>
<body>
    <h1>ユーザー登録</h1>
    <!-- form要素のaction属性にリクエスト送信先を指定 -->
    <form method="post" action="./registtest">
        <!-- name属性でパラメータ名を指定 -->
        ユーザー名<input type="text" name="name"><br>
        <!-- 実際の開発ではtype="password"を使用してください -->
        パスワード<input type="text" name="pass"><br>
        <input type="submit" value="登録" />
    </form>
</body>
</html>