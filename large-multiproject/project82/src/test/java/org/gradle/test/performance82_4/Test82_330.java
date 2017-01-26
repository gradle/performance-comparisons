package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_330 {
    private final Production82_330 production = new Production82_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}