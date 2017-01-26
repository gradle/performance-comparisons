package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_237 {
    private final Production98_237 production = new Production98_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}