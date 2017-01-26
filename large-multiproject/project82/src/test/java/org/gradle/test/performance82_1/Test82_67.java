package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_67 {
    private final Production82_67 production = new Production82_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}