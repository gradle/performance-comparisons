package org.gradle.test.performance82_2;

import static org.junit.Assert.*;

public class Test82_107 {
    private final Production82_107 production = new Production82_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}