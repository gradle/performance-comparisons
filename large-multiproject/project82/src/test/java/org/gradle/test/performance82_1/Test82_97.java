package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_97 {
    private final Production82_97 production = new Production82_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}