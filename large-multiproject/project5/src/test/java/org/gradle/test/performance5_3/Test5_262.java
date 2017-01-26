package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_262 {
    private final Production5_262 production = new Production5_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}