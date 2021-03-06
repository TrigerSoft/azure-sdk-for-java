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

package com.microsoft.windowsazure.management.compute.models;

/**
* Optional. The status information of a specific Resource Extension.
*/
public class ResourceExtensionStatus {
    private Integer code;
    
    /**
    * Optional. Status code sent by the Resource Extension.
    * @return The Code value.
    */
    public Integer getCode() {
        return this.code;
    }
    
    /**
    * Optional. Status code sent by the Resource Extension.
    * @param codeValue The Code value.
    */
    public void setCode(final Integer codeValue) {
        this.code = codeValue;
    }
    
    private ResourceExtensionConfigurationStatus extensionSettingStatus;
    
    /**
    * Optional. This object encapsulates the extension setting status for the
    * Resource Extension.
    * @return The ExtensionSettingStatus value.
    */
    public ResourceExtensionConfigurationStatus getExtensionSettingStatus() {
        return this.extensionSettingStatus;
    }
    
    /**
    * Optional. This object encapsulates the extension setting status for the
    * Resource Extension.
    * @param extensionSettingStatusValue The ExtensionSettingStatus value.
    */
    public void setExtensionSettingStatus(final ResourceExtensionConfigurationStatus extensionSettingStatusValue) {
        this.extensionSettingStatus = extensionSettingStatusValue;
    }
    
    private GuestAgentFormattedMessage formattedMessage;
    
    /**
    * Optional. This object encapsulates a formatted localized status message
    * from the Resource Extension.
    * @return The FormattedMessage value.
    */
    public GuestAgentFormattedMessage getFormattedMessage() {
        return this.formattedMessage;
    }
    
    /**
    * Optional. This object encapsulates a formatted localized status message
    * from the Resource Extension.
    * @param formattedMessageValue The FormattedMessage value.
    */
    public void setFormattedMessage(final GuestAgentFormattedMessage formattedMessageValue) {
        this.formattedMessage = formattedMessageValue;
    }
    
    private String handlerName;
    
    /**
    * Optional. Name of the Resource Extension.
    * @return The HandlerName value.
    */
    public String getHandlerName() {
        return this.handlerName;
    }
    
    /**
    * Optional. Name of the Resource Extension.
    * @param handlerNameValue The HandlerName value.
    */
    public void setHandlerName(final String handlerNameValue) {
        this.handlerName = handlerNameValue;
    }
    
    private GuestAgentMessage message;
    
    /**
    * Optional. This object encapsulates a localized status message from the
    * Guest Agent.
    * @return The Message value.
    */
    public GuestAgentMessage getMessage() {
        return this.message;
    }
    
    /**
    * Optional. This object encapsulates a localized status message from the
    * Guest Agent.
    * @param messageValue The Message value.
    */
    public void setMessage(final GuestAgentMessage messageValue) {
        this.message = messageValue;
    }
    
    private String status;
    
    /**
    * Optional. The resource extension status, which can be "Installing",
    * "Ready", "NotReady", or "Unresponsive".
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. The resource extension status, which can be "Installing",
    * "Ready", "NotReady", or "Unresponsive".
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    private String version;
    
    /**
    * Optional. Version of the Resource Extension.
    * @return The Version value.
    */
    public String getVersion() {
        return this.version;
    }
    
    /**
    * Optional. Version of the Resource Extension.
    * @param versionValue The Version value.
    */
    public void setVersion(final String versionValue) {
        this.version = versionValue;
    }
}
