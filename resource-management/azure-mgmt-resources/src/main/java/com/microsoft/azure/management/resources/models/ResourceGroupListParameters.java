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

package com.microsoft.azure.management.resources.models;

/**
* Resource group information.
*/
public class ResourceGroupListParameters {
    private String tagName;
    
    /**
    * Optional. Filter the results based on a particular tag name. Optional.
    * @return The TagName value.
    */
    public String getTagName() {
        return this.tagName;
    }
    
    /**
    * Optional. Filter the results based on a particular tag name. Optional.
    * @param tagNameValue The TagName value.
    */
    public void setTagName(final String tagNameValue) {
        this.tagName = tagNameValue;
    }
    
    private String tagValue;
    
    /**
    * Optional. Filter the results for a tag name along with a particular tag
    * value. Optional.
    * @return The TagValue value.
    */
    public String getTagValue() {
        return this.tagValue;
    }
    
    /**
    * Optional. Filter the results for a tag name along with a particular tag
    * value. Optional.
    * @param tagValueValue The TagValue value.
    */
    public void setTagValue(final String tagValueValue) {
        this.tagValue = tagValueValue;
    }
    
    private Integer top;
    
    /**
    * Optional. Number of records to return. Optional.
    * @return The Top value.
    */
    public Integer getTop() {
        return this.top;
    }
    
    /**
    * Optional. Number of records to return. Optional.
    * @param topValue The Top value.
    */
    public void setTop(final Integer topValue) {
        this.top = topValue;
    }
}
