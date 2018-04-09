package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class galeria_005faniversario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>Foco na Foto</title>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/owl.carousel/owl-carousel/owl.carousel.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"lib/fontawesome/css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/foconafoto.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/foconafoto-mobile.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<header>\n");
      out.write("\n");
      out.write("\t\t<div id=\"menu-mobile\" class=\"visible-xs\">\n");
      out.write("\n");
      out.write("\t\t\t<div>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn-close\"><i class=\"fa fa-close\"></i></button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container container-logo\">\n");
      out.write("\t\t\t<img id=\"logotipo\" src=\"img/logo.png\" alt=\"\">\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\n");
      out.write("\t\t\t<button id=\"btn-bars\" class=\"visible-xs\" type=\"button\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"row\">\n");
      out.write("\n");
      out.write("\t\t\t\t<nav id=\"menu\" class=\"pull-right\">\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"portfolio.jsp\">PORTFÓLIO</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"loja.jsp\">LOJA</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contato.jsp\">CONTATO</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("\t<main>\n");
      out.write("\n");
      out.write("\t\t<div class=\"titulo\">\n");
      out.write("\n");
      out.write("\t\t\t<h2>ANIVERSÁRIO</h2>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"content\">\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img1\"><img src=\"img/aniversario/1.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img2\"><img src=\"img/galeria/galeria_aniversario/2.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img3\"><img src=\"img/galeria/galeria_aniversario/3.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img4\"><img src=\"img/galeria/galeria_aniversario/4.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img5\"><img src=\"img/galeria/galeria_aniversario/5.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img6\"><img src=\"img/galeria/galeria_aniversario/6.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img7\"><img src=\"img/galeria/galeria_aniversario/7.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img8\"><img src=\"img/galeria/galeria_aniversario/8.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img9\"><img src=\"img/galeria/galeria_aniversario/9.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img10\"><img src=\"img/galeria/galeria_aniversario/10.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img11\"><img src=\"img/galeria/galeria_aniversario/11.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img12\"><img src=\"img/galeria/galeria_aniversario/12.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img13\"><img src=\"img/galeria/galeria_aniversario/13.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img14\"><img src=\"img/galeria/galeria_aniversario/14.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img15\"><img src=\"img/galeria/galeria_aniversario/15.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img16\"><img src=\"img/galeria/galeria_aniversario/16.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img17\"><img src=\"img/galeria/galeria_aniversario/17.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img18\"><img src=\"img/galeria/galeria_aniversario/18.jpg\" id=\"img\"></a>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img19\"><img src=\"img/galeria/galeria_aniversario/19.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"content-img-galeria\">\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#img20\"><img src=\"img/galeria/galeria_aniversario/20.jpg\" id=\"img\"></a>\t\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"lbox\" id=\"img1\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img20\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/1.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img2\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img2\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img1\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/2.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img3\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img3\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img2\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/3.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img4\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img4\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img3\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/4.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img5\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img5\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img4\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/5.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img6\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img6\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img5\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/6.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img7\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img7\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img6\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/7.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img8\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img8\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img7\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/8.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img9\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img9\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img8\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/9.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img10\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img10\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img9\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/10.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img11\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img11\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img10\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/11.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img12\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img12\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img11\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/12.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img13\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img13\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img12\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/13.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img14\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img14\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img13\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/14.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img15\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img15\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img14\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/15.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img16\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img16\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img15\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/16.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img17\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img17\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img16\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/17.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img18\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img18\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img17\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/18.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img19\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img19\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img18\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/19.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img20\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"lbox\" id=\"img20\">\n");
      out.write("\t\t\t<div class=\"box-img\">\n");
      out.write("\t\t\t\t<a href=\"#img19\" class=\"btn\" id=\"prev\">&#171;</a>\n");
      out.write("\t\t\t\t<a href=\"\" class=\"btn\" id=\"close\">X</a>\n");
      out.write("\t\t\t\t<img class= \"min-mobile\" src=\"img/galeria/galeria_aniversario/20.jpg\">\n");
      out.write("\t\t\t\t<a href=\"#img1\" class=\"btn\" id=\"next\">&#187;</a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"orcamento\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<button type=\"button\" >GOSTOU? PEÇA JÁ SEU ORÇAMENTO</button>\n");
      out.write("\n");
      out.write("\t\t\t<h3>?Fotografar é colocar na mesma linha a cabeça, o olho e o coração? - Henri Cartier-Bresson</h3>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t</main>\n");
      out.write("\n");
      out.write("\t<footer>\n");
      out.write("\n");
      out.write("\t\t<div id=\"rodape\">\n");
      out.write("\n");
      out.write("\t\t\t<ul id=\"lista_social\">\t\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/facebook.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/twitter.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/pinterest.png\"></a>\n");
      out.write("\t\t\t\t<a href=\"pagina.htm.\" target=\"_blank\"><img src=\"img/icones/instagram.png\"></a>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\t<script src=\"lib/jquery/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"lib/owl.carousel/owl-carousel/owl.carousel.min.js\"></script>\n");
      out.write("\t<script src=\"lib/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/efeitos.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
