package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_184 {
    private final Production98_184 production = new Production98_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}