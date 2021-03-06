/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.LabVirtualMachineCreationParameter;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.FormulaPropertiesFromVm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A formula for creating a VM, specifying an image base and other parameters.
 */
@JsonFlatten
@SkipParentValidation
public class FormulaInner extends Resource {
    /**
     * The description of the formula.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the formula.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The OS type of the formula.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * The creation date of the formula.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The content of the formula.
     */
    @JsonProperty(value = "properties.formulaContent")
    private LabVirtualMachineCreationParameter formulaContent;

    /**
     * Information about a VM from which a formula is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private FormulaPropertiesFromVm vm;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

    /**
     * Get the description of the formula.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the formula.
     *
     * @param description the description value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author of the formula.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author of the formula.
     *
     * @param author the author value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the OS type of the formula.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the formula.
     *
     * @param osType the osType value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the creation date of the formula.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the content of the formula.
     *
     * @return the formulaContent value
     */
    public LabVirtualMachineCreationParameter formulaContent() {
        return this.formulaContent;
    }

    /**
     * Set the content of the formula.
     *
     * @param formulaContent the formulaContent value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withFormulaContent(LabVirtualMachineCreationParameter formulaContent) {
        this.formulaContent = formulaContent;
        return this;
    }

    /**
     * Get information about a VM from which a formula is to be created.
     *
     * @return the vm value
     */
    public FormulaPropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set information about a VM from which a formula is to be created.
     *
     * @param vm the vm value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withVm(FormulaPropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

}
