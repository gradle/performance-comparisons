package org.gradle.test.performance80_5;

import static org.junit.Assert.*;

public class Test80_443 {
    private final Production80_443 production = new Production80_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}