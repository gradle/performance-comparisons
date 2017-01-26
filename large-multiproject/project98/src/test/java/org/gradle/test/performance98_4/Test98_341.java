package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_341 {
    private final Production98_341 production = new Production98_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}