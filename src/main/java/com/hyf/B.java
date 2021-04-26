package com.hyf;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

/**
 * @author baB_hyf
 * @date 2021/04/26
 */
@SupportedAnnotationTypes({"*" })
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class B extends AbstractProcessor
{
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        System.out.println("start process B");
        return false;
    }
}

