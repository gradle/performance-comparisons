package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_272 {
    private final Production98_272 production = new Production98_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}