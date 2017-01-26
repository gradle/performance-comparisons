package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_311 {
    private final Production98_311 production = new Production98_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}