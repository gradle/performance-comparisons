package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_384 {
    private final Production98_384 production = new Production98_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}