package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_103 {
    private final Production98_103 production = new Production98_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}