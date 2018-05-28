package sps;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import org.kie.api.runtime.KieContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.DataSourceUtils;

public class SPSutil {
	//for log
	private static final Logger log = LoggerFactory.getLogger(SPSutil.class);
	
	public static Logger getLog() {return log;}
	
	//for mysql
	private static DataSource my;

	public static DataSource getDataSource() {
		return SPSutil.my;
	}

	public static void setDataSource(DataSource dataSource) {
		SPSutil.my = dataSource;
	}
	
    public static Connection getConnection() throws SQLException {
        return DataSourceUtils.getConnection(my);
    }
    
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
        }
    }    
    
    //for Drools
    private static KieContainer kieContainer;

    public static KieContainer getKieContainer() {
        return SPSutil.kieContainer;
    }

    public static void setKieContainer(KieContainer kieContainer) {
    	SPSutil.kieContainer = kieContainer;
    }    
}
