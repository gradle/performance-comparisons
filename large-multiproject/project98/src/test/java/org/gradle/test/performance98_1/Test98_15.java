package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_15 {
    private final Production98_15 production = new Production98_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}