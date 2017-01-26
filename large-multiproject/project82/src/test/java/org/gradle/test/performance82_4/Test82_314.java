package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_314 {
    private final Production82_314 production = new Production82_314("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}