package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_212 {
    private final Production82_212 production = new Production82_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}