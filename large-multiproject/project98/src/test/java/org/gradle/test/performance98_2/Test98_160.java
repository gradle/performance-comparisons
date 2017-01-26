package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_160 {
    private final Production98_160 production = new Production98_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}