package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_261 {
    private final Production98_261 production = new Production98_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}