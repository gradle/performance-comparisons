package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_357 {
    private final Production98_357 production = new Production98_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}