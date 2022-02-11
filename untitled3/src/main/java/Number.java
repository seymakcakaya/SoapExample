import com.baeldung.soap.ws.client.generated.NumberConversion;
import com.baeldung.soap.ws.client.generated.NumberConversionSoapType;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;

public class Number {
NumberConversion numberConversion;
NumberConversionSoapType numberConversionSoapType;
public Number(){
    try {
        URL url=new URL("https://www.dataaccess.com/webservicesserver/numberconversion.wso");
        numberConversion=new NumberConversion(url);
        numberConversionSoapType=numberConversion.getPort(NumberConversionSoapType.class);

    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
    public void numbertoWord( int number){
        System.out.println(number+" : "+ numberConversionSoapType.numberToWords(BigInteger.valueOf(number)));

    }
    public void numberToDollars(double number){
        System.out.println(number+" : "+ numberConversionSoapType.numberToDollars(BigDecimal.valueOf(number)));

    }

}
