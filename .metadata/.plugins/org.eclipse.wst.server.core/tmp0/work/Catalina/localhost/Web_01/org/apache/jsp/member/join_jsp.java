/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.70
 * Generated at: 2024-10-17 02:54:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/join.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"script/member.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<title>모던하우스 회원가입</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("      <form method=\"post\" name=\"frm\" action=\"ModernServlet\">\r\n");
      out.write("      	<input type=\"hidden\" name=\"command\" value=\"mdh_join\">\r\n");
      out.write("        <div class=\"join_box\">\r\n");
      out.write("            <div class=\"title_box\">회원가입</div>\r\n");
      out.write("            <p class=\"mand\">'*' 표시 항목은 필수 입력 항목입니다.</p>\r\n");
      out.write("            <div class=\"input_box\">\r\n");
      out.write("            	<input class=\"name_input\" type=\"text\" placeholder=\"이름 *\" name=\"username\">\r\n");
      out.write("                \r\n");
      out.write("                <div>\r\n");
      out.write("                	<input class=\"id_input\" type=\"text\" placeholder=\"아이디 *\" name=\"userid\">\r\n");
      out.write("                	<input type=\"hidden\" name=\"reid\" size=\"20\"> \r\n");
      out.write("                	<input class=\"idcheck_btn\" type=\"button\" value=\"중복 체크\" onclick=\"idCheck()\">\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <input class=\"pw_input\" type=\"password\" placeholder=\"비밀번호 *\" name=\"pwd\">\r\n");
      out.write("                <input class=\"pw_check_input\" type=\"password\" placeholder=\"비밀번호 확인 *\" name=\"pwd_check\">\r\n");
      out.write("                <input class=\"email_input\" type=\"text\" placeholder=\"이메일\" name=\"email\">\r\n");
      out.write("            	<input class=\"phone_input\" type=\"text\" placeholder=\"전화번호\" name=\"phone\">\r\n");
      out.write("            	<input class=\"address_input\" type=\"text\" placeholder=\"주소\" name=\"address\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"button_box\">\r\n");
      out.write("            	<input type=\"submit\" class=\"join_btn\" value=\"회원가입\" onclick=\"return joinCheck()\">\r\n");
      out.write("            	<input type=\"reset\" class=\"reset_btn\" value=\"취소\">\r\n");
      out.write("            	<input type=\"button\" class=\"home_btn\" value=\"홈으로\" onclick=\"location.href='ModernServlet?command=mdh_index'\">\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("      </form>\r\n");
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
