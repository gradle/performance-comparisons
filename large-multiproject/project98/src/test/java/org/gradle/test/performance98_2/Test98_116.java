package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_116 {
    private final Production98_116 production = new Production98_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}