package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_441 {
    private final Production98_441 production = new Production98_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}