package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_108 {
    private final Production98_108 production = new Production98_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}