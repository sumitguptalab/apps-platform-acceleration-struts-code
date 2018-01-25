package org.superbiz.struts;

import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean filterStruts2RegistrationBean() {
        Collection<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setName("struts2");
        registrationBean.setOrder(1);
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean filterStrutsCleanupRegistrationBean() {
        Collection<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setName("struts-cleanup");
        registrationBean.setOrder(2);
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean filterSitemeshRegistrationBean() {
        Collection<String> urlPatterns = new ArrayList<String>();
        urlPatterns.add("/*");
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        StrutsPrepareAndExecuteFilter struts = new StrutsPrepareAndExecuteFilter();
        registrationBean.setFilter(struts);
        registrationBean.setName("sitemesh");
        registrationBean.setOrder(3);
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }
}
