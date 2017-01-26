package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_288 {
    private final Production82_288 production = new Production82_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}