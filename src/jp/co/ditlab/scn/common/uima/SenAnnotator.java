package jp.co.ditlab.scn.common.uima;

import java.io.File;
import java.util.StringTokenizer;

import jp.co.ditlab.scn.common.uima.sen.Word;
import net.java.sen.StringTagger;
import net.java.sen.Token;

import org.apache.uima.analysis_engine.ResultSpecification;
import org.apache.uima.analysis_engine.annotator.AnnotatorConfigurationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorContext;
import org.apache.uima.analysis_engine.annotator.AnnotatorInitializationException;
import org.apache.uima.analysis_engine.annotator.AnnotatorProcessException;
import org.apache.uima.analysis_engine.annotator.JTextAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;

/**
 * Annotator class by Sen Morphological Analyzer written in Java. sen :
 * https://sen.dev.java.net/
 * 
 * @author Osamu Masutani, Denso IT Laboratory, Inc.
 * 
 */
public class SenAnnotator extends JTextAnnotator_ImplBase {

	/*
	 * Initializer that checks installation of sen.
	 * 
	 * @see
	 * org.apache.uima.analysis_engine.annotator.Annotator_ImplBase#initialize
	 * (org.apache.uima.analysis_engine.annotator.AnnotatorContext)
	 */
	public void initialize(AnnotatorContext context)
			throws AnnotatorInitializationException,
			AnnotatorConfigurationException {
		super.initialize(context);
		// get environment value
		String senhome = System.getProperty("SEN_HOME");
		if (senhome == null || senhome.isEmpty()) {
			System.out
					.println("SEN_HOME variable is not defined. Please set SEN_HOME your installation directory of sen.");
			throw new AnnotatorInitializationException();
		}
		if (!checkSen(senhome)) {
			throw new AnnotatorInitializationException();
		}
		System.setProperty("sen.home", senhome);
	}

	/*
	 * Process CAS by sen.
	 * 
	 * @see
	 * org.apache.uima.analysis_engine.annotator.JTextAnnotator#process(org.
	 * apache.uima.jcas.JCas,
	 * org.apache.uima.analysis_engine.ResultSpecification)
	 */
	public void process(JCas jcas, ResultSpecification rspec)
			throws AnnotatorProcessException {
		// get target document
		String document = jcas.getDocumentText();
		TOP top = jcas.getDocumentAnnotationFs();
		// 
		if (document == null) {
			System.out.println("Null document.");
			return;
		}
		// setup annotation set
		StringTagger sentagger = null;
		Token[] tokenlist = null;
		try {
			sentagger = StringTagger.getInstance();
			tokenlist = sentagger.analyze(document);
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (tokenlist != null) {
			for (int i = 0; i < tokenlist.length; i++) {
				// debug write
				if (false) {
					System.out.println(tokenlist[i].toString() + "\t("
							+ tokenlist[i].getBasicString() + ")" + "\t"
							+ tokenlist[i].getPos() + "("
							+ tokenlist[i].start() + "," + tokenlist[i].end()
							+ "," + tokenlist[i].length() + ")\t"
							+ tokenlist[i].getReading() + "\t"
							+ tokenlist[i].getPronunciation());
				}
				Word wordAnn = new Word(jcas);
				// Copy each attributes
				wordAnn.setBegin(tokenlist[i].start());
				wordAnn.setEnd(tokenlist[i].end());
				wordAnn.setString(tokenlist[i].toString());
				wordAnn.setLength(tokenlist[i].length());
				//
				wordAnn.setBasicString(tokenlist[i].getBasicString());
				wordAnn.setPronunciation(tokenlist[i].getPronunciation());
				wordAnn.setReading(tokenlist[i].getReading());
				wordAnn.setCform(tokenlist[i].getCform());
				wordAnn.setSurface(tokenlist[i].getSurface());
				wordAnn.setCost(tokenlist[i].getCost());
				// Copy POS(part of speech) in 2 styles (simple/detail)
				String pos = tokenlist[i].getPos();
				StringTokenizer tokenizer = new StringTokenizer(pos, "-");
				wordAnn.setPOS(tokenizer.nextToken());
				String posdetail = "";
				while (tokenizer.hasMoreTokens()) {
					posdetail += tokenizer.nextToken();
				}
				wordAnn.setPOSDetail(posdetail);
				// Add to index
				wordAnn.addToIndexes();
			}
		}
	}

	/**
	 * Check existence of sen library.
	 * 
	 * @param aSenHomeURL
	 * @return
	 */
	boolean checkSen(String aSenHomeURL) {
		File senDir = new File(aSenHomeURL);
		if (!senDir.exists()) {
			System.out
					.println("The directory specified for the sen install path doesn't exist.");
			return false;
		}
		if (!senDir.isDirectory()) {
			System.out
					.println("The path specified for the sen install path is not directory.");
			return false;
		}
		File senExe = new File(senDir.getPath() + "/bin/sen.bat");
		if (!senExe.exists()) {
			System.out
					.println("The path specified for the sen install path is not correct.");
			return false;
		}
		return true;
	}

}
