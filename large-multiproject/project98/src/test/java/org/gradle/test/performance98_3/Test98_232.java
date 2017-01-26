package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_232 {
    private final Production98_232 production = new Production98_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}