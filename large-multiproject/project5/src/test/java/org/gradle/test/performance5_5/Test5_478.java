package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_478 {
    private final Production5_478 production = new Production5_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}