
package com.wavemaker.tools.filesystem;

import java.io.File;

/**
 * Callback interface used to perform a legacy file operation. See
 * {@link Resource#performLegacyOperation(LegacyFileOperation)}.
 * 
 * @author Phillip Webb
 */
public interface LegacyFileOperation<T> {

    /**
     * Perform the operation
     * 
     * @param file a Java {@link File} representation of the resource.
     * @return the result of the operation or <tt>null</tt>
     */
    T perform(File file);
}
