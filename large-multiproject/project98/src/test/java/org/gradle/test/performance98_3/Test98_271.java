package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_271 {
    private final Production98_271 production = new Production98_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}