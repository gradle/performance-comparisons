package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_390 {
    private final Production82_390 production = new Production82_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}