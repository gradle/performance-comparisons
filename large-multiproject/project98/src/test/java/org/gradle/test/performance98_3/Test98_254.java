package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_254 {
    private final Production98_254 production = new Production98_254("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}