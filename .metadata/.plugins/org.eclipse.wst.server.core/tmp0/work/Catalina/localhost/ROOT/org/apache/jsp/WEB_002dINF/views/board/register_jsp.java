/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.96
 * Generated at: 2023-11-27 08:01:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/rmsdn/Desktop/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/lol_board/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/views/board/../includes/footer.jsp", Long.valueOf(1701071500343L));
    _jspx_dependants.put("/WEB-INF/views/board/../includes/header.jsp", Long.valueOf(1700794483597L));
    _jspx_dependants.put("jar:file:/C:/Users/rmsdn/Desktop/project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/lol_board/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("	content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("<title>SB Admin 2 - Tables</title>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom fonts for this template -->\r\n");
      out.write("<link href=\"/resources/vendor/fontawesome-free/css/all.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this template -->\r\n");
      out.write("<link href=\"/resources/css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Custom styles for this page -->\r\n");
      out.write("<link href=\"/resources/vendor/datatables/dataTables.bootstrap4.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("	<!-- Page Wrapper -->\r\n");
      out.write("	<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Sidebar -->\r\n");
      out.write("		<ul\r\n");
      out.write("			class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\"\r\n");
      out.write("			id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Sidebar - Brand -->\r\n");
      out.write("			<a\r\n");
      out.write("				class=\"sidebar-brand d-flex align-items-center justify-content-center\"\r\n");
      out.write("				href=\"index.html\">\r\n");
      out.write("				<div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("					<i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"sidebar-brand-text mx-3\">\r\n");
      out.write("					League of Legend\r\n");
      out.write("				</div>\r\n");
      out.write("			</a>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Dashboard -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">\r\n");
      out.write("					<i class=\"fas fa-fw fa-tachometer-alt\"></i> <span>Dashboard</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Heading -->\r\n");
      out.write("			<div class=\"sidebar-heading\">Interface</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"#\"\r\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#collapseTwo\"\r\n");
      out.write("				aria-expanded=\"true\" aria-controls=\"collapseTwo\"> <i\r\n");
      out.write("					class=\"fas fa-fw fa-cog\"></i> <span>Components</span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\"\r\n");
      out.write("					data-parent=\"#accordionSidebar\">\r\n");
      out.write("					<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("						<h6 class=\"collapse-header\">Custom Components:</h6>\r\n");
      out.write("						<a class=\"collapse-item\" href=\"buttons.html\">Buttons</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"cards.html\">Cards</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Utilities Collapse Menu -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"#\"\r\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\r\n");
      out.write("				aria-expanded=\"true\" aria-controls=\"collapseUtilities\"> <i\r\n");
      out.write("					class=\"fas fa-fw fa-wrench\"></i> <span>Utilities</span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<div id=\"collapseUtilities\" class=\"collapse\"\r\n");
      out.write("					aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("					<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("						<h6 class=\"collapse-header\">Custom Utilities:</h6>\r\n");
      out.write("						<a class=\"collapse-item\" href=\"utilities-color.html\">Colors</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"utilities-border.html\">Borders</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"utilities-animation.html\">Animations</a>\r\n");
      out.write("						<a class=\"collapse-item\" href=\"utilities-other.html\">Other</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Heading -->\r\n");
      out.write("			<div class=\"sidebar-heading\">Addons</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"#\"\r\n");
      out.write("				data-toggle=\"collapse\" data-target=\"#collapsePages\"\r\n");
      out.write("				aria-expanded=\"true\" aria-controls=\"collapsePages\"> <i\r\n");
      out.write("					class=\"fas fa-fw fa-folder\"></i> <span>Pages</span>\r\n");
      out.write("			</a>\r\n");
      out.write("				<div id=\"collapsePages\" class=\"collapse\"\r\n");
      out.write("					aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("					<div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("						<h6 class=\"collapse-header\">Login Screens:</h6>\r\n");
      out.write("						<a class=\"collapse-item\" href=\"login.html\">Login</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"register.html\">Register</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"forgot-password.html\">Forgot\r\n");
      out.write("							Password</a>\r\n");
      out.write("						<div class=\"collapse-divider\"></div>\r\n");
      out.write("						<h6 class=\"collapse-header\">Other Pages:</h6>\r\n");
      out.write("						<a class=\"collapse-item\" href=\"404.html\">404 Page</a> <a\r\n");
      out.write("							class=\"collapse-item\" href=\"blank.html\">Blank Page</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Charts -->\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link\" href=\"charts.html\">\r\n");
      out.write("					<i class=\"fas fa-fw fa-chart-area\"></i> <span>Charts</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nav Item - Tables -->\r\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("				href=\"tables.html\"> <i class=\"fas fa-fw fa-table\"></i> <span>Free Board</span></a>\r\n");
      out.write("			</li>\r\n");
      out.write("\r\n");
      out.write("			<!-- Divider -->\r\n");
      out.write("			<hr class=\"sidebar-divider d-none d-md-block\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("			<div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("				<button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("		<!-- End of Sidebar -->\r\n");
      out.write("\r\n");
      out.write("		<!-- Content Wrapper -->\r\n");
      out.write("		<!-- Main Content -->\r\n");
      out.write("		<div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("			<!-- Topbar -->\r\n");
      out.write("			<nav\r\n");
      out.write("				class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("				<!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("				<form class=\"form-inline\">\r\n");
      out.write("					<button id=\"sidebarToggleTop\"\r\n");
      out.write("						class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("						<i class=\"fa fa-bars\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("				<!-- Topbar Search -->\r\n");
      out.write("				<form\r\n");
      out.write("					class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("					<div class=\"input-group\">\r\n");
      out.write("						<input type=\"text\" class=\"form-control bg-light border-0 small\"\r\n");
      out.write("							placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("							aria-describedby=\"basic-addon2\">\r\n");
      out.write("						<div class=\"input-group-append\">\r\n");
      out.write("							<button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("								<i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("\r\n");
      out.write("				<!-- Topbar Navbar -->\r\n");
      out.write("				<ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("					<!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("					<li class=\"nav-item dropdown no-arrow d-sm-none\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\"\r\n");
      out.write("						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\"> <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("					</a> <!-- Dropdown - Messages -->\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\r\n");
      out.write("							aria-labelledby=\"searchDropdown\">\r\n");
      out.write("							<form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("								<div class=\"input-group\">\r\n");
      out.write("									<input type=\"text\" class=\"form-control bg-light border-0 small\"\r\n");
      out.write("										placeholder=\"Search for...\" aria-label=\"Search\"\r\n");
      out.write("										aria-describedby=\"basic-addon2\">\r\n");
      out.write("									<div class=\"input-group-append\">\r\n");
      out.write("										<button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("											<i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("										</button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</form>\r\n");
      out.write("						</div></li>\r\n");
      out.write("\r\n");
      out.write("					<!-- Nav Item - Alerts -->\r\n");
      out.write("					<li class=\"nav-item dropdown no-arrow mx-1\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\"\r\n");
      out.write("						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\"> <i class=\"fas fa-bell fa-fw\"></i> <!-- Counter - Alerts -->\r\n");
      out.write("							<span class=\"badge badge-danger badge-counter\">3+</span>\r\n");
      out.write("					</a> <!-- Dropdown - Alerts -->\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("							aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("							<h6 class=\"dropdown-header\">Alerts Center</h6>\r\n");
      out.write("							<a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"mr-3\">\r\n");
      out.write("									<div class=\"icon-circle bg-primary\">\r\n");
      out.write("										<i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("									<span class=\"font-weight-bold\">A new monthly report is\r\n");
      out.write("										ready to download!</span>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"mr-3\">\r\n");
      out.write("									<div class=\"icon-circle bg-success\">\r\n");
      out.write("										<i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("									$290.29 has been deposited into your account!\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"mr-3\">\r\n");
      out.write("									<div class=\"icon-circle bg-warning\">\r\n");
      out.write("										<i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("									Spending Alert: We've noticed unusually high spending for your\r\n");
      out.write("									account.\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item text-center small text-gray-500\"\r\n");
      out.write("								href=\"#\">Show All Alerts</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("\r\n");
      out.write("					<!-- Nav Item - Messages -->\r\n");
      out.write("					<li class=\"nav-item dropdown no-arrow mx-1\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\"\r\n");
      out.write("						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\"> <i class=\"fas fa-envelope fa-fw\"></i> <!-- Counter - Messages -->\r\n");
      out.write("							<span class=\"badge badge-danger badge-counter\">7</span>\r\n");
      out.write("					</a> <!-- Dropdown - Messages -->\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("							aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("							<h6 class=\"dropdown-header\">Message Center</h6>\r\n");
      out.write("							<a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("									<img class=\"rounded-circle\"\r\n");
      out.write("										src=\"/resources/img/undraw_profile_1.svg\" alt=\"...\">\r\n");
      out.write("									<div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"font-weight-bold\">\r\n");
      out.write("									<div class=\"text-truncate\">Hi there! I am wondering if\r\n");
      out.write("										you can help me with a problem I've been having.</div>\r\n");
      out.write("									<div class=\"small text-gray-500\">Emily Fowler Â· 58m</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("									<img class=\"rounded-circle\"\r\n");
      out.write("										src=\"/resources/img/undraw_profile_2.svg\" alt=\"...\">\r\n");
      out.write("									<div class=\"status-indicator\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"text-truncate\">I have the photos that you\r\n");
      out.write("										ordered last month, how would you like them sent to you?</div>\r\n");
      out.write("									<div class=\"small text-gray-500\">Jae Chun Â· 1d</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("									<img class=\"rounded-circle\"\r\n");
      out.write("										src=\"/resources/img/undraw_profile_3.svg\" alt=\"...\">\r\n");
      out.write("									<div class=\"status-indicator bg-warning\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"text-truncate\">Last month's report looks\r\n");
      out.write("										great, I am very happy with the progress so far, keep up the\r\n");
      out.write("										good work!</div>\r\n");
      out.write("									<div class=\"small text-gray-500\">Morgan Alvarez Â· 2d</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("								<div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("									<img class=\"rounded-circle\"\r\n");
      out.write("										src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"...\">\r\n");
      out.write("									<div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div>\r\n");
      out.write("									<div class=\"text-truncate\">Am I a good boy? The reason I\r\n");
      out.write("										ask is because someone told me that people say this to all\r\n");
      out.write("										dogs, even if they aren't good...</div>\r\n");
      out.write("									<div class=\"small text-gray-500\">Chicken the Dog Â· 2w</div>\r\n");
      out.write("								</div>\r\n");
      out.write("							</a> <a class=\"dropdown-item text-center small text-gray-500\"\r\n");
      out.write("								href=\"#\">Read More Messages</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("					<!-- Nav Item - User Information -->\r\n");
      out.write("					<li class=\"nav-item dropdown no-arrow\"><a\r\n");
      out.write("						class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\"\r\n");
      out.write("						role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("						aria-expanded=\"false\"> <span\r\n");
      out.write("							class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas\r\n");
      out.write("								McGee</span> <img class=\"img-profile rounded-circle\"\r\n");
      out.write("							src=\"/resources/img/undraw_profile.svg\">\r\n");
      out.write("					</a> <!-- Dropdown - User Information -->\r\n");
      out.write("						<div\r\n");
      out.write("							class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\r\n");
      out.write("							aria-labelledby=\"userDropdown\">\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"#\"> <i\r\n");
      out.write("								class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i> Profile\r\n");
      out.write("							</a> <a class=\"dropdown-item\" href=\"#\"> <i\r\n");
      out.write("								class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i> Settings\r\n");
      out.write("							</a> <a class=\"dropdown-item\" href=\"#\"> <i\r\n");
      out.write("								class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i> Activity\r\n");
      out.write("								Log\r\n");
      out.write("							</a>\r\n");
      out.write("							<div class=\"dropdown-divider\"></div>\r\n");
      out.write("							<a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\"\r\n");
      out.write("								data-target=\"#logoutModal\"> <i\r\n");
      out.write("								class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\r\n");
      out.write("								Logout\r\n");
      out.write("							</a>\r\n");
      out.write("						</div></li>\r\n");
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("			</nav>\r\n");
      out.write("			<!-- End of Topbar -->\r\n");
      out.write("			<div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("	<!-- Page Heading -->\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div class=\"col-lg-12\">\r\n");
      out.write("			<h1 class=\"h3 mb-2 text-gray-800\">Board Register</h1>\r\n");
      out.write("		</div>	\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- DataTales Example -->\r\n");
      out.write("	<div class=\"card shadow mb-4\">\r\n");
      out.write("		<div class=\"card-header py-3\">\r\n");
      out.write("			<h6 class=\"m-0 font-weight-bold text-primary\">Board Register</h6>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<div class=\"table-responsive\">\r\n");
      out.write("				<table class=\"table table-bordered\" id=\"dataTable\" width=\"100%\"\r\n");
      out.write("					cellspacing=\"0\">\r\n");
      out.write("					<div class=\"panel-body\">\r\n");
      out.write("						<form role=\"form\" action=\"/board/register\" method=\"post\">\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>Title</label><input class=\"form-control\" name=\"title\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>Text area</label>\r\n");
      out.write("								<textarea class=\"form-control\" rows=\"3\" name='content'></textarea>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"form-group\">\r\n");
      out.write("								<label>Writer</label><input class=\"form-control\" name=\"writer\">\r\n");
      out.write("							</div>\r\n");
      out.write("							<button type=\"submit\" class=\"btn btn-default\">Submit Button</button>\r\n");
      out.write("							<button type=\"reset\" class=\"btn btn-default\">Reset Button</button>\r\n");
      out.write("						</form>\r\n");
      out.write("					</div>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"sticky-footer bg-white\">\r\n");
      out.write("	<div class=\"container my-auto\">\r\n");
      out.write("		<div class=\"copyright text-center my-auto\">\r\n");
      out.write("			<span></span>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>\r\n");
      out.write("<!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("<!-- Scroll to Top Button-->\r\n");
      out.write("<a class=\"scroll-to-top rounded\" href=\"#page-top\"> <i\r\n");
      out.write("	class=\"fas fa-angle-up\"></i>\r\n");
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap core JavaScript-->\r\n");
      out.write("<script src=\"/resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Core plugin JavaScript-->\r\n");
      out.write("<script src=\"/resources/vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Custom scripts for all pages-->\r\n");
      out.write("<script src=\"/resources/js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- Page level plugins -->\r\n");
      out.write("<script src=\"/resources/vendor/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"/resources/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("<!-- Page level custom scripts -->\r\n");
      out.write("<script src=\"/resources/js/demo/datatables-demo.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("	$('#dataTables-example').DateTable({\r\n");
      out.write("		responsive: true\r\n");
      out.write("	});\r\n");
      out.write("	$(\".sidebar-nav\")\r\n");
      out.write("		.attr(\"class\",\"sidebar-nav navbar-collapse collapse\")\r\n");
      out.write("		.attr(\"aria-expanded\",\"false\")\r\n");
      out.write("		.attr(\"style\",\"height:1px\");\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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