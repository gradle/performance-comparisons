package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_282 {
    private final Production82_282 production = new Production82_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}