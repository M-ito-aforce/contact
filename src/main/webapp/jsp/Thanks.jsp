<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/header.html" %>

<p>この度は資料請求いただきありがとうございます。</p>
<p>以下のリンクから資料ダウンロードが可能です。</p>

<h3>入力内容</h3>
<p>氏名：<%= request.getAttribute("user") %></p>
<p>会社：<%= request.getAttribute("company") %></p>
<p>メール：<%= request.getAttribute("email") %></p>
<p>問い合わせ内容：<%= request.getAttribute("contact") %></p>

<p>選択オプション：
<%
  String[] options = (String[])request.getAttribute("options");
  if (options != null) {
    for (String opt : options) {
      out.print(opt + " ");
    }
  }
%>
</p>

<%@ include file="/footer.html" %>
