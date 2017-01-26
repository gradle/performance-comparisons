package org.gradle.test.performance98_2;

import static org.junit.Assert.*;

public class Test98_148 {
    private final Production98_148 production = new Production98_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}