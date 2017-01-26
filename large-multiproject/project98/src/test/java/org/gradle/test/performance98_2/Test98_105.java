package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_105 {
    private final Production98_105 production = new Production98_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}