package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_117 {
    private final Production5_117 production = new Production5_117("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}