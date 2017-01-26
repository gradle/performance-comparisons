package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_285 {
    private final Production5_285 production = new Production5_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}