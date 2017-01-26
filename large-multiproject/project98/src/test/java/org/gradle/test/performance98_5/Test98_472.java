package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_472 {
    private final Production98_472 production = new Production98_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}