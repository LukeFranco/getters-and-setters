class Main {
  public static void main(String[] args){
CreditCard card = new DeditCard();
  card.setName("Allan Grims");
  card.setCreditCardNumber("5555444433332222");
  card.setExpirationDate("12/24");
  card.setCVV("678");


 System.out.println(card.getName());
  System.out.println("Your card details:");
  System.out.println("Cardholder Name: " + card.getName());
  System.out.println("Card Number: " + card.getCreditCardNumber());
  System.out.println("Expiration Date: " + card.getExpirationDate());
  System.out.println("CVV: " + card.getCVV());
  }
}
