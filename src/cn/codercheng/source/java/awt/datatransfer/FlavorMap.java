/*
 * Copyright (c) 1997, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package java.awt.datatransfer;

import java.util.Map;


/**
 * A two-way Map between "natives" (Strings), which correspond to platform-
 * specific data formats, and "flavors" (DataFlavors), which correspond to
 * platform-independent MIME types. FlavorMaps need not be symmetric, but
 * typically are.
 *
 *
 * @since 1.2
 */
public interface FlavorMap {

    /**
     * Returns a <code>Map</code> of the specified <code>DataFlavor</code>s to
     * their corresponding <code>string</code> native. The returned
     * <code>Map</code> is a modifiable copy of this <code>FlavorMap</code>'s
     * internal data. Client code is free to modify the <code>Map</code>
     * without affecting this object.
     *
     * @param flavors an array of <code>DataFlavor</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all <code>DataFlavor</code>s currently
     *        known to this <code>FlavorMap</code> to their corresponding
     *        <code>string</code> natives will be returned.
     * @return a <code>java.util.Map</code> of <code>DataFlavor</code>s to
     *         <code>string</code> natives
     */
    Map<DataFlavor,String> getNativesForFlavors(DataFlavor[] flavors);

    /**
     * Returns a <code>Map</code> of the specified <code>string</code> natives
     * to their corresponding <code>DataFlavor</code>. The returned
     * <code>Map</code> is a modifiable copy of this <code>FlavorMap</code>'s
     * internal data. Client code is free to modify the <code>Map</code>
     * without affecting this object.
     *
     * @param natives an array of <code>string</code>s which will be the
     *        key set of the returned <code>Map</code>. If <code>null</code> is
     *        specified, a mapping of all <code>string</code> natives currently
     *        known to this <code>FlavorMap</code> to their corresponding
     *        <code>DataFlavor</code>s will be returned.
     * @return a <code>java.util.Map</code> of <code>string</code> natives to
     *         <code>DataFlavor</code>s
     */
    Map<String,DataFlavor> getFlavorsForNatives(String[] natives);
}
