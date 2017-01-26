package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_64 {
    private final Production98_64 production = new Production98_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}