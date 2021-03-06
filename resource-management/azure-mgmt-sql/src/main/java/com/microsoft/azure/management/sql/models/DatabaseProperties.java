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

import com.microsoft.windowsazure.core.LazyArrayList;

import java.util.ArrayList;
import java.util.Calendar;

/**
* Represents the properties of an Azure SQL Database.
*/
public class DatabaseProperties {
    private String collation;
    
    /**
    * Optional. Gets the collation of the Azure SQL Database.
    * @return The Collation value.
    */
    public String getCollation() {
        return this.collation;
    }
    
    /**
    * Optional. Gets the collation of the Azure SQL Database.
    * @param collationValue The Collation value.
    */
    public void setCollation(final String collationValue) {
        this.collation = collationValue;
    }
    
    private Calendar creationDate;
    
    /**
    * Optional. Gets the creation date of the Azure SQL Database.
    * @return The CreationDate value.
    */
    public Calendar getCreationDate() {
        return this.creationDate;
    }
    
    /**
    * Optional. Gets the creation date of the Azure SQL Database.
    * @param creationDateValue The CreationDate value.
    */
    public void setCreationDate(final Calendar creationDateValue) {
        this.creationDate = creationDateValue;
    }
    
    private String currentServiceObjectiveId;
    
    /**
    * Optional. Gets the current Service Level Objective Id of the Azure SQL
    * Database. This is the Id of the Service Level Objective that is
    * currently active.
    * @return The CurrentServiceObjectiveId value.
    */
    public String getCurrentServiceObjectiveId() {
        return this.currentServiceObjectiveId;
    }
    
    /**
    * Optional. Gets the current Service Level Objective Id of the Azure SQL
    * Database. This is the Id of the Service Level Objective that is
    * currently active.
    * @param currentServiceObjectiveIdValue The CurrentServiceObjectiveId value.
    */
    public void setCurrentServiceObjectiveId(final String currentServiceObjectiveIdValue) {
        this.currentServiceObjectiveId = currentServiceObjectiveIdValue;
    }
    
    private String databaseId;
    
    /**
    * Optional. Gets the Id of the Azure SQL Database.
    * @return The DatabaseId value.
    */
    public String getDatabaseId() {
        return this.databaseId;
    }
    
    /**
    * Optional. Gets the Id of the Azure SQL Database.
    * @param databaseIdValue The DatabaseId value.
    */
    public void setDatabaseId(final String databaseIdValue) {
        this.databaseId = databaseIdValue;
    }
    
    private String defaultSecondaryLocation;
    
    /**
    * Optional. Gets the default secondary region for this database.
    * @return The DefaultSecondaryLocation value.
    */
    public String getDefaultSecondaryLocation() {
        return this.defaultSecondaryLocation;
    }
    
    /**
    * Optional. Gets the default secondary region for this database.
    * @param defaultSecondaryLocationValue The DefaultSecondaryLocation value.
    */
    public void setDefaultSecondaryLocation(final String defaultSecondaryLocationValue) {
        this.defaultSecondaryLocation = defaultSecondaryLocationValue;
    }
    
    private Calendar earliestRestoreDate;
    
    /**
    * Optional. Gets the recovery period starte date of the Azure SQL Database.
    * This records the start date and time when recovery is available for this
    * Azure SQL Database.
    * @return The EarliestRestoreDate value.
    */
    public Calendar getEarliestRestoreDate() {
        return this.earliestRestoreDate;
    }
    
    /**
    * Optional. Gets the recovery period starte date of the Azure SQL Database.
    * This records the start date and time when recovery is available for this
    * Azure SQL Database.
    * @param earliestRestoreDateValue The EarliestRestoreDate value.
    */
    public void setEarliestRestoreDate(final Calendar earliestRestoreDateValue) {
        this.earliestRestoreDate = earliestRestoreDateValue;
    }
    
    private String edition;
    
    /**
    * Optional. Gets the edition of the Azure SQL Database.  The
    * DatabaseEditions enumeration contains all the valid editions.
    * @return The Edition value.
    */
    public String getEdition() {
        return this.edition;
    }
    
    /**
    * Optional. Gets the edition of the Azure SQL Database.  The
    * DatabaseEditions enumeration contains all the valid editions.
    * @param editionValue The Edition value.
    */
    public void setEdition(final String editionValue) {
        this.edition = editionValue;
    }
    
    private String elasticPoolName;
    
    /**
    * Optional. Gets the name of the Azure SQL Database Elastic Pool the
    * database is in.
    * @return The ElasticPoolName value.
    */
    public String getElasticPoolName() {
        return this.elasticPoolName;
    }
    
    /**
    * Optional. Gets the name of the Azure SQL Database Elastic Pool the
    * database is in.
    * @param elasticPoolNameValue The ElasticPoolName value.
    */
    public void setElasticPoolName(final String elasticPoolNameValue) {
        this.elasticPoolName = elasticPoolNameValue;
    }
    
    private long maxSizeBytes;
    
