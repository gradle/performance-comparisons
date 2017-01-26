package org.gradle.test.performance82_4;

import static org.junit.Assert.*;

public class Test82_388 {
    private final Production82_388 production = new Production82_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}