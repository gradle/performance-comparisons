package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_197 {
    private final Production98_197 production = new Production98_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}