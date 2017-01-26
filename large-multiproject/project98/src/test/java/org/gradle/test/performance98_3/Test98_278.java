package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_278 {
    private final Production98_278 production = new Production98_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}