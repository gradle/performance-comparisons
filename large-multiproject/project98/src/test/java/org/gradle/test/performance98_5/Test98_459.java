package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_459 {
    private final Production98_459 production = new Production98_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}