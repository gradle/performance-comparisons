package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_342 {
    private final Production98_342 production = new Production98_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}