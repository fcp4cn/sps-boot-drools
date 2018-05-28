package sps;

import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SPSexec {
	private static final Logger log = LoggerFactory.getLogger(SPSexec.class);
	
	//sps 1 exec
    public static SPSfact testSP1(String appName) {
    	SPSfact f = new SPSfact();
    	f.getArgs().put(appName, appName);
    	
    	try {
    		log.info(appName + "---------drool start");
    		long ruleStart = System.currentTimeMillis();
        	
        	
        	KieSession kieSession = SPSutil.getKieContainer().newKieSession("mockupSP1Session");
    		kieSession.insert(f);
            int ruleFiredCount = kieSession.fireAllRules();
    		kieSession.dispose();
    		
    		log.info("total " + ruleFiredCount + " rules fired.");
    		long ruleEnd = System.currentTimeMillis();
    		log.info(appName + "---------drool time:" + (ruleEnd - ruleStart));
    	} catch (Exception e) {
    		f.setStatus(-1);
    		f.setMessage(e.getMessage());
    		
    		log.error(e.getMessage());
    		e.printStackTrace();
    	}
    	
    	return f;
    }    
    
	//sps 2 exec
    public static SPSfact testSP2(String appName) {
    	SPSfact f = new SPSfact();
    	f.getArgs().put(appName, appName);
    	
    	try {
    		log.info(appName + "---------drool start");
    		long ruleStart = System.currentTimeMillis();
        	
        	KieSession kieSession = SPSutil.getKieContainer().newKieSession("mockupSP2Session");
        	
    		kieSession.insert(f);
            int ruleFiredCount = kieSession.fireAllRules();
    		kieSession.dispose();
    		
    		log.info("total " + ruleFiredCount + " rules fired.");
    		long ruleEnd = System.currentTimeMillis();
    		log.info(appName + "---------drool time:" + (ruleEnd - ruleStart));
    	} catch (Exception e) {
    		f.setStatus(-1);
    		f.setMessage(e.getMessage());
    		
    		log.error(e.getMessage());
    		e.printStackTrace();
    	}
    	
    	return f;
    }
    
}
