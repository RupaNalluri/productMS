package com.oms.product.entity;

import java.util.Objects;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.oms.product.utility.CustomPK;

@Entity
@Table(name = "subscribed_product")
public class SubscribedProduct {
	
	@EmbeddedId
	private CustomPK customId;
	private Integer quantity;

	public CustomPK getCustomId() {
		return customId;
	}

	public void setCustomId(CustomPK customId) {
		this.customId = customId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "SubscribedProduct [customId=" + customId + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customId, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubscribedProduct other = (SubscribedProduct) obj;
		return Objects.equals(customId, other.customId) && Objects.equals(quantity, other.quantity);
	}
	
}
