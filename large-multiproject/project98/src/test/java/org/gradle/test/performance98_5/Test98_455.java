package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_455 {
    private final Production98_455 production = new Production98_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}