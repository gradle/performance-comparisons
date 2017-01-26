package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_295 {
    private final Production98_295 production = new Production98_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}