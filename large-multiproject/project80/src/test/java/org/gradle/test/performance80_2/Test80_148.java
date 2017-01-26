package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_148 {
    private final Production80_148 production = new Production80_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}