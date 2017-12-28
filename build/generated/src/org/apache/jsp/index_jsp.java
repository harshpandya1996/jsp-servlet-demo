package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Storage.Data;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         <section id=\"main-slider\" class=\"no-margin\">\n");
      out.write("        <div class=\"carousel slide wet-asphalt\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#main-slider\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"item active\" style=\"background-image: url(images/slider/bg1-1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content centered\">\n");
      out.write("                                    <h2 class=\"animation animated-item-1\">Powerful and Responsive Web Design</h2>\n");
      out.write("                                    <p class=\"animation animated-item-2\">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/slider/bg2-1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <div class=\"carousel-content center centered\">\n");
      out.write("                                    <h2 class=\"boxed animation animated-item-1\">Clean, Crisp, Powerful and Responsive Web Design</h2>\n");
      out.write("                                    <p class=\"boxed animation animated-item-2\">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("                                    <br>\n");
      out.write("                                    <a class=\"btn btn-md animation animated-item-3\" href=\"#\">Learn More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("                <div class=\"item\" style=\"background-image: url(images/slider/bg3-1.jpg)\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content centered\">\n");
      out.write("                                    <h2 class=\"animation animated-item-1\">Powerful and Responsive Web Design Theme</h2>\n");
      out.write("                                    <p class=\"animation animated-item-2\">Pellentesque habitant morbi tristique senectus et netus et malesuada fames</p>\n");
      out.write("                                    <a class=\"btn btn-md animation animated-item-3\" href=\"#\">Learn More</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 hidden-xs animation animated-item-4\">\n");
      out.write("                                <div class=\"centered\">\n");
      out.write("                                    <div class=\"embed-container\">\n");
      out.write("                                        <iframe src=\"//player.vimeo.com/video/69421653?title=0&amp;byline=0&amp;portrait=0&amp;color=a22c2f\" frameborder=\"0\" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.item-->\n");
      out.write("            </div><!--/.carousel-inner-->\n");
      out.write("        </div><!--/.carousel-->\n");
      out.write("        <a class=\"prev hidden-xs\" href=\"#main-slider\" data-slide=\"prev\">\n");
      out.write("            <i class=\"icon-angle-left\"></i>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"next hidden-xs\" href=\"#main-slider\" data-slide=\"next\">\n");
      out.write("            <i class=\"icon-angle-right\"></i>\n");
      out.write("        </a>\n");
      out.write("    </section><!--/#main-slider-->\n");
      out.write("\n");
      out.write("    <section id=\"services\" class=\"emerald\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                        <div class=\"pull-left\">\n");
      out.write("                            <i class=\"icon-twitter icon-md\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h3 class=\"media-heading\">Twitter Marketing</h3>\n");
      out.write("                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.col-md-4-->\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                        <div class=\"pull-left\">\n");
      out.write("                            <i class=\"icon-facebook icon-md\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h3 class=\"media-heading\">Facebook Marketing</h3>\n");
      out.write("                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.col-md-4-->\n");
      out.write("                <div class=\"col-md-4 col-sm-6\">\n");
      out.write("                    <div class=\"media\">\n");
      out.write("                        <div class=\"pull-left\">\n");
      out.write("                            <i class=\"icon-google-plus icon-md\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"media-body\">\n");
      out.write("                            <h3 class=\"media-heading\">Google Plus Marketing</h3>\n");
      out.write("                            <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--/.col-md-4-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section><!--/#services-->\n");
      out.write("\n");
      out.write("    <section id=\"recent-works\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <h3>Our Latest Project</h3>\n");
      out.write("                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("                    <div class=\"btn-group\">\n");
      out.write("                        <a class=\"btn btn-danger\" href=\"#scroller\" data-slide=\"prev\"><i class=\"icon-angle-left\"></i></a>\n");
      out.write("                        <a class=\"btn btn-danger\" href=\"#scroller\" data-slide=\"next\"><i class=\"icon-angle-right\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                    <p class=\"gap\"></p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\">\n");
      out.write("                    <div id=\"scroller\" class=\"carousel slide\">\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"item active\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item1.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Nova - Corporate site template\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>                            \n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item3.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Fornax - Apps site template\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>                            \n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item2.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Flat Theme - Business Theme\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><!--/.row-->\n");
      out.write("                            </div><!--/.item-->\n");
      out.write("                            <div class=\"item\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item2.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Flat Theme - Business Theme\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item1.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Nova - Corporate site template\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>                            \n");
      out.write("                                    <div class=\"col-xs-4\">\n");
      out.write("                                        <div class=\"portfolio-item\">\n");
      out.write("                                            <div class=\"item-inner\">\n");
      out.write("                                                <img class=\"img-responsive\" src=\"images/portfolio/recent/item3.png\" alt=\"\">\n");
      out.write("                                                <h5>\n");
      out.write("                                                    Fornax - Apps site template\n");
      out.write("                                                </h5>\n");
      out.write("                                                <div class=\"overlay\">\n");
      out.write("                                                    <a class=\"preview btn btn-danger\" title=\"Malesuada fames ac turpis egestas\" href=\"images/portfolio/full/item1.jpg\" rel=\"prettyPhoto\"><i class=\"icon-eye-open\"></i></a>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div><!--/.item-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--/.row-->\n");
      out.write("        </div>\n");
      out.write("    </section><!--/#recent-works-->\n");
      out.write("\n");
      out.write("    <section id=\"testimonial\" class=\"alizarin\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"center\">\n");
      out.write("                        <h2>What our clients say</h2>\n");
      out.write("                        <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"gap\"></div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <blockquote>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n");
      out.write("                                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n");
      out.write("                            </blockquote>\n");
      out.write("                            <blockquote>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n");
      out.write("                                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n");
      out.write("                            </blockquote>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <blockquote>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n");
      out.write("                                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n");
      out.write("                            </blockquote>\n");
      out.write("                            <blockquote>\n");
      out.write("                                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.</p>\n");
      out.write("                                <small>Someone famous in <cite title=\"Source Title\">Source Title</cite></small>\n");
      out.write("                            </blockquote>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section><!--/#testimonial-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.html", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            try
            {
                String message;
                
                message=session.getAttribute("Vr").toString();
                
                
                                       
                out.println("Welcome "+message);
            }
            catch(Exception e)
            {
                out.println(e);
            }
        
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
