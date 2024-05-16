package com.test1;

public class EurekaService {
	private Integer serverPort;
	private String registerWithEureka;
	private String healthCheckURL;
	private String sameZone;
	private String fetchRegistry;
	private Integer locale;
	private String defaultZone;
	private String leaseDuration;
	private String leaseRenewalDuration;
	private Integer hostName;
	private String healthCheckHandler;
	private String appContext;
	private String gracefullShutdown;

	public EurekaService() {

	}

	public EurekaService(Integer serverPort, String registerWithEureka, String healthCheckURL, String sameZone,
			String fetchRegistry, Integer locale, String defaultZone, String leaseDuration, String leaseRenewalDuration,
			Integer hostName, String healthCheckHandler, String appContext, String gracefullShutdown) {
		super();
		this.serverPort = serverPort;
		this.registerWithEureka = registerWithEureka;
		this.healthCheckURL = healthCheckURL;
		this.sameZone = sameZone;
		this.fetchRegistry = fetchRegistry;
		this.locale = locale;
		this.defaultZone = defaultZone;
		this.leaseDuration = leaseDuration;
		this.leaseRenewalDuration = leaseRenewalDuration;
		this.hostName = hostName;
		this.healthCheckHandler = healthCheckHandler;
		this.appContext = appContext;
		this.gracefullShutdown = gracefullShutdown;
	}

	public Integer getServerPort() {
		return serverPort;
	}

	public void setServerPort(Integer serverPort) {
		this.serverPort = serverPort;
	}

	public String getRegisterWithEureka() {
		return registerWithEureka;
	}

	public void setRegisterWithEureka(String registerWithEureka) {
		this.registerWithEureka = registerWithEureka;
	}

	public String getHealthCheckURL() {
		return healthCheckURL;
	}

	public void setHealthCheckURL(String healthCheckURL) {
		this.healthCheckURL = healthCheckURL;
	}

	public String getSameZone() {
		return sameZone;
	}

	public void setSameZone(String sameZone) {
		this.sameZone = sameZone;
	}

	public String getFetchRegistry() {
		return fetchRegistry;
	}

	public void setFetchRegistry(String fetchRegistry) {
		this.fetchRegistry = fetchRegistry;
	}

	public Integer getLocale() {
		return locale;
	}

	public void setLocale(Integer locale) {
		this.locale = locale;
	}

	public String getDefaultZone() {
		return defaultZone;
	}

	public void setDefaultZone(String defaultZone) {
		this.defaultZone = defaultZone;
	}

	public String getLeaseDuration() {
		return leaseDuration;
	}

	public void setLeaseDuration(String leaseDuration) {
		this.leaseDuration = leaseDuration;
	}

	public String getLeaseRenewalDuration() {
		return leaseRenewalDuration;
	}

	public void setLeaseRenewalDuration(String leaseRenewalDuration) {
		this.leaseRenewalDuration = leaseRenewalDuration;
	}

	public Integer getHostName() {
		return hostName;
	}

	public void setHostName(Integer hostName) {
		this.hostName = hostName;
	}

	public String getHealthCheckHandler() {
		return healthCheckHandler;
	}

	public void setHealthCheckHandler(String healthCheckHandler) {
		this.healthCheckHandler = healthCheckHandler;
	}

	public String getAppContext() {
		return appContext;
	}

	public void setAppContext(String appContext) {
		this.appContext = appContext;
	}

	public String getGracefullShutdown() {
		return gracefullShutdown;
	}

	public void setGracefullShutdown(String gracefullShutdown) {
		this.gracefullShutdown = gracefullShutdown;
	}

}
