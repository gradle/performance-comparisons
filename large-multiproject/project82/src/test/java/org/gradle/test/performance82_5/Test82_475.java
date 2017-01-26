package org.gradle.test.performance82_5;

import static org.junit.Assert.*;

public class Test82_475 {
    private final Production82_475 production = new Production82_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}