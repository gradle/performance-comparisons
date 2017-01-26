package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_354 {
    private final Production98_354 production = new Production98_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}