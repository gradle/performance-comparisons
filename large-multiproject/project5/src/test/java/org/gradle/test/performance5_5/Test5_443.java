package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_443 {
    private final Production5_443 production = new Production5_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}