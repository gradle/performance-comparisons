package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_248 {
    private final Production98_248 production = new Production98_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}