package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_62 {
    private final Production82_62 production = new Production82_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}