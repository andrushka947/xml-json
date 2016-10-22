package XML_parser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "rate")
public class Rate {
    @XmlAttribute
    private String id;
    @XmlElement
    private String Name;
    @XmlElement
    private double Rate;
    @XmlElement
    private String Date;
    @XmlElement
    private String Time;
    @XmlElement
    private String Ask;
    @XmlElement
    private String Bid;

    public Rate () {}

    public Rate(String id, String name, double rate, String date, String time, String ask, String bid) {
        this.id = id;
        this.Name = name;
        this.Rate = rate;
        this.Date = date;
        this.Time = time;
        this.Ask = ask;
        this.Bid = bid;
    }

    @Override
    public String toString() {
        return  "Rate{" + " \n" +
                "           id='" + id + '\'' + ", \n" +
                "           name='" + Name + '\'' + ", \n" +
                "           rate=" + Rate + ", \n" +
                "           date='" + Date + '\'' + ", \n" +
                "           time='" + Time + '\'' + ", \n" +
                "           ask='" + Ask + '\'' + ", \n" +
                "           bid='" + Bid + '\'' + ", \n" +
                "       }";
    }

}
