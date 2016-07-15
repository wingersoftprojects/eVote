/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: bajuna
 * License Type: Purchased
 */
package entities;

import org.orm.*;
import org.orm.cfg.JDBCConnectionSetting;
import org.hibernate.*;
import java.util.Properties;
import org.hibernate.cfg.*;

public class EVotingPersistentManager extends PersistentManager {
	private static final String PROJECT_NAME = "EVote";
	private static PersistentManager _instance = null;
	private static SessionType _sessionType = SessionType.THREAD_BASE;
	private static int _timeToAlive = 60000;
	private static JDBCConnectionSetting _connectionSetting = null;
	private static Properties _extraProperties = null;
	private static String _configurationFile = null;
	
	private EVotingPersistentManager() throws PersistentException {
		super(_connectionSetting, _sessionType, _timeToAlive, new String[] {}, _extraProperties, _configurationFile);
		setFlushMode(FlushMode.ALWAYS);
	}
	
	@Override
	public Configuration createConfiguration() {
		Configuration configuration = new Configuration();
		configuration.addAnnotatedClass(entities.Group_detail.class);
		configuration.addAnnotatedClass(entities.User_detail.class);
		configuration.addAnnotatedClass(entities.Group_right.class);
		configuration.addAnnotatedClass(entities.Vote.class);
		configuration.addAnnotatedClass(entities.Candidate.class);
		configuration.addAnnotatedClass(entities.Post.class);
		configuration.addAnnotatedClass(entities.Country.class);
		configuration.addAnnotatedClass(entities.District.class);
		configuration.addAnnotatedClass(entities.Polling_station.class);
		configuration.addAnnotatedClass(entities.Voter.class);
		configuration.addAnnotatedClass(entities.Division.class);
		configuration.addAnnotatedClass(entities.County.class);
		configuration.addAnnotatedClass(entities.Sub_county.class);
		configuration.addAnnotatedClass(entities.Parish.class);
		configuration.addAnnotatedClass(entities.Finger_print.class);
		configuration.addAnnotatedClass(entities.Group_user.class);
		configuration.buildMappings();
		return configuration;
	}
	
	public String getProjectName() {
		return PROJECT_NAME;
	}
	
	public static synchronized final PersistentManager instance() throws PersistentException {
		if (_instance == null) {
			_instance = new EVotingPersistentManager();
		}
		
		return _instance;
	}
	
	public void disposePersistentManager() throws PersistentException {
		_instance = null;
		super.disposePersistentManager();
	}
	
	public static void setSessionType(SessionType sessionType) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session type after create PersistentManager instance");
		}
		else {
			_sessionType = sessionType;
		}
		
	}
	
	public static void setAppBaseSessionTimeToAlive(int timeInMs) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set session time to alive after create PersistentManager instance");
		}
		else {
			_timeToAlive = timeInMs;
		}
		
	}
	
	public static void setJDBCConnectionSetting(JDBCConnectionSetting aConnectionSetting) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set connection setting after create PersistentManager instance");
		}
		else {
			_connectionSetting = aConnectionSetting;
		}
		
	}
	
	public static void setHibernateProperties(Properties aProperties) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set hibernate properties after create PersistentManager instance");
		}
		else {
			_extraProperties = aProperties;
		}
		
	}
	
	public static void setConfigurationFile(String aConfigurationFile) throws PersistentException {
		if (_instance != null) {
			throw new PersistentException("Cannot set configuration file after create PersistentManager instance");
		}
		else {
			_configurationFile = aConfigurationFile;
		}
		
	}
	
	public static void saveJDBCConnectionSetting() {
		PersistentManager.saveJDBCConnectionSetting(PROJECT_NAME, _connectionSetting);
	}
}
