package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_340 {
    private final Production98_340 production = new Production98_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}