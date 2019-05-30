package org.tenkichannel.umbrella.carry.process;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Result implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Key
	@org.kie.api.definition.type.Label(value = "Should we carry an umbrella?")
	private java.lang.Boolean carryUmbrella;

	public Result() {
	    this.carryUmbrella = false;
	}

	public java.lang.Boolean getCarryUmbrella() {
		return this.carryUmbrella;
	}

	public void setCarryUmbrella(java.lang.Boolean carryUmbrella) {
		this.carryUmbrella = carryUmbrella;
	}

	public Result(java.lang.Boolean carryUmbrella) {
		this.carryUmbrella = carryUmbrella;
	}
	
	@Override
	public String toString() {
	    return carryUmbrella.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		org.tenkichannel.umbrella.carry.process.Result that = (org.tenkichannel.umbrella.carry.process.Result) o;
		if (carryUmbrella != null
				? !carryUmbrella.equals(that.carryUmbrella)
				: that.carryUmbrella != null)
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result
				+ (carryUmbrella != null ? carryUmbrella.hashCode() : 0);
		return result;
	}

}