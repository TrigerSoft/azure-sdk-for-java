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

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.VirtualMachineImageGetParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineImageGetResponse;
import com.microsoft.azure.management.compute.models.VirtualMachineImageListOffersParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineImageListParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineImageListPublishersParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineImageListSkusParameters;
import com.microsoft.azure.management.compute.models.VirtualMachineImageResourceList;
import com.microsoft.windowsazure.exception.ServiceException;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.Future;

/**
* Operations for managing the virtual machine images in compute management.
*/
public interface VirtualMachineImageOperations {
    /**
    * Gets a virtual machine image.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return The get vm image operation response.
    */
    VirtualMachineImageGetResponse get(VirtualMachineImageGetParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets a virtual machine image.
    *
    * @param parameters Optional.
    * @return The get vm image operation response.
    */
    Future<VirtualMachineImageGetResponse> getAsync(VirtualMachineImageGetParameters parameters);
    
    /**
    * Gets a list of virtual machine images.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @throws URISyntaxException Thrown if there was an error parsing a URI in
    * the response.
    * @return A list of virtual machine image resource information.
    */
    VirtualMachineImageResourceList list(VirtualMachineImageListParameters parameters) throws IOException, ServiceException, URISyntaxException;
    
    /**
    * Gets a list of virtual machine images.
    *
    * @param parameters Optional.
    * @return A list of virtual machine image resource information.
    */
    Future<VirtualMachineImageResourceList> listAsync(VirtualMachineImageListParameters parameters);
    
    /**
    * Gets a list of virtual machine image offers.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A list of virtual machine image resource information.
    */
    VirtualMachineImageResourceList listOffers(VirtualMachineImageListOffersParameters parameters) throws IOException, ServiceException;
    
    /**
    * Gets a list of virtual machine image offers.
    *
    * @param parameters Optional.
    * @return A list of virtual machine image resource information.
    */
    Future<VirtualMachineImageResourceList> listOffersAsync(VirtualMachineImageListOffersParameters parameters);
    
    /**
    * Gets a list of virtual machine image publishers.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A list of virtual machine image resource information.
    */
    VirtualMachineImageResourceList listPublishers(VirtualMachineImageListPublishersParameters parameters) throws IOException, ServiceException;
    
    /**
    * Gets a list of virtual machine image publishers.
    *
    * @param parameters Optional.
    * @return A list of virtual machine image resource information.
    */
    Future<VirtualMachineImageResourceList> listPublishersAsync(VirtualMachineImageListPublishersParameters parameters);
    
    /**
    * Gets a list of virtual machine image skus.
    *
    * @param parameters Optional.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A list of virtual machine image resource information.
    */
    VirtualMachineImageResourceList listSkus(VirtualMachineImageListSkusParameters parameters) throws IOException, ServiceException;
    
    /**
    * Gets a list of virtual machine image skus.
    *
    * @param parameters Optional.
    * @return A list of virtual machine image resource information.
    */
    Future<VirtualMachineImageResourceList> listSkusAsync(VirtualMachineImageListSkusParameters parameters);
}
