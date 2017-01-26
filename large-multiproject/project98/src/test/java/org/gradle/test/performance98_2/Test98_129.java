package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_129 {
    private final Production98_129 production = new Production98_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}