package com.test1;

public class GatewayServicesData {
	private String serviceCode;
	private String serviceName;
	private String instances;
	private String namingServer;
	private String environment;
	private String dataCentre;
	private String leaseExpiration;
	private Integer renewals;
	private String threshold;
	private String renewLastMin;
	private String upTime;

	public GatewayServicesData() {

	}

	public GatewayServicesData(String serviceCode, String serviceName, String instances, String namingServer,
			String environment, String dataCentre, String leaseExpiration, Integer renewals, String threshold,
			String renewLastMin, String upTime) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.instances = instances;
		this.namingServer = namingServer;
		this.environment = environment;
		this.dataCentre = dataCentre;
		this.leaseExpiration = leaseExpiration;
		this.renewals = renewals;
		this.threshold = threshold;
		this.renewLastMin = renewLastMin;
		this.upTime = upTime;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getInstances() {
		return instances;
	}

	public void setInstances(String instances) {
		this.instances = instances;
	}

	public String getNamingServer() {
		return namingServer;
	}

	public void setNamingServer(String namingServer) {
		this.namingServer = namingServer;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getDataCentre() {
		return dataCentre;
	}

	public void setDataCentre(String dataCentre) {
		this.dataCentre = dataCentre;
	}

	public String getLeaseExpiration() {
		return leaseExpiration;
	}

	public void setLeaseExpiration(String leaseExpiration) {
		this.leaseExpiration = leaseExpiration;
	}

	public Integer getRenewals() {
		return renewals;
	}

	public void setRenewals(Integer renewals) {
		this.renewals = renewals;
	}

	public String getThreshold() {
		return threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	public String getRenewLastMin() {
		return renewLastMin;
	}

	public void setRenewLastMin(String renewLastMin) {
		this.renewLastMin = renewLastMin;
	}

	public String getUpTime() {
		return upTime;
	}

	public void setUpTime(String upTime) {
		this.upTime = upTime;
	}

}
