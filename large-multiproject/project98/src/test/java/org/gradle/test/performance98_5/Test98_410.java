package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_410 {
    private final Production98_410 production = new Production98_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}