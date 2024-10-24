package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1alpha1OverheadBuilder extends io.kubernetes.client.openapi.models.V1alpha1OverheadFluentImpl<io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1alpha1Overhead,io.kubernetes.client.openapi.models.V1alpha1OverheadBuilder> {

    io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1alpha1OverheadBuilder() {
        this(true);
    }

    public V1alpha1OverheadBuilder(java.lang.Boolean validationEnabled) {
        this(new V1alpha1Overhead(), validationEnabled);
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent) {
        this(fluent, true);
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1alpha1Overhead(), validationEnabled);
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Overhead instance) {
        this(fluent, instance, true);
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1OverheadFluent<?> fluent,io.kubernetes.client.openapi.models.V1alpha1Overhead instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withPodFixed(instance.getPodFixed());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1Overhead instance) {
        this(instance,true);
    }

    public V1alpha1OverheadBuilder(io.kubernetes.client.openapi.models.V1alpha1Overhead instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withPodFixed(instance.getPodFixed());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1alpha1Overhead build() {
        V1alpha1Overhead buildable = new V1alpha1Overhead();
        buildable.setPodFixed(fluent.getPodFixed());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1alpha1OverheadBuilder that = (V1alpha1OverheadBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
