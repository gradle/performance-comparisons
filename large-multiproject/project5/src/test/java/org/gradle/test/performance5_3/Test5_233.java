package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_233 {
    private final Production5_233 production = new Production5_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}