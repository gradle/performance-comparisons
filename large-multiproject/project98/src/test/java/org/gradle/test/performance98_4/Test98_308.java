package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_308 {
    private final Production98_308 production = new Production98_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}