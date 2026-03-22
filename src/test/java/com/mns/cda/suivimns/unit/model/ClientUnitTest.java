package com.mns.cda.suivimns.unit.model;

import com.mns.cda.suivimns.TestUtils;
import com.mns.cda.suivimns.model.Client;
import com.mns.cda.suivimns.model.groups.OnCreate;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ClientUnitTest {

    protected static Validator validator;

    @BeforeAll
    public static void init() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    // ---------- firstName ----------

    @Test
    public void clientWithBlankFirstName_shouldNotBeValid() {
        Client client = new Client();
        client.setFirstName("");

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client, OnCreate.class),
                "firstName",
                "NotBlank"
        );

        Assertions.assertTrue(constraintExists, "FirstName must not be blank");
    }

    @Test
    public void clientWithTooLongFirstName_shouldNotBeValid() {
        Client client = new Client();
        client.setFirstName("a".repeat(128));

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client),
                "firstName",
                "Length"
        );

        Assertions.assertTrue(constraintExists, "FirstName must be <= 127 characters");
    }

    // ---------- lastName ----------

    @Test
    public void clientWithBlankLastName_shouldNotBeValid() {
        Client client = new Client();
        client.setLastName("");

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client, OnCreate.class),
                "lastName",
                "NotBlank"
        );

        Assertions.assertTrue(constraintExists, "LastName must not be blank");
    }

    @Test
    public void clientWithTooLongLastName_shouldNotBeValid() {
        Client client = new Client();
        client.setLastName("a".repeat(128));

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client),
                "lastName",
                "Length"
        );

        Assertions.assertTrue(constraintExists, "LastName must be <= 127 characters");
    }

    // ---------- email ----------

    @Test
    public void clientWithInvalidEmail_shouldNotBeValid() {
        Client client = new Client();
        client.setEmail("invalid-email");

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client, OnCreate.class),
                "email",
                "Email"
        );

        Assertions.assertTrue(constraintExists, "Email must be valid");
    }

    @Test
    public void clientWithTooLongEmail_shouldNotBeValid() {
        Client client = new Client();
        client.setEmail("a".repeat(128) + "@test.com");

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client),
                "email",
                "Length"
        );

        Assertions.assertTrue(constraintExists, "Email must be <= 127 characters");
    }

    // ---------- phoneNumber ----------

    @Test
    public void clientWithTooLongPhoneNumber_shouldNotBeValid() {
        Client client = new Client();
        client.setPhoneNumber("1".repeat(32));

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client),
                "phoneNumber",
                "Length"
        );

        Assertions.assertTrue(constraintExists, "Phone number must be <= 31 characters");
    }

    // ---------- password ----------

    @Test
    public void clientWithBlankPassword_shouldNotBeValid() {
        Client client = new Client();
        client.setPassword("");

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client, OnCreate.class),
                "password",
                "NotBlank"
        );

        Assertions.assertTrue(constraintExists, "Password must not be blank");
    }

    @Test
    public void clientWithTooLongPassword_shouldNotBeValid() {
        Client client = new Client();
        client.setPassword("a".repeat(128));

        boolean constraintExists = TestUtils.constraintViolationExists(
                validator.validate(client),
                "password",
                "Length"
        );

        Assertions.assertTrue(constraintExists, "Password must be <= 127 characters");
    }

    // ---------- valid case ----------

    @Test
    public void clientWithValidData_shouldBeValid() {
        Client client = new Client();
        client.setFirstName("John");
        client.setLastName("Doe");
        client.setEmail("john.doe@test.com");
        client.setPhoneNumber("0123456789");
        client.setPassword("securePassword");

        boolean hasViolation = !validator.validate(client, OnCreate.class).isEmpty();

        Assertions.assertFalse(hasViolation, "Client should be valid");
    }
}