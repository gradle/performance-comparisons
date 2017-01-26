package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_473 {
    private final Production98_473 production = new Production98_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}