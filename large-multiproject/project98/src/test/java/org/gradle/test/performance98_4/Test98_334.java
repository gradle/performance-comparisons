package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_334 {
    private final Production98_334 production = new Production98_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}