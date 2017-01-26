package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_148 {
    private final Production48_148 production = new Production48_148("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}