package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_82 {
    private final Production82_82 production = new Production82_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}