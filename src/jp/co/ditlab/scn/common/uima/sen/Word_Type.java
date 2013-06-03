
/* First created by JCasGen Mon Feb 04 19:46:42 JST 2008 */
package jp.co.ditlab.scn.common.uima.sen;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** basic string from sen
 * Updated by JCasGen Mon Feb 04 20:02:02 JST 2008
 * @generated */
public class Word_Type extends Annotation_Type {
  /** @generated */
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Word_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Word_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Word(addr, Word_Type.this);
  			   Word_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Word(addr, Word_Type.this);
  	  }
    };
  /** @generated */
  public final static int typeIndexID = Word.typeIndexID;
  /** @generated 
     @modifiable */
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("jp.co.ditlab.scn.common.uima.sen.Word");
 
  /** @generated */
  final Feature casFeat_BasicString;
  /** @generated */
  final int     casFeatCode_BasicString;
  /** @generated */ 
  public String getBasicString(int addr) {
        if (featOkTst && casFeat_BasicString == null)
      jcas.throwFeatMissing("BasicString", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_BasicString);
  }
  /** @generated */    
  public void setBasicString(int addr, String v) {
        if (featOkTst && casFeat_BasicString == null)
      jcas.throwFeatMissing("BasicString", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_BasicString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_POS;
  /** @generated */
  final int     casFeatCode_POS;
  /** @generated */ 
  public String getPOS(int addr) {
        if (featOkTst && casFeat_POS == null)
      jcas.throwFeatMissing("POS", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_POS);
  }
  /** @generated */    
  public void setPOS(int addr, String v) {
        if (featOkTst && casFeat_POS == null)
      jcas.throwFeatMissing("POS", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_POS, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Reading;
  /** @generated */
  final int     casFeatCode_Reading;
  /** @generated */ 
  public String getReading(int addr) {
        if (featOkTst && casFeat_Reading == null)
      jcas.throwFeatMissing("Reading", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Reading);
  }
  /** @generated */    
  public void setReading(int addr, String v) {
        if (featOkTst && casFeat_Reading == null)
      jcas.throwFeatMissing("Reading", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_Reading, v);}
    
  
 
  /** @generated */
  final Feature casFeat_String;
  /** @generated */
  final int     casFeatCode_String;
  /** @generated */ 
  public String getString(int addr) {
        if (featOkTst && casFeat_String == null)
      jcas.throwFeatMissing("String", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_String);
  }
  /** @generated */    
  public void setString(int addr, String v) {
        if (featOkTst && casFeat_String == null)
      jcas.throwFeatMissing("String", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_String, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Cform;
  /** @generated */
  final int     casFeatCode_Cform;
  /** @generated */ 
  public String getCform(int addr) {
        if (featOkTst && casFeat_Cform == null)
      jcas.throwFeatMissing("Cform", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Cform);
  }
  /** @generated */    
  public void setCform(int addr, String v) {
        if (featOkTst && casFeat_Cform == null)
      jcas.throwFeatMissing("Cform", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_Cform, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Pronunciation;
  /** @generated */
  final int     casFeatCode_Pronunciation;
  /** @generated */ 
  public String getPronunciation(int addr) {
        if (featOkTst && casFeat_Pronunciation == null)
      jcas.throwFeatMissing("Pronunciation", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Pronunciation);
  }
  /** @generated */    
  public void setPronunciation(int addr, String v) {
        if (featOkTst && casFeat_Pronunciation == null)
      jcas.throwFeatMissing("Pronunciation", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_Pronunciation, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Length;
  /** @generated */
  final int     casFeatCode_Length;
  /** @generated */ 
  public int getLength(int addr) {
        if (featOkTst && casFeat_Length == null)
      jcas.throwFeatMissing("Length", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Length);
  }
  /** @generated */    
  public void setLength(int addr, int v) {
        if (featOkTst && casFeat_Length == null)
      jcas.throwFeatMissing("Length", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setIntValue(addr, casFeatCode_Length, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Surface;
  /** @generated */
  final int     casFeatCode_Surface;
  /** @generated */ 
  public String getSurface(int addr) {
        if (featOkTst && casFeat_Surface == null)
      jcas.throwFeatMissing("Surface", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Surface);
  }
  /** @generated */    
  public void setSurface(int addr, String v) {
        if (featOkTst && casFeat_Surface == null)
      jcas.throwFeatMissing("Surface", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_Surface, v);}
    
  
 
  /** @generated */
  final Feature casFeat_TermInfo;
  /** @generated */
  final int     casFeatCode_TermInfo;
  /** @generated */ 
  public String getTermInfo(int addr) {
        if (featOkTst && casFeat_TermInfo == null)
      jcas.throwFeatMissing("TermInfo", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_TermInfo);
  }
  /** @generated */    
  public void setTermInfo(int addr, String v) {
        if (featOkTst && casFeat_TermInfo == null)
      jcas.throwFeatMissing("TermInfo", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_TermInfo, v);}
    
  
 
  /** @generated */
  final Feature casFeat_POSDetail;
  /** @generated */
  final int     casFeatCode_POSDetail;
  /** @generated */ 
  public String getPOSDetail(int addr) {
        if (featOkTst && casFeat_POSDetail == null)
      jcas.throwFeatMissing("POSDetail", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getStringValue(addr, casFeatCode_POSDetail);
  }
  /** @generated */    
  public void setPOSDetail(int addr, String v) {
        if (featOkTst && casFeat_POSDetail == null)
      jcas.throwFeatMissing("POSDetail", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setStringValue(addr, casFeatCode_POSDetail, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Cost;
  /** @generated */
  final int     casFeatCode_Cost;
  /** @generated */ 
  public int getCost(int addr) {
        if (featOkTst && casFeat_Cost == null)
      jcas.throwFeatMissing("Cost", "jp.co.ditlab.scn.common.uima.sen.Word");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Cost);
  }
  /** @generated */    
  public void setCost(int addr, int v) {
        if (featOkTst && casFeat_Cost == null)
      jcas.throwFeatMissing("Cost", "jp.co.ditlab.scn.common.uima.sen.Word");
    ll_cas.ll_setIntValue(addr, casFeatCode_Cost, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Word_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_BasicString = jcas.getRequiredFeatureDE(casType, "BasicString", "uima.cas.String", featOkTst);
    casFeatCode_BasicString  = (null == casFeat_BasicString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_BasicString).getCode();

 
    casFeat_POS = jcas.getRequiredFeatureDE(casType, "POS", "uima.cas.String", featOkTst);
    casFeatCode_POS  = (null == casFeat_POS) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_POS).getCode();

 
    casFeat_Reading = jcas.getRequiredFeatureDE(casType, "Reading", "uima.cas.String", featOkTst);
    casFeatCode_Reading  = (null == casFeat_Reading) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Reading).getCode();

 
    casFeat_String = jcas.getRequiredFeatureDE(casType, "String", "uima.cas.String", featOkTst);
    casFeatCode_String  = (null == casFeat_String) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_String).getCode();

 
    casFeat_Cform = jcas.getRequiredFeatureDE(casType, "Cform", "uima.cas.String", featOkTst);
    casFeatCode_Cform  = (null == casFeat_Cform) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Cform).getCode();

 
    casFeat_Pronunciation = jcas.getRequiredFeatureDE(casType, "Pronunciation", "uima.cas.String", featOkTst);
    casFeatCode_Pronunciation  = (null == casFeat_Pronunciation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Pronunciation).getCode();

 
    casFeat_Length = jcas.getRequiredFeatureDE(casType, "Length", "uima.cas.Integer", featOkTst);
    casFeatCode_Length  = (null == casFeat_Length) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Length).getCode();

 
    casFeat_Surface = jcas.getRequiredFeatureDE(casType, "Surface", "uima.cas.String", featOkTst);
    casFeatCode_Surface  = (null == casFeat_Surface) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Surface).getCode();

 
    casFeat_TermInfo = jcas.getRequiredFeatureDE(casType, "TermInfo", "uima.cas.String", featOkTst);
    casFeatCode_TermInfo  = (null == casFeat_TermInfo) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TermInfo).getCode();

 
    casFeat_POSDetail = jcas.getRequiredFeatureDE(casType, "POSDetail", "uima.cas.String", featOkTst);
    casFeatCode_POSDetail  = (null == casFeat_POSDetail) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_POSDetail).getCode();

 
    casFeat_Cost = jcas.getRequiredFeatureDE(casType, "Cost", "uima.cas.Integer", featOkTst);
    casFeatCode_Cost  = (null == casFeat_Cost) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Cost).getCode();

  }
}



    