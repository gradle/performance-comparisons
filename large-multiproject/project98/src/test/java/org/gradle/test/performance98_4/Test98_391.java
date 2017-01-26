package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_391 {
    private final Production98_391 production = new Production98_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}