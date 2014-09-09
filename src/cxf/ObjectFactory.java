
package cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCatByUserResponse_QNAME = new QName("http://cxf/", "getCatByUserResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://cxf/", "helloResponse");
    private final static QName _GetCatByUser_QNAME = new QName("http://cxf/", "getCatByUser");
    private final static QName _Hello_QNAME = new QName("http://cxf/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetCatByUserResponse }
     * 
     */
    public GetCatByUserResponse createGetCatByUserResponse() {
        return new GetCatByUserResponse();
    }

    /**
     * Create an instance of {@link GetCatByUser }
     * 
     */
    public GetCatByUser createGetCatByUser() {
        return new GetCatByUser();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "getCatByUserResponse")
    public JAXBElement<GetCatByUserResponse> createGetCatByUserResponse(GetCatByUserResponse value) {
        return new JAXBElement<GetCatByUserResponse>(_GetCatByUserResponse_QNAME, GetCatByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "getCatByUser")
    public JAXBElement<GetCatByUser> createGetCatByUser(GetCatByUser value) {
        return new JAXBElement<GetCatByUser>(_GetCatByUser_QNAME, GetCatByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
