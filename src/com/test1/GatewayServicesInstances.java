package com.test1;

public class GatewayServicesInstances {
	private String serviceCode;
	private String serviceName;
	private boolean applicationReg;
	private String applicationId;
	private String applicationName;
	private String ami;
	private String availabilityZones;
	private String status;
	private Integer instanceCount;
	private Integer securePort;
	private String secureHost;
	private String secureProtocol;
	private String remarks;

	public GatewayServicesInstances() {

	}

	public GatewayServicesInstances(String serviceCode, String serviceName, boolean applicationReg,
			String applicationId, String applicationName, String ami, String availabilityZones, String status,
			Integer instanceCount, Integer securePort, String secureHost, String secureProtocol, String remarks) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.applicationReg = applicationReg;
		this.applicationId = applicationId;
		this.applicationName = applicationName;
		this.ami = ami;
		this.availabilityZones = availabilityZones;
		this.status = status;
		this.instanceCount = instanceCount;
		this.securePort = securePort;
		this.secureHost = secureHost;
		this.secureProtocol = secureProtocol;
		this.remarks = remarks;
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

	public boolean isApplicationReg() {
		return applicationReg;
	}

	public void setApplicationReg(boolean applicationReg) {
		this.applicationReg = applicationReg;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getAmi() {
		return ami;
	}

	public void setAmi(String ami) {
		this.ami = ami;
	}

	public String getAvailabilityZones() {
		return availabilityZones;
	}

	public void setAvailabilityZones(String availabilityZones) {
		this.availabilityZones = availabilityZones;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getInstanceCount() {
		return instanceCount;
	}

	public void setInstanceCount(Integer instanceCount) {
		this.instanceCount = instanceCount;
	}

	public Integer getSecurePort() {
		return securePort;
	}

	public void setSecurePort(Integer securePort) {
		this.securePort = securePort;
	}

	public String getSecureHost() {
		return secureHost;
	}

	public void setSecureHost(String secureHost) {
		this.secureHost = secureHost;
	}

	public String getSecureProtocol() {
		return secureProtocol;
	}

	public void setSecureProtocol(String secureProtocol) {
		this.secureProtocol = secureProtocol;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
