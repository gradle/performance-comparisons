package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_120 {
    private final Production98_120 production = new Production98_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}