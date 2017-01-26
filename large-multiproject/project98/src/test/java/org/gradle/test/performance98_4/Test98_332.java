package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_332 {
    private final Production98_332 production = new Production98_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}