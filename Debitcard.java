public class DebitCard{

  private String name;
  private String debitCardNumber;
  private String expirationDate;
  private String cvv;
 
  // SETTER FUNCTIONS
  public void setName(String name){
    this.name = name;
  }

  public void setCVV(String cvv){
    this.cvv = cvv;
  }

  public void setDebitCardNumber(String debitCardNumber){
    this.debitCardNumber = debitCardNumber;
  }

  public void setExpirationDate(String expirationDate){
    this.expirationDate = expirationDate;
  }
  

  // GETTER FUNCTIONS
  public String getName(){
    return name;
  }
  
  public String getDebitCardNumber(){
    return debitCardNumber;
  }

  public String getExpirationDate(){
    return expirationDate;
  }
