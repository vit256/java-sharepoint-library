
package com.microsoft.webservices.sharepoint.queryservice;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:12.345+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class QueryServiceSoap_QueryServiceSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://microsoft.com/webservices/SharePoint/QueryService", "QueryService");

    private QueryServiceSoap_QueryServiceSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = QueryService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        QueryService ss = new QueryService(wsdlURL, SERVICE_NAME);
        QueryServiceSoap port = ss.getQueryServiceSoap12();  
        
        {
        System.out.println("Invoking status...");
        java.lang.String _status__return = port.status();
        System.out.println("status.result=" + _status__return);


        }
        {
        System.out.println("Invoking registration...");
        java.lang.String _registration_registrationXml = "";
        java.lang.String _registration__return = port.registration(_registration_registrationXml);
        System.out.println("registration.result=" + _registration__return);


        }
        {
        System.out.println("Invoking queryEx...");
        java.lang.String _queryEx_queryXml = "";
        com.microsoft.webservices.sharepoint.queryservice.QueryExResponse.QueryExResult _queryEx__return = port.queryEx(_queryEx_queryXml);
        System.out.println("queryEx.result=" + _queryEx__return);


        }
        {
        System.out.println("Invoking query...");
        java.lang.String _query_queryXml = "";
        java.lang.String _query__return = port.query(_query_queryXml);
        System.out.println("query.result=" + _query__return);


        }

        System.exit(0);
    }

}