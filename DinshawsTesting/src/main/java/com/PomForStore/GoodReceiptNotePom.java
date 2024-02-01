package com.PomForStore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import TestBase.Base;

public class GoodReceiptNotePom extends Base{

	
	
	@FindBy(xpath="((//span[@class='add-button-icon material-symbols-outlined fs-17'])[2 and text()='add'])[2]")
	WebElement CreateButton;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[3]")
	WebElement Tag1Drop;
	
	
	@FindBy(xpath="//span[text()=' GRN T1 ']")
	WebElement SelectTag1;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[4]")
	WebElement Tag2Drop;
	
	
	@FindBy(xpath="//span[text()=' GRN T2 ']")
	WebElement SelectTag2;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[10]")
	WebElement PoNoDrop;
	
	@FindBy(xpath="((//div[@class='igx-drop-down__list-scroll'])[16]//igx-select-item)[1]")
	WebElement SelectPo;
	
	@FindBy(xpath="//app-g-label[text()='GRN Info']")
	WebElement ClickOnGRNinfoTab;
	
	
	@FindBy(xpath="(//input[@type='text'])[12]")
	WebElement EnterTransporter;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	WebElement EnterChallenNo;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[8]")
	WebElement ChallenDate;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[23]")
	WebElement TarnsporterModeDrop;
	
	@FindBy(xpath="//span[text()=' Road ']")
	WebElement SelectTransporter;
	
	
	
	@FindBy(xpath="(//input[@type='text'])[15]")
	WebElement EnterLRRRAWRNo;
	
	@FindBy(xpath="(//input[@role='combobox'])[10]")
	WebElement EnterLRRRAWRDate;
	
	
	@FindBy(xpath="(//input[@type='text'])[16]")
	WebElement EnterInvoiceNo;
	
	@FindBy(xpath="(//input[@role='combobox'])[11]")
	WebElement 	EnterInvoiceDate;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement EnterInvoiceValue;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[31]")
	WebElement TreadNameDrop ;
	
	
	@FindBy(xpath="//span[text()=' Kareem - trade ']")
	WebElement SelectTradName;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[32]")
	WebElement CurrencyDrop;
	
	
	
	@FindBy(xpath="//span[text()=' INR ']")
	WebElement SelectCurrency;
	
	@FindBy(xpath="//app-g-label[text()='GRN Details']")
	WebElement  ClickOnGRNDetailsTab;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[12]")
	WebElement UpdateIcon;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[33]")
	WebElement BatchLotDrop;
	
	@FindBy(xpath="(//input[@type='text'])[28]")
	WebElement EnterBatchLot;
	
	
	
	@FindBy(xpath="//button[text()=' Add Batch ']")
	WebElement ClickOnAddBatchButton;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[33]")
	WebElement ReversDrop;
	
	
	@FindBy(xpath="(//input[@role='combobox'])[15]")
	WebElement EnterExpiryDate;
	
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement EnterInvoiceQuantity;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement ReceivedQuantity;
	
	
	@FindBy(xpath="(//input[@type='number'])[6]")
	WebElement  AcceptedQuantity ;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[7]")
	WebElement RejectedQuantity;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[35]")
	WebElement LocationDrop;
	
	
	
	@FindBy(xpath="//span[text()=' Akola ']")
	WebElement SelectLocation;
	
	
	
	@FindBy(xpath="(//input[@type='number'])[9]")
	WebElement EnterCovertionFactor;
	
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon ng-star-inserted'])[22]")
	WebElement RejectionReasonDrop;
	
	
	@FindBy(xpath="//span[text()=' Material Damaged ']")
	WebElement SelectRejectionReason;
	
	@FindBy(xpath="(//input[@type='text'])[23]")
	WebElement EnterRemark;
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[38]")
	WebElement HSNCodeDrop;
	
	
	
	@FindBy(xpath="(//span[@class='igx-checkbox__composite'])[1]")
	WebElement SelectHSNCode;
	
	
	@FindBy(xpath="(//igx-icon[@class='material-icons igx-icon'])[38]")
	WebElement  ReversHSNDrop;
	
	
	
	@FindBy(xpath="//app-g-label[text()='Addon Charges']")
	WebElement ClickOnAddOnChargesDrop;
	
	
	@FindBy(xpath="")
	WebElement A;
	
	
	
	@FindBy(xpath="")
	WebElement A;
	
	@FindBy(xpath="")
	WebElmenet A;
	
	
	
	@FindBy(xpath="")
	WebElement A;
	
	@FindBy(xpath="")
	WebElement A;
	
	
	
	@FindBy(xpath="")
	WebElement A;
	
	@FindBy(xpath="")
	WebElmenet A;
	
	
	
	
}
