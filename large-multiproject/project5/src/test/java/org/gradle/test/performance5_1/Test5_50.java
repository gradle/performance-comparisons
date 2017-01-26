package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_50 {
    private final Production5_50 production = new Production5_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}