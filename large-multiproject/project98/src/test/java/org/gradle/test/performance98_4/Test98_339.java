package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_339 {
    private final Production98_339 production = new Production98_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}