package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_276 {
    private final Production98_276 production = new Production98_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}