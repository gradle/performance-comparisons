package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_131 {
    private final Production98_131 production = new Production98_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}