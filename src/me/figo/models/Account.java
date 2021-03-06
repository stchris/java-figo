package me.figo.models;

/***
 * Object representing one bank account of the user, independent of the exact account type
 * 
 * @author Stefan Richter <stefan.richter@figo.me>
 *
 */
public class Account {
  
	/***
	 * Internal figo Connect account ID
	 */
    private String account_id;
    
    /***
     * Internal figo Connect bank ID
     */
    private String bank_id;
    
    /***
     * Account name
     */
    private String name;
    
    /***
     * Account owner
     */
    private String owner;
    
    /***
     * This flag indicates whether the account will be automatically synchronized
     */
    private boolean auto_sync;
    
    /***
     * Account number
     */
    private String account_number;
    
    /***
     * Bank code
     */
    private String bank_code;
    
    /***
     * Bank name
     */
    private String bank_name;
    
    /***
     * Three-character currency code
     */
    private String currency;
    
    /***
     * IBAN
     */
    private String iban;
    
    /***
     * BIC
     */
    private String bic;
    
    /***
     * Account type: Giro account, Savings account, Credit card, Loan account, PayPal or Unknown
     */
    private String type;
    
    /***
     * Account icon URL
     */
    private String icon;
	
    public Account() {}

	/**
	 * Internal figo Connect account ID
	 */
	public String getAccountId() {
		return account_id;
	}

	/***
	 * Internal figo Connect bank ID
	 */
	public String getBankId() {
		return bank_id;
	}
	
	/***
	 * Account name
	 */
	public String getName() {
		return name;
	}
	
	/***
	 * Account owner
	 */
	public String getOwner() {
		return owner;
	}
	
	/***
	 * This flag indicates whether the account will be automatically synchronized
	 */
	public boolean isAutoSync() {
		return auto_sync;
	}
	
	/***
	 * Account number
	 */
	public String getAccountNumber() {
		return account_number;
	}
	
	/***
	 * Bank code
	 */
	public String getBankCode() {
		return bank_code;
	}
	
	/***
	 * Bank name
	 */
	public String getBankName() {
		return bank_name;
	}
	
	/***
	 * Three-character currency code
	 */
	public String getCurrency() {
		return currency;
	}
	
	/***
	 * IBAN
	 */
	public String getIBAN() {
		return iban;
	}
	
	/***
	 * BIC
	 */
	public String getBIC() {
		return bic;
	}
	
	/***
	 * Account type: Giro account, Savings account, Credit card, Loan account, PayPal or Unknown
	 */
	public String getType() {
		return type;
	}
	
	/***
	 * Account icon URL
	 */
	public String getIconUrl() {
		return icon;
	}
}
