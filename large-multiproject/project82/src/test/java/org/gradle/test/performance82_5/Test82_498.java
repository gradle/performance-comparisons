package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_498 {
    private final Production82_498 production = new Production82_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}