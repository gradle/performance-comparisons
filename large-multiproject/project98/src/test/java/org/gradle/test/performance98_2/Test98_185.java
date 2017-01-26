package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_185 {
    private final Production98_185 production = new Production98_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}