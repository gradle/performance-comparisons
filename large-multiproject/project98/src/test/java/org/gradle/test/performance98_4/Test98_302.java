package org.gradle.test.performance98_4;

import static org.junit.Assert.*;

public class Test98_302 {
    private final Production98_302 production = new Production98_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}