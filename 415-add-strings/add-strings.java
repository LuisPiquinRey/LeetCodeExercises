import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        BigInteger big1=new BigInteger(num1);
        BigInteger big2=new BigInteger(num2);
        return String.valueOf(big1.add(big2));
    }
}