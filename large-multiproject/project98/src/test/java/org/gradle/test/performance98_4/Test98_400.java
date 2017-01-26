package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_400 {
    private final Production98_400 production = new Production98_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}