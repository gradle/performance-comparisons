package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_406 {
    private final Production82_406 production = new Production82_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}