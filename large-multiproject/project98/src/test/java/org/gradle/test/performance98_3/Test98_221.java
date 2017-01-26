package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_221 {
    private final Production98_221 production = new Production98_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}