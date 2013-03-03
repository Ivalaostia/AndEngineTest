package org.andengine.util.adt.bit;


/**
 * @author Nicolas Gramlich
 * @since 22:31:38 - 16.09.2010
 */
public class ByteBackedBitVectorTest extends BitVectorTest {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	@Override
	protected IBitVector createBitVector(final byte[] pData) {
		return new ByteBackedBitVector(pData);
	}

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
