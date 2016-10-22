package XML_parser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "query")
public class Query {
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    private int count;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    private String created;
    @XmlAttribute(namespace = "http://www.yahooapis.com/v1/base.rng")
    private String lang;
    @XmlElement(name = "results")
    private Results results;

    Query() {}
    Query(int count, String created, String lang, Results results) {
        this.count = count;
        this.created = created;
        this.lang = lang;
        this.results = results;
    }

    @Override
    public String toString() {
        return "Query{" + " \n" +
                "   count=" + count + ", \n" +
                "   created='" + created + '\'' + ", \n" +
                "   lang='" + lang + '\'' + ", \n" +
                "   results=" + results + ", \n" +
                '}';
    }
}
