package org.gradle.test.performance82_3;

import static org.junit.Assert.*;

public class Test82_209 {
    private final Production82_209 production = new Production82_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}