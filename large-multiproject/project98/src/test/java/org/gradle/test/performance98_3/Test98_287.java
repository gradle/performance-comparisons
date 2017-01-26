package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_287 {
    private final Production98_287 production = new Production98_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}