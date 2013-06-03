

/* First created by JCasGen Mon Feb 04 19:46:42 JST 2008 */
package jp.co.ditlab.scn.common.uima.sen;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** basic string from sen
 * Updated by JCasGen Mon Feb 04 20:02:02 JST 2008
 * XML source: G:/My Documents/workspace/UIMASenWrapper/desc/aeDescriptor.xml
 * @generated */
public class Word extends Annotation {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(Word.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Word() {}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Word(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Word(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Word(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {}
     
 
    
  //*--------------*
  //* Feature: BasicString

  /** getter for BasicString - gets 
   * @generated */
  public String getBasicString() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_BasicString == null)
      jcasType.jcas.throwFeatMissing("BasicString", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_BasicString);}
    
  /** setter for BasicString - sets  
   * @generated */
  public void setBasicString(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_BasicString == null)
      jcasType.jcas.throwFeatMissing("BasicString", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_BasicString, v);}    
   
    
  //*--------------*
  //* Feature: POS

  /** getter for POS - gets 
   * @generated */
  public String getPOS() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_POS);}
    
  /** setter for POS - sets  
   * @generated */
  public void setPOS(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_POS == null)
      jcasType.jcas.throwFeatMissing("POS", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_POS, v);}    
   
    
  //*--------------*
  //* Feature: Reading

  /** getter for Reading - gets 
   * @generated */
  public String getReading() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Reading == null)
      jcasType.jcas.throwFeatMissing("Reading", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_Reading);}
    
  /** setter for Reading - sets  
   * @generated */
  public void setReading(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Reading == null)
      jcasType.jcas.throwFeatMissing("Reading", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_Reading, v);}    
   
    
  //*--------------*
  //* Feature: String

  /** getter for String - gets 
   * @generated */
  public String getString() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_String == null)
      jcasType.jcas.throwFeatMissing("String", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_String);}
    
  /** setter for String - sets  
   * @generated */
  public void setString(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_String == null)
      jcasType.jcas.throwFeatMissing("String", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_String, v);}    
   
    
  //*--------------*
  //* Feature: Cform

  /** getter for Cform - gets 
   * @generated */
  public String getCform() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Cform == null)
      jcasType.jcas.throwFeatMissing("Cform", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_Cform);}
    
  /** setter for Cform - sets  
   * @generated */
  public void setCform(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Cform == null)
      jcasType.jcas.throwFeatMissing("Cform", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_Cform, v);}    
   
    
  //*--------------*
  //* Feature: Pronunciation

  /** getter for Pronunciation - gets 
   * @generated */
  public String getPronunciation() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Pronunciation == null)
      jcasType.jcas.throwFeatMissing("Pronunciation", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_Pronunciation);}
    
  /** setter for Pronunciation - sets  
   * @generated */
  public void setPronunciation(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Pronunciation == null)
      jcasType.jcas.throwFeatMissing("Pronunciation", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_Pronunciation, v);}    
   
    
  //*--------------*
  //* Feature: Length

  /** getter for Length - gets 
   * @generated */
  public int getLength() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Length == null)
      jcasType.jcas.throwFeatMissing("Length", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Word_Type)jcasType).casFeatCode_Length);}
    
  /** setter for Length - sets  
   * @generated */
  public void setLength(int v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Length == null)
      jcasType.jcas.throwFeatMissing("Length", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setIntValue(addr, ((Word_Type)jcasType).casFeatCode_Length, v);}    
   
    
  //*--------------*
  //* Feature: Surface

  /** getter for Surface - gets 
   * @generated */
  public String getSurface() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Surface == null)
      jcasType.jcas.throwFeatMissing("Surface", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_Surface);}
    
  /** setter for Surface - sets  
   * @generated */
  public void setSurface(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Surface == null)
      jcasType.jcas.throwFeatMissing("Surface", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_Surface, v);}    
   
    
  //*--------------*
  //* Feature: TermInfo

  /** getter for TermInfo - gets 
   * @generated */
  public String getTermInfo() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_TermInfo == null)
      jcasType.jcas.throwFeatMissing("TermInfo", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_TermInfo);}
    
  /** setter for TermInfo - sets  
   * @generated */
  public void setTermInfo(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_TermInfo == null)
      jcasType.jcas.throwFeatMissing("TermInfo", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_TermInfo, v);}    
   
    
  //*--------------*
  //* Feature: POSDetail

  /** getter for POSDetail - gets 
   * @generated */
  public String getPOSDetail() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_POSDetail == null)
      jcasType.jcas.throwFeatMissing("POSDetail", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Word_Type)jcasType).casFeatCode_POSDetail);}
    
  /** setter for POSDetail - sets  
   * @generated */
  public void setPOSDetail(String v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_POSDetail == null)
      jcasType.jcas.throwFeatMissing("POSDetail", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setStringValue(addr, ((Word_Type)jcasType).casFeatCode_POSDetail, v);}    
   
    
  //*--------------*
  //* Feature: Cost

  /** getter for Cost - gets 
   * @generated */
  public int getCost() {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Cost == null)
      jcasType.jcas.throwFeatMissing("Cost", "jp.co.ditlab.scn.common.uima.sen.Word");
    return jcasType.ll_cas.ll_getIntValue(addr, ((Word_Type)jcasType).casFeatCode_Cost);}
    
  /** setter for Cost - sets  
   * @generated */
  public void setCost(int v) {
    if (Word_Type.featOkTst && ((Word_Type)jcasType).casFeat_Cost == null)
      jcasType.jcas.throwFeatMissing("Cost", "jp.co.ditlab.scn.common.uima.sen.Word");
    jcasType.ll_cas.ll_setIntValue(addr, ((Word_Type)jcasType).casFeatCode_Cost, v);}    
  }

    