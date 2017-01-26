package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_121 {
    private final Production98_121 production = new Production98_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}