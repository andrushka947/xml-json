package XML_parser;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Arrays;

@XmlRootElement(name = "results")
public class Results {
    private Rate[] rate;

    Results () {}

    Results (Rate[] rate) {
        this.rate = rate;
    }

    public Rate[] getRate() {
        return rate;
    }

    @XmlElement(name = "rate")
    public void setRate(Rate[] rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Results{" + " \n" +
                "       rate=" + Arrays.deepToString(rate) +
                "       }";
    }
}
