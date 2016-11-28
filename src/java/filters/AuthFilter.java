/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = {"*.xhtml"})
public class AuthFilter implements Filter {

    public AuthFilter() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        try {

            // check whether session variable is set
            HttpServletRequest req = (HttpServletRequest) request;
            HttpServletResponse res = (HttpServletResponse) response;
            res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
            res.setHeader("Pragma", "no-cache"); // HTTP 1.0.
            res.setDateHeader("Expires", 0); // Proxies.
            HttpSession ses = req.getSession(false);
            //  allow user to proccede if url is login.xhtml or user logged in or user is accessing any page in //public folder
            String reqURI = req.getRequestURI();
            if (reqURI.indexOf("/allXhtml/index.xhtml") >= 0
                    || reqURI.indexOf("/login.xhtml") >= 0
                    
                    || reqURI.indexOf("/mastertamplate.xhtml") >= 0
                    || reqURI.indexOf("/new.xhtml") >= 0 
                    || reqURI.indexOf("/aboutUs.xhtml") >= 0 
                    || reqURI.indexOf("/ourCareer.xhtml") >= 0 
                    || reqURI.indexOf("/jobPost.xhtml") >= 0 
                    || reqURI.indexOf("/ourCarrer.xhtml") >= 0 
                    || reqURI.indexOf("/companyLogin.xhtml") >= 0
                    || reqURI.indexOf("/displayAllJobs.xhtml") >= 0 
                    || reqURI.indexOf("/displayITJobs.xhtml") >= 0
                    || reqURI.indexOf("/viewResume.xhtml") >= 0
                    || reqURI.indexOf("/emailWithAttachment.xhtml") >= 0
                    || reqURI.indexOf("/displayUser.xhtml") >= 0
                    || reqURI.indexOf("/apply.xhtml") >= 0
                    || reqURI.indexOf("/contactUs.xhtml") >= 0
                    || reqURI.indexOf("/displayJob.xhtml") >= 0
                    || reqURI.indexOf("/image.xhtml") >= 0
                    || reqURI.indexOf("/companyRegistration.xhtml") >= 0
                    || (ses != null && ses.getAttribute("username") != null)
                    || reqURI.indexOf("/public/") >= 0
                    || reqURI.contains("javax.faces.resource")) {
                chain.doFilter(request, response);
            } else // user didn't log in but asking for a page that is not allowed so take user to login page
            {
                res.sendRedirect(req.getContextPath() + "/login.xhtml");  // Anonymous user. Redirect to login page
            }
        } catch (Throwable t) {
            System.out.println(t.getMessage());
        }
    } //doFilter

    @Override
    public void destroy() {
    }
}
