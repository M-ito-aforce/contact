<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@include file="../header.html" %>
<form action ="contact" method="post">
<p>氏名</p>
<input type ="text" name="user" required>
<p>会社</p>
<input type ="text" name="company" >
<p>メールアドレス</p>
<input type ="text" name="email" required>
<p>お問い合わせ内容</p>
 <textarea name="contact" rows="4" cols="40" required></textarea>
<p>メルマガ種類</p>
<input type ="checkbox" name="option" value ="総合案内">総合案内
<input type ="checkbox" name="option" value ="セミナー案内">セミナー案内
<input type ="checkbox" name="option" value ="求人採用案内">求人採用案内<br>
<p>資料をご希望ですか？</p>
<input type ="radio" name="document" value ="Yes">Yes<br>
<input type ="radio" name="document" value ="No">No<br>
 <input type="submit" value="送信" >
</form>
<%@include file="../footer.html" %>