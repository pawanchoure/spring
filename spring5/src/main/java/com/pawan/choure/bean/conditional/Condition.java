package com.pawan.choure.bean.conditional;
 
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
//@Target
public interface Condition {
	boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata);

}
