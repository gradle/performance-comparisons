package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_115 {
    private final Production98_115 production = new Production98_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}