package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_490 {
    private final Production5_490 production = new Production5_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}