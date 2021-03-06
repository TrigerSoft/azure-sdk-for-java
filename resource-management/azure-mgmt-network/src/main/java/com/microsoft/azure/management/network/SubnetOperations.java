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

package com.microsoft.azure.management.network;

import com.microsoft.azure.management.network.models.AzureAsyncOperationResponse;
import com.microsoft.azure.management.network.models.Subnet;
import com.microsoft.azure.management.network.models.SubnetGetResponse;
import com.microsoft.azure.management.network.models.SubnetListResponse;
import com.microsoft.azure.management.network.models.SubnetPutResponse;
import com.microsoft.azure.management.network.models.UpdateOperationResponse;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
* The Network Resource Provider API includes operations for managing the
* subnets for your subscription.
*/
public interface SubnetOperations {
    /**
    * The Put Subnet operation creates/updates a subnet in thespecified virtual
    * network
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @param subnetParameters Required. Parameters supplied to the
    * create/update Subnet operation
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for PutSubnet Api service call
    */
    SubnetPutResponse beginCreateOrUpdating(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters) throws IOException, ServiceException;
    
    /**
    * The Put Subnet operation creates/updates a subnet in thespecified virtual
    * network
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @param subnetParameters Required. Parameters supplied to the
    * create/update Subnet operation
    * @return Response for PutSubnet Api service call
    */
    Future<SubnetPutResponse> beginCreateOrUpdatingAsync(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters);
    
    /**
    * The delete subnet operation deletes the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return If the resource provide needs to return an error to any
    * operation, it should return the appropriate HTTP error code and a
    * message body as can be seen below.The message should be localized per
    * the Accept-Language header specified in the original request such thatit
    * could be directly be exposed to users
    */
    UpdateOperationResponse beginDeleting(String resourceGroupName, String virtualNetworkName, String subnetName) throws IOException, ServiceException;
    
    /**
    * The delete subnet operation deletes the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @return If the resource provide needs to return an error to any
    * operation, it should return the appropriate HTTP error code and a
    * message body as can be seen below.The message should be localized per
    * the Accept-Language header specified in the original request such thatit
    * could be directly be exposed to users
    */
    Future<UpdateOperationResponse> beginDeletingAsync(String resourceGroupName, String virtualNetworkName, String subnetName);
    
    /**
    * The Put Subnet operation creates/updates a subnet in thespecified virtual
    * network
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @param subnetParameters Required. Parameters supplied to the
    * create/update Subnet operation
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    AzureAsyncOperationResponse createOrUpdate(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The Put Subnet operation creates/updates a subnet in thespecified virtual
    * network
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @param subnetParameters Required. Parameters supplied to the
    * create/update Subnet operation
    * @return The response body contains the status of the specified
    * asynchronous operation, indicating whether it has succeeded, is
    * inprogress, or has failed. Note that this status is distinct from the
    * HTTP status code returned for the Get Operation Status operation itself.
    * If the asynchronous operation succeeded, the response body includes the
    * HTTP status code for the successful request. If the asynchronous
    * operation failed, the response body includes the HTTP status code for
    * the failed request and error information regarding the failure.
    */
    Future<AzureAsyncOperationResponse> createOrUpdateAsync(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters);
    
    /**
    * The delete subnet operation deletes the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @throws InterruptedException Thrown when a thread is waiting, sleeping,
    * or otherwise occupied, and the thread is interrupted, either before or
    * during the activity. Occasionally a method may wish to test whether the
    * current thread has been interrupted, and if so, to immediately throw
    * this exception. The following code can be used to achieve this effect:
    * @throws ExecutionException Thrown when attempting to retrieve the result
    * of a task that aborted by throwing an exception. This exception can be
    * inspected using the Throwable.getCause() method.
    * @throws IOException Thrown if there was an error setting up tracing for
    * the request.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String virtualNetworkName, String subnetName) throws InterruptedException, ExecutionException, IOException;
    
    /**
    * The delete subnet operation deletes the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName);
    
    /**
    * The Get subnet operation retreives information about the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for GetSubnet Api service call
    */
    SubnetGetResponse get(String resourceGroupName, String virtualNetworkName, String subnetName) throws IOException, ServiceException;
    
    /**
    * The Get subnet operation retreives information about the specified subnet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @param subnetName Required. The name of the subnet.
    * @return Response for GetSubnet Api service call
    */
    Future<SubnetGetResponse> getAsync(String resourceGroupName, String virtualNetworkName, String subnetName);
    
    /**
    * The List subnets opertion retrieves all the subnets in a virtual network.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return Response for ListSubnets Api service callRetrieves all subnet
    * that belongs to a virtual network
    */
    SubnetListResponse list(String resourceGroupName, String virtualNetworkName) throws IOException, ServiceException;
    
    /**
    * The List subnets opertion retrieves all the subnets in a virtual network.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param virtualNetworkName Required. The name of the virtual network.
    * @return Response for ListSubnets Api service callRetrieves all subnet
    * that belongs to a virtual network
    */
    Future<SubnetListResponse> listAsync(String resourceGroupName, String virtualNetworkName);
}