    /**
    * Optional. Gets the max size of the Azure SQL Database expressed in bytes.
    * @return The MaxSizeBytes value.
    */
    public long getMaxSizeBytes() {
        return this.maxSizeBytes;
    }
    
    /**
    * Optional. Gets the max size of the Azure SQL Database expressed in bytes.
    * @param maxSizeBytesValue The MaxSizeBytes value.
    */
    public void setMaxSizeBytes(final long maxSizeBytesValue) {
        this.maxSizeBytes = maxSizeBytesValue;
    }
    
    private String requestedServiceObjectiveId;
    
    /**
    * Optional. Gets the configured Service Level Objective Id of the Azure SQL
    * Database. This is the Service Level Objective that is being applied to
    * the Azure SQL Database.
    * @return The RequestedServiceObjectiveId value.
    */
    public String getRequestedServiceObjectiveId() {
        return this.requestedServiceObjectiveId;
    }
    
    /**
    * Optional. Gets the configured Service Level Objective Id of the Azure SQL
    * Database. This is the Service Level Objective that is being applied to
    * the Azure SQL Database.
    * @param requestedServiceObjectiveIdValue The RequestedServiceObjectiveId
    * value.
    */
    public void setRequestedServiceObjectiveId(final String requestedServiceObjectiveIdValue) {
        this.requestedServiceObjectiveId = requestedServiceObjectiveIdValue;
    }
    
    private String requestedServiceObjectiveName;
    
    /**
    * Optional. Gets the name of the configured Service Level Objective of the
    * Azure SQL Database. This is the Service Level Objective that is being
    * applied to the Azure SQL Database.
    * @return The RequestedServiceObjectiveName value.
    */
    public String getRequestedServiceObjectiveName() {
        return this.requestedServiceObjectiveName;
    }
    
    /**
    * Optional. Gets the name of the configured Service Level Objective of the
    * Azure SQL Database. This is the Service Level Objective that is being
    * applied to the Azure SQL Database.
    * @param requestedServiceObjectiveNameValue The
    * RequestedServiceObjectiveName value.
    */
    public void setRequestedServiceObjectiveName(final String requestedServiceObjectiveNameValue) {
        this.requestedServiceObjectiveName = requestedServiceObjectiveNameValue;
    }
    
    private ArrayList<Schema> schemas;
    
    /**
    * Optional. Gets the schemas from this database.
    * @return The Schemas value.
    */
    public ArrayList<Schema> getSchemas() {
        return this.schemas;
    }
    
    /**
    * Optional. Gets the schemas from this database.
    * @param schemasValue The Schemas value.
    */
    public void setSchemas(final ArrayList<Schema> schemasValue) {
        this.schemas = schemasValue;
    }
    
    private String serviceObjective;
    
    /**
    * Optional. Gets the Service Level Objective of the Azure SQL Database.
    * @return The ServiceObjective value.
    */
    public String getServiceObjective() {
        return this.serviceObjective;
    }
    
    /**
    * Optional. Gets the Service Level Objective of the Azure SQL Database.
    * @param serviceObjectiveValue The ServiceObjective value.
    */
    public void setServiceObjective(final String serviceObjectiveValue) {
        this.serviceObjective = serviceObjectiveValue;
    }
    
    private ArrayList<ServiceTierAdvisor> serviceTierAdvisors;
    
    /**
    * Optional. Gets the list of service tier advisors for this database.
    * Expanded property
    * @return The ServiceTierAdvisors value.
    */
    public ArrayList<ServiceTierAdvisor> getServiceTierAdvisors() {
        return this.serviceTierAdvisors;
    }
    
    /**
    * Optional. Gets the list of service tier advisors for this database.
    * Expanded property
    * @param serviceTierAdvisorsValue The ServiceTierAdvisors value.
    */
    public void setServiceTierAdvisors(final ArrayList<ServiceTierAdvisor> serviceTierAdvisorsValue) {
        this.serviceTierAdvisors = serviceTierAdvisorsValue;
    }
    
    private String status;
    
    /**
    * Optional. Gets the status of the Azure SQL Database.
    * @return The Status value.
    */
    public String getStatus() {
        return this.status;
    }
    
    /**
    * Optional. Gets the status of the Azure SQL Database.
    * @param statusValue The Status value.
    */
    public void setStatus(final String statusValue) {
        this.status = statusValue;
    }
    
    private UpgradeHint upgradeHint;
    
    /**
    * Optional. Gets the upgrade hint for this database.
    * @return The UpgradeHint value.
    */
    public UpgradeHint getUpgradeHint() {
        return this.upgradeHint;
    }
    
    /**
    * Optional. Gets the upgrade hint for this database.
    * @param upgradeHintValue The UpgradeHint value.
    */
    public void setUpgradeHint(final UpgradeHint upgradeHintValue) {
        this.upgradeHint = upgradeHintValue;
    }
    
    /**
    * Initializes a new instance of the DatabaseProperties class.
    *
    */
    public DatabaseProperties() {
        this.setSchemas(new LazyArrayList<Schema>());
        this.setServiceTierAdvisors(new LazyArrayList<ServiceTierAdvisor>());
    }
}
