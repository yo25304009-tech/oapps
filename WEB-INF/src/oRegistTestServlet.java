import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 登録処理用のサーブレット
 */
public class RegistTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // リクエストパラメータの文字コードを指定する（input.jspの文字コードと合わせる）
        req.setCharacterEncoding("utf-8");

        // リクエストパラメータを取得する
        String username = req.getParameter("name");  // ユーザー名を取得
        String password = req.getParameter("pass");  // パスワードを取得

        // リクエストにデータを登録する（結果のJSPにデータを渡すため）
        req.setAttribute("name", username);  // "name" という登録名でユーザー名を登録
        req.setAttribute("pass", password);  // "pass" という登録名でパスワードを登録

        // JSPのURLを指定する
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("registresult");  // 転送先のJSPのURLを指定

        // JSPにリクエストを転送する
        dispatcher.forward(req, res);
    }
}