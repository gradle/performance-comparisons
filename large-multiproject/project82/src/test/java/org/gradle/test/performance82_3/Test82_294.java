package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_294 {
    private final Production82_294 production = new Production82_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}