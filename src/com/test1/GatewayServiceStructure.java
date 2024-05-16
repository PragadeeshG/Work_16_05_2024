package com.test1;

public class GatewayServiceStructure {
	private String serviceCode;
	private String serviceName;
	private String dsReplicas;
	private String systemStatus;
	private String registry;
	private String arcType;
	private boolean cpuAvail;
	private Integer cpuCount;
	private String currentUsage;
	private String registeredReplica;
	private String availableReplica;
	private String unavailableReplica;
	private String ipAddress;
	private String status;

	public GatewayServiceStructure() {

	}

	public GatewayServiceStructure(String serviceCode, String serviceName, String dsReplicas, String systemStatus,
			String registry, String arcType, boolean cpuAvail, Integer cpuCount, String currentUsage,
			String registeredReplica, String availableReplica, String unavailableReplica, String ipAddress,
			String status) {
		super();
		this.serviceCode = serviceCode;
		this.serviceName = serviceName;
		this.dsReplicas = dsReplicas;
		this.systemStatus = systemStatus;
		this.registry = registry;
		this.arcType = arcType;
		this.cpuAvail = cpuAvail;
		this.cpuCount = cpuCount;
		this.currentUsage = currentUsage;
		this.registeredReplica = registeredReplica;
		this.availableReplica = availableReplica;
		this.unavailableReplica = unavailableReplica;
		this.ipAddress = ipAddress;
		this.status = status;
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

	public String getDsReplicas() {
		return dsReplicas;
	}

	public void setDsReplicas(String dsReplicas) {
		this.dsReplicas = dsReplicas;
	}

	public String getSystemStatus() {
		return systemStatus;
	}

	public void setSystemStatus(String systemStatus) {
		this.systemStatus = systemStatus;
	}

	public String getRegistry() {
		return registry;
	}

	public void setRegistry(String registry) {
		this.registry = registry;
	}

	public String getArcType() {
		return arcType;
	}

	public void setArcType(String arcType) {
		this.arcType = arcType;
	}

	public boolean isCpuAvail() {
		return cpuAvail;
	}

	public void setCpuAvail(boolean cpuAvail) {
		this.cpuAvail = cpuAvail;
	}

	public Integer getCpuCount() {
		return cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
	}

	public String getCurrentUsage() {
		return currentUsage;
	}

	public void setCurrentUsage(String currentUsage) {
		this.currentUsage = currentUsage;
	}

	public String getRegisteredReplica() {
		return registeredReplica;
	}

	public void setRegisteredReplica(String registeredReplica) {
		this.registeredReplica = registeredReplica;
	}

	public String getAvailableReplica() {
		return availableReplica;
	}

	public void setAvailableReplica(String availableReplica) {
		this.availableReplica = availableReplica;
	}

	public String getUnavailableReplica() {
		return unavailableReplica;
	}

	public void setUnavailableReplica(String unavailableReplica) {
		this.unavailableReplica = unavailableReplica;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
