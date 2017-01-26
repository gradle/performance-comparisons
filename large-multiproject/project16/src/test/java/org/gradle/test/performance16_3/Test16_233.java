package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_233 {
    private final Production16_233 production = new Production16_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}