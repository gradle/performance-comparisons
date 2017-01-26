package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_285 {
    private final Production88_285 production = new Production88_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}