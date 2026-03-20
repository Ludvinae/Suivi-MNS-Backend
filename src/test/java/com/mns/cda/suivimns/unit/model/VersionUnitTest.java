package com.mns.cda.suivimns.unit.model;

import com.mns.cda.suivimns.model.Version;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class VersionUnitTest {

    protected static Validator validator;

    @BeforeAll
    public static void init() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }


    @Test
    public void validVersionWithBlankNumber_shouldBeInvalid() {

        Version version = new Version();
        //version.setVersion_number("");
    }
}
