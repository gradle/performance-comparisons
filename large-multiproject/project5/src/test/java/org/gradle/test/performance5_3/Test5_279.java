package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_279 {
    private final Production5_279 production = new Production5_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}