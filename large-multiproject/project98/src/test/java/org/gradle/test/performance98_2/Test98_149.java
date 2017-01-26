package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_149 {
    private final Production98_149 production = new Production98_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}