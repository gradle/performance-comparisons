package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_225 {
    private final Production82_225 production = new Production82_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}