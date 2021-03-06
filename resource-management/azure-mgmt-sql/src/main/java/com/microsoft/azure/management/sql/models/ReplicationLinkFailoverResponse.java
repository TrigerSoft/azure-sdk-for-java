/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.sql.models;

import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.core.OperationStatus;

/**
* Response for long running Azure Sql Database replication failover operations.
*/
public class ReplicationLinkFailoverResponse extends OperationResponse {
    private ErrorResponse error;
    
    /**
    * Optional. Gets or sets the error response if any.
    * @return The Error value.
    */
    public ErrorResponse getError() {
        return this.error;
    }
    
    /**
    * Optional. Gets or sets the error response if any.
    * @param errorValue The Error value.
    */
    public void setError(final ErrorResponse errorValue) {
        this.error = errorValue;
    }
    
    private String operationStatusLink;
    
    /**
    * Optional. Gets or sets the operation status link.
    * @return The OperationStatusLink value.
    */
    public String getOperationStatusLink() {
        return this.operationStatusLink;
    }
    
    /**
    * Optional. Gets or sets the operation status link.
    * @param operationStatusLinkValue The OperationStatusLink value.
    */
    public void setOperationStatusLink(final String operationStatusLinkValue) {
        this.operationStatusLink = operationStatusLinkValue;
    }
    
    private int retryAfter;
    
    /**
    * Optional. Gets or sets the retry delay for polling.
    * @return The RetryAfter value.
    */
    public int getRetryAfter() {
        return this.retryAfter;
    }
    
    /**
    * Optional. Gets or sets the retry delay for polling.
    * @param retryAfterValue The RetryAfter value.
    */
    public void setRetryAfter(final int retryAfterValue) {
        this.retryAfter = retryAfterValue;
    }
    
    private OperationStatus status;
    
    /**
    * Optional. Gets or sets the operation status.
    * @return The Status value.
    */
    public OperationStatus getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets or sets the operation status.
    * @param statusValue The Status value.
    */
    public void setStatus(final OperationStatus statusValue) {
        this.status = statusValue;
    }
}
