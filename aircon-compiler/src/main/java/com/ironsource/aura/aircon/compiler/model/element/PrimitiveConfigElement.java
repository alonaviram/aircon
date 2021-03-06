package com.ironsource.aura.aircon.compiler.model.element;

/**
 * Created on 11/3/2018.
 */
public class PrimitiveConfigElement
		extends ConfigElement {

	PrimitiveConfigElement(Properties properties) {
		super(properties);
	}

	@Override
	public <T, S> S accept(final Visitor<T, S> visitor, final T arg) {
		return visitor.visit(this, arg);
	}
}
