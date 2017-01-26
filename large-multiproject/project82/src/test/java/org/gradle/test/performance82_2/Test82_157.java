package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_157 {
    private final Production82_157 production = new Production82_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}