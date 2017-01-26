package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_167 {
    private final Production82_167 production = new Production82_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}