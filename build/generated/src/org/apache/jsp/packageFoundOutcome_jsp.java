package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import za.ac.tut.entities.AutoDetailPackage;

public final class packageFoundOutcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\"  href=\"packStyle.css\">\n");
      out.write("        <title>Found packages  Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");

          List<AutoDetailPackage> packages=(List<AutoDetailPackage>)session.getAttribute("packages");
          Long packagesId;
          String servicesNames;
          Double carsPrices,mid_small_suvPrices,large_suv_truckPrices;
           int count=0;
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            \n");
      out.write("                 <table class=\"content-table\">\n");
      out.write("                     <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Number</td>\n");
      out.write("                     <td>service Name</td>\n");
      out.write("                     <td>normal cars price</td>\n");
      out.write("                     <td>mid or small suv/van price</td>\n");
      out.write("                      <td>large suv/van</td>\n");
      out.write("                     \n");
      out.write("                    </tr>\n");
      out.write("                     </thead>\n");
      out.write("                 ");

              for(int i=0;i < packages.size();i++){
                 AutoDetailPackage pakgs = packages.get(i);
                 packagesId=pakgs.getId();
                 servicesNames=pakgs.getServiceName();
                 carsPrices =pakgs.getNormal_cars_price();
                 mid_small_suvPrices=pakgs.getMid_small_suv_price();
                 large_suv_truckPrices =pakgs.getLarge_suv_or_truck_price();
                 count++;
                 
      out.write("\n");
      out.write("                     <tbody>\n");
      out.write("                         <tr>\n");
      out.write("                    <td>");
      out.print(count);
      out.write("</td>\n");
      out.write("                      <td>");
      out.print(servicesNames);
      out.write("</td>\n");
      out.write("                      <td><b>R");
      out.print(carsPrices);
      out.write("</b></td>\n");
      out.write("                       <td><b>R");
      out.print(mid_small_suvPrices);
      out.write("</b></td>\n");
      out.write("                        <td><b>R");
      out.print(large_suv_truckPrices);
      out.write("</b></td>\n");
      out.write("                         </tr>\n");
      out.write("                     </tbody>\n");
      out.write("                 \n");
      out.write("                 ");

              }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <p>\n");
      out.write("            Please  enter below the details of the package you want\n");
      out.write("        </p>\n");
      out.write("        <form action=\"ProcessServlet.do\" method=\"POST\">\n");
      out.write("                     <div>\n");
      out.write("                           <select name=\"packsName\" class=\"form-input\" required>\n");
      out.write("                               <option value=\"wash\">Wash and Vacs</option>\n");
      out.write("                               <option value=\"exterior\">exterior details</option>\n");
      out.write("                               <option value=\"interior\">interior details</option>\n");
      out.write("                               <option value=\"complete_ex_in\">Complete ex and in</option>\n");
      out.write("                               <option value=\"complete_Acrylic\">Acrylic Paint Sealant</option>\n");
      out.write("                              \n");
      out.write("                        </select>\n");
      out.write("                   </div>\n");
      out.write("                \n");
      out.write("                   <!--type of cars-->\n");
      out.write("                       <div>\n");
      out.write("                           <select name=\"carsTypes\" class=\"form-input\" required>\n");
      out.write("                               <option value=\"cars\">normal cars</option>\n");
      out.write("                               <option value=\"mid_small_suv_van\">small or mid suv/van</option>\n");
      out.write("                               <option value=\"large_suv_truc\">Large TRUCK/SUV/VAN</option>\n");
      out.write("                        </select>\n");
      out.write("                     </div>\n");
      out.write("                   \n");
      out.write("                   <tr>\n");
      out.write("                       <td></td>\n");
      out.write("                       <td><input class=\"form-input\" type=\"number\" name=\"quantity\" placeholder=\"cars quantity\"/></td>\n");
      out.write("                   </tr>\n");
      out.write("\n");
      out.write("                  <div>\n");
      out.write("                    \n");
      out.write("                  <input class=\"button\" type=\"submit\" value=\"submit\">\n");
      out.write("                </div>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        </div>\n");
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
