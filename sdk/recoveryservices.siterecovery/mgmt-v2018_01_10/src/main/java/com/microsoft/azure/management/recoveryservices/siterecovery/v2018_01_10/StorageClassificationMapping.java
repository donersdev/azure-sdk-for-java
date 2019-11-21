/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.StorageClassificationMappingInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.RecoveryServicesManager;

/**
 * Type representing StorageClassificationMapping.
 */
public interface StorageClassificationMapping extends HasInner<StorageClassificationMappingInner>, Indexable, Refreshable<StorageClassificationMapping>, Updatable<StorageClassificationMapping.Update>, HasManager<RecoveryServicesManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    StorageClassificationMappingProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the StorageClassificationMapping definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithReplicationStorageClassification, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageClassificationMapping definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageClassificationMapping definition.
         */
        interface Blank extends WithReplicationStorageClassification {
        }

        /**
         * The stage of the storageclassificationmapping definition allowing to specify ReplicationStorageClassification.
         */
        interface WithReplicationStorageClassification {
           /**
            * Specifies fabricName, storageClassificationName.
            * @param fabricName Fabric name
            * @param storageClassificationName Storage classification name
            * @return the next definition stage
            */
            WithProperties withExistingReplicationStorageClassification(String fabricName, String storageClassificationName);
        }

        /**
         * The stage of the storageclassificationmapping definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Storage mapping input properties
            * @return the next definition stage
            */
            WithCreate withProperties(StorageMappingInputProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageClassificationMapping> {
        }
    }
    /**
     * The template for a StorageClassificationMapping update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageClassificationMapping>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of StorageClassificationMapping update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageclassificationmapping update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Storage mapping input properties
             * @return the next update stage
             */
            Update withProperties(StorageMappingInputProperties properties);
        }

    }
}