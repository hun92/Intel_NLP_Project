/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2023-11-22 01:06:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/rmsdn/Desktop/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/chatbot/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1700466090702L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("<title>챗봇</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"/resources/css/styles2.css\" rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	background-image: url('/resources/img/img1.PNG');\r\n");
      out.write("	background-repeat: no-repeat; /* 배경 이미지 반복 없음 */\r\n");
      out.write("	background-size: cover; /* 배경 이미지를 컨테이너에 맞게 확대 또는 축소 */\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".chat-container {\r\n");
      out.write("	max-width: 600px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".chat-header {\r\n");
      out.write("	background-color: #28a745;\r\n");
      out.write("	color: #ffffff;\r\n");
      out.write("	padding: 15px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	border-top-left-radius: 10px;\r\n");
      out.write("	border-top-right-radius: 10px;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".chat-body {\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-group {\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("label {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #495057;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control {\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary {\r\n");
      out.write("	background-color: #007bff;\r\n");
      out.write("	border-color: #007bff;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-message, .chatbot-message {\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	padding: 15px;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".user-message {\r\n");
      out.write("	background-color: #e2f9ff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".chatbot-message {\r\n");
      out.write("	background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".alimy-container {\r\n");
      out.write("	max-width: 600px;\r\n");
      out.write("	margin: auto;\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".alimy-container h2 {\r\n");
      out.write("	color: #28a745;\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".alimy-container p {\r\n");
      out.write("	font-size: 16px;\r\n");
      out.write("	color: #495057;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"chat-container\">\r\n");
      out.write("		<div class=\"chat-header\">\r\n");
      out.write("			<h1>\r\n");
      out.write("				<img src=\"/resources/img/img3.png\" width=\"50\" height=\"50\">올림픽 알리미\r\n");
      out.write("			</h1>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"chat-body\">\r\n");
      out.write("			<form action=\"/chat\" method=\"post\">\r\n");
      out.write("				<div class=\"form-group\">\r\n");
      out.write("					<label for=\"userInput\">사용자:</label> <input type=\"text\"\r\n");
      out.write("						id=\"userInput\" name=\"userInput\" class=\"form-control\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">전송</button>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"user-message\">\r\n");
      out.write("				<p>\r\n");
      out.write("					<strong>사용자:</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"chatbot-message\">\r\n");
      out.write("				<p>\r\n");
      out.write("					<strong>알리미:</strong> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${chatbot}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("				</p>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"alimy-container\">\r\n");
      out.write("			<h2>알리미 종목</h2>\r\n");
      out.write("			<p>근대5종, 브레이킹, 사이클BMX 프리스타일, 서핑, 수구, 스케이트 보드, 스포츠 클라이밍, 아티스틱 스위밍, 카누 스프린트, 카누 슬라럼\r\n");
      out.write("			, 트라이애슬론, 트램폴린, 축구, 펜싱, 사격, 양궁, 럭비(7인제), 경영, 골프, 체조, 농구, 다이빙, 레슬링, 배구, 배드민턴, 복싱</p>\r\n");
      out.write("			<a href=\"https://olympics.com/ko/sports/summer-olympics#paris-2024\"\r\n");
      out.write("				target=\"_blank\">공식홈페이지</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
