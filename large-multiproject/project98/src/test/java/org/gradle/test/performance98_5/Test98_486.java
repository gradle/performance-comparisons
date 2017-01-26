package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_486 {
    private final Production98_486 production = new Production98_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}