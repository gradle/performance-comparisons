package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_436 {
    private final Production98_436 production = new Production98_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}