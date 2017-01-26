package org.gradle.test.performance82_1;

import static org.junit.Assert.*;

public class Test82_77 {
    private final Production82_77 production = new Production82_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}