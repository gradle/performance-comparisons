package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_269 {
    private final Production82_269 production = new Production82_269("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}