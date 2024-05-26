//                          Constructor.
/*Question 1

In an organization there are several items are purchased.
Each Item has properties item number, item price and quantity
purchased. Use a parameterized constructor and initialize item
number, item price and quantity purchased of an item. The
function getValue() of the class calculates value of each
        item. The function displayValue() displays value of
an item. All definitions should be written in the class.
Write an object oriented program to find and display value
of two items.

public class item
{
    public int itemNo;
    public double itemPrice;
    public int quantityPurchased;

    public item(int itemNo,double itemPrice,int quantityPurchased)
    {
this.itemNo=itemNo;
this.itemPrice=itemPrice;
this.quantityPurchased=quantityPurchased;
    }

public double getValue()
{
    return itemPrice*quantityPurchased;
}

public static void main (String [] args)
{
    item i1=new item(001,100,10);
    item i2=new item(002,200,10);
    System.out.println("total price of item 1="+i1.getValue());
    System.out.println("total price of item 2="+i2.getValue());
}
}
 */

/*
Question 2

A Bank offers several credit cards for their customers. Each
card has card number, loan amount and interest rate(annual).
 Write an object-oriented program to perform following.

i. Set data for card number, loan amount and interest
 rate(annual) of two credit cards using constructor.
ii. Calculate interest amount(annual) of each credit card.
public class item
{
    public int cardNo;
    public double loanAmount;
    public double rate;

    public item(int cardNo,double loanAmount,double rate)
    {
        this.cardNo=cardNo;
        this.loanAmount=loanAmount;
        this.rate=rate;
    }

    public double calculate_interestAmount()
    {
        return loanAmount*rate;
    }

    public static void main(String [] args)
    {
        item c1=new item(001,1000,0.05);
        item c2=new item(002,2000,0.10);
        System.out.println("interest amount of card 1="+c1.calculate_interestAmount());
        System.out.println("interest amount of card 2="+c2.calculate_interestAmount());
    }
}
 */
