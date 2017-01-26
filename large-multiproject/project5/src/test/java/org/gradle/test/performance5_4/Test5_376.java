package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_376 {
    private final Production5_376 production = new Production5_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}