package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_381 {
    private final Production98_381 production = new Production98_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}