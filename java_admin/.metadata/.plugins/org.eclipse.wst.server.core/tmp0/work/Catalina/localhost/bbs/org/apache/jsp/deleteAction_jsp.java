/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-07-13 07:33:42 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bbs.BbsDAO;
import bbs.BbsDTO;

public final class deleteAction_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("bbs.BbsDAO");
    _jspx_imports_classes.add("bbs.BbsDTO");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("UTF-8");

      out.write(" \r\n");
      out.write("\r\n");
      bbs.BbsDTO BbsDTO = null;
      BbsDTO = (bbs.BbsDTO) _jspx_page_context.getAttribute("BbsDTO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (BbsDTO == null){
        BbsDTO = new bbs.BbsDTO();
        _jspx_page_context.setAttribute("BbsDTO", BbsDTO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write(' ');
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "userId", request.getParameter("userId"), request, "userId", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "subject", request.getParameter("subject"), request, "subject", false);
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("BbsDTO"), "content", request.getParameter("content"), request, "content", false);
      out.write("  \r\n");
      out.write("\r\n");

// 로그인 정보 => 세션 가져오기
String userId = null;
if(session.getAttribute("userId")!=null){ // 세션값이 비어있지 않으면 세션아이디 변수에 저장
	userId = (String)session.getAttribute("userId");  // 세션정보가져오기
}


if(userId == null) { // 1. 로그인이 안된경우

      out.write("	\r\n");
      out.write("	<script>\r\n");
      out.write("		alert(\"로그인하세요 \\n 회원만이 글을 쓸수 있습니다.\");\r\n");
      out.write("		location.href=\"./login.jsp\";\r\n");
      out.write("	</script>\r\n");

}
else {  // 1. 로그인 성공한 회원만 글을 쓸수있도록 제한 조건을 구현한다.
	    //     여기에 글번호 이후 모든 코딩 여기에 코딩한다.
		
		//2. 글 번호 유효성 검증
		int bbsId = 0; // 테스트
		if(request.getParameter("bbsId")!=null ){
			bbsId = Integer.parseInt(request.getParameter("bbsId")); // 글번호 가져오기
		}
		
		if(bbsId==0){  // 3. 삭제할 글번호가 없는경우
		
      out.write("\r\n");
      out.write("			<script>	\r\n");
      out.write("				alert(\"유효한 글이 아닙니다.\");\r\n");
      out.write("				location.href='./bbsListAction.jsp';\r\n");
      out.write("			</script>\r\n");
      out.write("		");
	
		}
		else{  // 3. 삭제할 글번호가 있는경우
			
			// 4. BbsDAO.getView(bbsId) 게시글 정보를 가져와서 
			//    삭제하고자하는 글번호와 작성자 일치 여부 확인
				BbsDTO bbsDTO = new BbsDAO().getView(bbsId);	
				if(bbsDTO==null){  // 리턴값이 null 인경우
					
      out.write("\r\n");
      out.write("					<script>\r\n");
      out.write("						alert(\"삭제할 데이터가 없습니다.\"); \r\n");
      out.write("						location.href='./bbsListAction.jsp';\r\n");
      out.write("					</script>\r\n");
      out.write("					");
		
				}
				else{ // 리턴값이 null 이 아닌경우  실제 삭제 번호가 존재하는 경우
					
					// 작성자와 글 데이터정보 비교  글번호==본인글번호 작성자 아이디 본인아이디
					if(!userId.equals(bbsDTO.getUserId())){ // 지금 삭제할 글번호의 작성자가 아니면
					
      out.write("\r\n");
      out.write("						<script>\r\n");
      out.write("							alert(\"삭제할 권한이 없습니다.\"); // 작성자 본인만이 삭제 가능하다.\r\n");
      out.write("							location.href='./bbsListAction.jsp';\r\n");
      out.write("						</script>\r\n");
      out.write("					");
		
					}
					else{ // 작성자 본인 글이면 그런 삭제를 할 수있다.
						
						// 4. 삭제 메서드에 삭제할 글번호를 전달하고 삭제 한다. 
						BbsDAO bbsDAO = new BbsDAO();
						int result = bbsDAO.delete(bbsId);
						
						if(result==-1){ // 데이터베이스 오류 (글 삭제 오류)
						
      out.write("\r\n");
      out.write("							<script>\r\n");
      out.write("								alert(\"글 삭제 실패했습니다.\");\r\n");
      out.write("								history.go(-1);\r\n");
      out.write("							</script>\r\n");
      out.write("						");
		
						}
						else{
						
      out.write("\r\n");
      out.write("							<script>\r\n");
      out.write("								alert(\"글 삭제 성공했습니다.\");\r\n");
      out.write("								location.href='./bbsListAction.jsp';\r\n");
      out.write("							</script>\r\n");
      out.write("						");
	
						}
					}
				} // 삭제할 글번호가 유효성이 있는 번호 조건
		} // 삭제할 글번호가 있는 경우의 조건 end		
}  // 로그인이 된경우 end

      out.write("	\r\n");
      out.write("\r\n");
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
