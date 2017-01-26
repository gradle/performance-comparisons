package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_425 {
    private final Production82_425 production = new Production82_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}