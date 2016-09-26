import java.math.BigInteger;

/**
 * Created for easier RSA key storage in traditional mathematical terms.
 *
 * Created by Deniza on 8/10/2016.
 */
public class my_Key {
    BigInteger p,q,n,e,d;

    public my_Key(BigInteger p,BigInteger q,BigInteger n,BigInteger e,BigInteger d){
        this.p=p;
        this.q=q;
        this.n=n;
        this.e=e;
        this.d=d;
    }
}
