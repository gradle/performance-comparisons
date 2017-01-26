package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_285 {
    private final Production35_285 production = new Production35_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}