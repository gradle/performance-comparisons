package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_208 {
    private final Production98_208 production = new Production98_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}