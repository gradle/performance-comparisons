package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_179 {
    private final Production98_179 production = new Production98_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}