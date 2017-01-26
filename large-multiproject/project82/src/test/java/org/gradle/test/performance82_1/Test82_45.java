package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_45 {
    private final Production82_45 production = new Production82_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}