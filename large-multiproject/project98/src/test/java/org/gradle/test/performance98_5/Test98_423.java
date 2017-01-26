package org.gradle.test.performance98_5;

import static org.junit.Assert.*;

public class Test98_423 {
    private final Production98_423 production = new Production98_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}