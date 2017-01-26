package org.gradle.test.performance98_3;

import static org.junit.Assert.*;

public class Test98_201 {
    private final Production98_201 production = new Production98_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}